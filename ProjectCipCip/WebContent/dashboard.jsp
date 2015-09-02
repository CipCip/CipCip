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
 
 
 
 
<body>
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" >
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
           
            <li><form  method="POST" action="LogoutServlet" class="form" id="form1">
            <!-- <input type="submit" name="Logout" value="Logout"> -->
            </br>
           <button class="btn btn-red waves-button waves-effect waves-light" type="submit" value="Submit">Logout</button>
           </form></li>
          </ul>          
        </div>
      </div>
    </nav>
   
 
        <div class="container-fluid">
                <div class="row">
                        <div class="col-sm-3 col-md-2 sidebar">
                                <ul class="nav nav-sidebar">
                                                                       
                                        <li class="active"><a href="#">Dashboard <span
                                                        class="sr-only">(current)</span></a></li>                                      
                                        <li><a href="impostazioni.jsp">Inserisci o modifica impostazioni personali</a></li>
                                        <li><a href="veicolo.jsp">Inserisci o modifica dati veicolo</a></li>
                                        <li><a href="rimuoviVeicolo.jsp">Rimuovi veicolo</a></li>
                                        <li><a href="avvisi.jsp">Avvisi</a></li>
                                        <li><a href="gallery.jsp">Gallery</a></li>
                                        <li><a href="#">Help</a></li>
                                </ul>
                        </div>
                </div>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
                <h1 class="page-header">Localizzazione veicolo: <%=session.getAttribute("targa") %>  </h1>
               
                <!-- JAVASCRIPT CHE CARICA LA MAPPA DALLE API DI GOOGLE -->
 
                 <script src="http://maps.google.com/maps?file=api&amp;v=2&amp;key=ABQIAAAAi_x03rBPvcUzObU_OU5Z_RRMrZ4ZiepwBPC13G1CO0mIcOaHJBSF-jlBQxmGDKmcezkCQdycMczfaQ" type="text/javascript"></script>
               
                <!-- JAVASCRIPT CHE CARICA LO SCRIPT PER IL POSIZIONAMENTO DELL'INDICATORE -->
                       
                 <script src="js/epoly.js" type="text/javascript"></script>
 
                <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
 
                               <div align="center" style="width: 100%; height: 50px">
                                       <div id="controls" style="width: 100%; height: 100%">
 
                                       	<form onsubmit="start('<%=session.getAttribute("posiniziale")%>','<%=session.getAttribute("posfinale")%>','<%=session.getAttribute("soglia_mail")%>','<%=session.getAttribute("soglia_sms")%>','<%=session.getAttribute("speed")%>','<%=session.getAttribute("nome")%>','<%=session.getAttribute("email")%>');return false">
 
                                      	<button class="btn btn-red waves-button waves-effect waves-light" type="submit" value="Submit">Localizza il veicolo</button>
                                        </form>
                                                </div>
                                </div>
 
                                                                                        <div align="center" style="width: 100%; height: 450px">
 
                                                                                                <div id="map" style="width: 100%; height: 100%"></div>
 
                                                                                                <div class="style1" id="step">&nbsp;</div>
 
                                                                                                <span class="style1">
                                                                                                
                                                                                                <!-- JAVASCRIPT CHE CARICA IL MOTORE PER MUOVERE L'INDICATORE + ESECUZIONE MAIL -->
                                                                                                <script src="js/engine.js" type="text/javascript"> </script>
 
                                                                                                </span>
                                                                                                <button class="btn btn-red waves-button waves-effect waves-light" data-toggle="toast"
                                                                                                        title="E' stata superata la prima soglia. Verrà mandata un'email sull'account di posta registrato."
                                                                                                        hidden="hidden"></button>
                                                                                                <button class="btn btn-red waves-button waves-effect waves-light" data-toggle="toast"
                                                                                                        title="ATTENZIONE! PROBABILE FURTO DELL'AUTO! E' stata superata la seconda soglia. Verrà mandato un'SMS immediatamente!"
                                                                                                        hidden="hidden"></button>
                                                                                        </div>
                                       
 
 <div class="fbtn-container-2">
		<div class="fbtn-inner">
			<a class="fbtn fbtn-red fbtn-lg" data-toggle="dropdown"><span class="fbtn-text"></span>
			<span class="fbtn-ori fa fa-tachometer"></span><span class="fbtn-sub icon icon-close"></span></a>
			<div class="fbtn-dropdown">
			</br>
				<a class="fbtn fbtn-alt"><span id="distanza" class="fbtn-text"></span><span class="fa fa-road"></span></a> 
				</br></br>
				<a class="fbtn fbtn-alt"><span id="speed" class="fbtn-text"></span><span class="fa fa-tachometer"></span></a>
			</div>
		</div>
	</div>
 </br>
                               
                                       
                                                        <form method="post" action="CipCipServlet" class="form" id="form1">
                                                                <button class="btn btn-red waves-button waves-effect waves-light" type="submit" value="Submit">Inizia simulazione</button>
                                                                                        </form></div>
 
                       
</body>
</html>