<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="it">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

<title>Cip Cip</title>

<!-- Bootstrap core CSS -->
<link href="bower_components/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link href="style/dashboard.css" rel="stylesheet">


<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
<link rel="shortcut icon" type="image/png"
	href="http://www.mammagallo.com/wp-content/uploads/2015/02/Twitter-logo.jpg" />


<script type="text/javascript"
	src="http://maps.googleapis.com/maps/api/js?sensor=false">
    </script>
<script type="text/javascript">
var map,geocoder;
var GPSClientArray=new Array();
var index=0;

function focusTarget(address,zoom)
{ 
    geocoder.geocode( { 'address': address}, function(results, status) {
      if (status == google.maps.GeocoderStatus.OK) {
        map.setCenter(results[0].geometry.location);
        map.setZoom(zoom);
      } else {
        alert("Geocode was not successful for the following reason: " + status);
      }
    });
}

 function initialize() {
        var myOptions = {
          zoom: 4,
          mapTypeId: google.maps.MapTypeId.ROADMAP
        };
         map= new google.maps.Map(document.getElementById("map_canvas"),
            myOptions);
 var rendererOptions = {
      map: map
    }
geocoder = new google.maps.Geocoder();
focusTarget('srirangam',13);
      }


function getPath(obj)
{
obj.xmlHttp.onreadystatechange=function() {
if(obj.xmlHttp.readyState==4)
{
obj.jsonObject= eval('(' + obj.xmlHttp.responseText + ')');
obj.ready=1;
}
};
obj.xmlHttp.open("GET",'mock_route.json',true);
obj.xmlHttp.send(null);
}
function GetXmlHttpObject(obj)
{
try
  {
  obj.xmlHttp=new XMLHttpRequest();
  }
catch (e)
  {
  try
    {
    obj.xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
    }
  catch (e)
    {
    obj.xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
    }
  }
}

function startRender()
{
for(var i=0;i<=index;i++)
{
if(GPSClientArray[i].ready==1)
{
decode(GPSClientArray[i]);
}
}
}

function decode(obj) {
if(obj.count==0)
{
var instring=obj.jsonObject.routes[0].legs[0].steps[obj.nopath].polyline.points;
if(instring==null || instring=="")
{
obj.ready=0;
}
instring = instring.replace(/\\\\/g, "\\");  
obj.points = decodeLine(instring);
instring="";
} 
if(obj.count<obj.points.length-1)
{
obj.marker.setMap(null);
var coord = [
new google.maps.LatLng(obj.points[obj.count][0],obj.points[obj.count][1]),
new google.maps.LatLng(obj.points[obj.count+1][0],obj.points[obj.count+1][1]),
];
var path = new google.maps.Polyline({
      path: coord,
      strokeColor: obj.color,
      strokeOpacity: 1,
      strokeWeight: 3
    });
   path.setMap(map);
obj.marker = new google.maps.Marker({
        position: coord[1],
        map: map,
        title: obj.name
    });
    google.maps.event.addListener(obj.marker, 'dblclick', function() {
      alert(obj.info());
    });
  obj.count++;
}
else
{
obj.nopath++;
obj.count=0;
}
}

function decodeLine(encoded) {
  var len = encoded.length;
  var index = 0;
  var array = [];
  var lat = 0;
  var lng = 0;

  while (index < len) {
    var b;
    var shift = 0;
    var result = 0;
    do {
      b = encoded.charCodeAt(index++) - 63;
      result |= (b & 0x1f) << shift;
      shift += 5;
    } while (b >= 0x20);
    var dlat = ((result & 1) ? ~(result >> 1) : (result >> 1));
    lat += dlat;

    shift = 0;
    result = 0;
    do {
      b = encoded.charCodeAt(index++) - 63;
      result |= (b & 0x1f) << shift;
      shift += 5;
    } while (b >= 0x20);
    var dlng = ((result & 1) ? ~(result >> 1) : (result >> 1));
    lng += dlng;

    array.push([lat * 1e-5, lng * 1e-5]);
  }

  return array;
}

function GPSClient(name,color,origin,destination,waypoints)
{
this.name=name;
this.color=color;
this.origin=origin;
this.destination=destination;
this.waypoints=waypoints;
this.i=0;
this.jsonObject;
this.xmlHttp;
this.points;
this.count=0;
this.nopath=0;
this.ready=0;
this.marker= new google.maps.Marker();
this.info=function()
{
return "Name: "+this.name+"\nOrigin: "+this.origin+"\nDestination: "+this.destination+"\nWaypoints: "+waypoints;
}
}

function GPSClientInit(obj)
{
GetXmlHttpObject(obj);
getPath(obj);
}

function addGPSClient()
{
/*This client is dummy as mock_path.json is a hard coded path. This is because AJAX cannot reference
the URL http://maps.googleapis.com/maps/api/directions/json?origin=srirangam&destination=trichy&sensor=false
directly, you need a programming language like PHP, Java to proxy the result for you so that you can access
the data in your own domain like localhost/proxy?params
*/
GPSClientArray[index]=new GPSClient('sriram','#FF0000','srirangam','trichy');
GPSClientInit(GPSClientArray[index]);
index++;
}

function dummyStart()
{
addGPSClient();
self.setInterval("startRender()",500);
}
    </script>
</head>

<body onload="javascript:initialize();">
	<form  method="POST" action="LogoutServlet" class="form" id="form1">
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <p style="color: white" class="navbar-brand">Cip Cip</p>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            
            <li><input type="submit" name="Logout" value="Logout"></li>
            
            
          </ul>          
        </div>
      </div>
    </nav>
    </form>


	