/* SCRIPT "engine.jsp"
 * E' lo script che permette di calcolare il percorso tra le due località scelte,
 * impostare una velocità random ed effettuare lo spostamento dell'indicatore sulla
 * mappa.
 */

var stepspeed;
var mail;
var nome;
var sogliaone;
var sogliatwo;
var marker;

if (GBrowserIsCompatible()) {

	var map = new GMap2(document.getElementById("map"));
	map.addControl(new GMapTypeControl());
	map.setCenter(new GLatLng(0,0),2);
	var dirn = new GDirections();
	var step = 10; // metri
	var tick = 50; // millisecondi
	var poly;
	var eol;
	var car = new GIcon();
	car.image="images/samples/cip.jpg"
		car.iconSize=new GSize(30,50);
	car.iconAnchor=new GPoint(15,40);
	var k=0;
	var stepnum=0;
	var speed = "";   


	function animate(d) {

		if (d>eol) {
			document.getElementById("step").innerHTML = "<b>Auto ferma</b>";
			document.getElementById("distance").innerHTML = (d/1000).toFixed(2);
			return;

		}

		var p = poly.GetPointAtDistance(d);

		if (k++>=0.5/step) {
			map.panTo(p);
			k=0;
		}

		marker.setPoint(p);
		document.getElementById("distanza").innerHTML =  (d/1000).toFixed(2) +" KM";

		if (stepnum+1 < dirn.getRoute(0).getNumSteps()) {
			if (dirn.getRoute(0).getStep(stepnum).getPolylineIndex() < poly.GetIndexAtDistance(d)) {
				stepnum++;

				var stepdist = dirn.getRoute(0).getStep(stepnum-1).getDistance().meters;
				var steptime = dirn.getRoute(0).getStep(stepnum-1).getDuration().seconds;
				step = stepspeed/70.0;

				//velocità attuale
				document.getElementById("speed").innerHTML = stepspeed +" KM/h";

			}

		} 

		setTimeout("animate("+(d+step)+")", tick);

	}


	GEvent.addListener(dirn,"load", function() {
		document.getElementById("controls").style.display="none";
		poly=dirn.getPolyline();
		eol=poly.Distance();
		map.setCenter(poly.getVertex(0),17);
		map.addOverlay(new GMarker(poly.getVertex(0),G_START_ICON));
		map.addOverlay(new GMarker(poly.getVertex(poly.getVertexCount()-1),G_END_ICON));
		marker = new GMarker(poly.getVertex(0),{icon:car});
		map.addOverlay(marker);
		document.getElementById("step").innerHTML = "";
		setTimeout("animate(0)",3000);  

	});

	GEvent.addListener(dirn,"error", function() {
		alert("Location(s) not recognised. Code: "+dirn.getStatus().code);

	});

	function messSuperamento1() {
	
		if ( parseFloat(sogliaone) < parseFloat(stepspeed)){
		
			alert("Soglia email superata-invio email");
			//document.getElementsByClassName("btn btn-red waves-button waves-effect waves-light")[1].click();
			//var snd = new Audio("audio/popup.mp3");
			//snd.play();
			sendingMail(mail,marker.getPoint().lat(),marker.getPoint().lng());
		}

	}

	function messSuperamento2(){

		if (parseFloat(sogliatwo) < parseFloat(stepspeed)){
			alert("Soglia sms superata-invio sms");
			
			//document.getElementsByClassName("btn btn-red waves-button waves-effect waves-light")[2].click();
			location.href="gallery.jsp";
			//var snd = new Audio("audio/notifica2.wav");
			//snd.play();
		}
	}

	function start(posiniziale,posfinale,soglia_mail,soglia_sms,speed,nome,email) {

		mail = email;
		nome = name;
		sogliaone = soglia_mail;
		sogliatwo = soglia_sms;
		stepspeed = speed;
		window.setTimeout("messSuperamento1()", 10000);
		window.setTimeout("messSuperamento2()", 20000);
		var startpoint = posiniziale;
		var endpoint = posfinale;
		dirn.loadFromWaypoints([startpoint,endpoint],{getPolyline:true,getSteps:true});

	}

}



function sendingMail(a,b,c){
	$.ajax({
		type: "POST",
		url: "https://mandrillapp.com/api/1.0/messages/send.json",
		data: {
			'key': 'dS1-S4X_hBsL2x_5pe4a8A',
			'message': {
				'from_email': 'cla.biondi2104@gmail.com',
				'to': [
				       {
				    	   'email': a,
				    	   'type': 'to'
				       }
				       ],
				       'subject': 'ProjectCipCip - Avviso superamento soglia',
				       'html': 'Salve; <br/><br/> La soglia per email � stata superata! <br/><br/> Posizione Veicolo:<br/>Latitudine:'+b+'<br/> Longitudine:'+c+'<br/><br/>-- ProjectCipCip --'
			}
		}
	});
}

