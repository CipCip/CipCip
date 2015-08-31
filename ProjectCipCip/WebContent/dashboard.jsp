<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- 
Il file Mappa.jsp viene chiamato al click su "Localizzazione" dal menu 
principale e fa apparire la mappa prelevata da Google Maps attraverso le
API di Google. Premendo il pulsante "Localizza veicolo" verrà chiamata la
funzione di avvio contenuta nello script "engine.js" che carica il percorso
scelto casualmente, che a sua volta carica lo script "epoly.js" permettendo
così di vedere l'indicatore sulla mappa muoversi.
-->

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
            <input type="submit" name="Logout" value="Logout"></form></li>
            
            
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
	<!-- cancella fin qui -->
	<div class="content">
		<div class="content-heading">
			<div class="container">
				<h1 class="heading">Mappa</h1>
			</div>
		</div>
	</div>
	<div class="content">
		<div class="content-inner">
			<div class="container">
				<div class="row">
					<div class="col-lg-4 col-sm-15">
						<div class="card-wrap">
							<div class="card">
								<div class="card-main">
									<div class="card-header">
										<div class="card-inner">
											<p class="card-heading">Localizzazione Veicolo</p>

											<!-- JAVASCRIPT CHE CARICA LA MAPPA DALLE API DI GOOGLE -->

											<script
												src="http://maps.google.com/maps?file=api&amp;v=2&amp;key=ABQIAAAAi_x03rBPvcUzObU_OU5Z_RRMrZ4ZiepwBPC13G1CO0mIcOaHJBSF-jlBQxmGDKmcezkCQdycMczfaQ"
												type="text/javascript"></script>

											<!-- JAVASCRIPT CHE CARICA LO SCRIPT PER IL POSIZIONAMENTO DELL'INDICATORE -->
											<script src="js/epoly.js" type="text/javascript"></script>

											<!-- JAVASCRIPT CHE CARICA LO SCRIPT IN JQUERY PER L'INVIO DELLA MAIL -->

											<script
												src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js">
											</script>

											<div align="center" style="width: 100%; height: 50px">
												<div id="controls" style="width: 100%; height: 100%">

													<form
														onsubmit="start('<%=session.getAttribute("posiniziale")%>','<%=session.getAttribute("posfinale")%>',
														'<%=session.getAttribute("soglia_mail")%>','<%=session.getAttribute("soglia_sms")%>',
														'<%=session.getAttribute("speed")%>','<%=session.getAttribute("nome")%>',
														'<%=session.getAttribute("email")%>');return false">

														<button
															class="btn btn-red waves-button waves-effect waves-light"
															type="submit" value="Submit">Localizza il
															veicolo</button>
													</form>
												</div>
											</div>

											<div align="center" style="width: 100%; height: 450px">

												<div id="map" style="width: 100%; height: 100%"></div>

												<div class="style1" id="step">&nbsp;</div>

												<span class="style1"> <!-- JAVASCRIPT CHE CARICA IL MOTORE PER MUOVERE L'INDICATORE + ESECUZIONE MAIL -->
													<script src="js/engine.js" type="text/javascript"> </script>

												</span>
												<button class="waves-effect waves-light" data-toggle="toast"
													title="E' stata superata la prima soglia. Verrà mandata un'email sull'account di posta registrato."
													hidden="hidden"></button>
												<button class="waves-effect waves-light" data-toggle="toast"
													title="ATTENZIONE! PROBABILE FURTO DELL'AUTO! E' stata superata la seconda soglia. Verrà mandato un'SMS immediatamente!"
													hidden="hidden"></button>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- VIDEO 
	<div aria-hidden="true" class="modal fade" id="video" role="dialog"
		tabindex="-1">
		<div class="modal-dialog modal-full">
			<div class="modal-content">
				<iframe class="iframe-seamless" src="Video.jsp"
					title="Video sorveglianza"></iframe>
			</div>
		</div>
	</div>-->


<form method="post" action="CipCipServlet" class="form" id="form1">
								<button class="btn btn-red waves-button waves-effect waves-light" type="submit" value="Submit">Inizia simulazione</button>
											</form></div>

	<div class="fbtn-container-2">
		<div class="fbtn-inner">
			<a class="fbtn fbtn-red fbtn-lg" data-toggle="dropdown"><span class="fbtn-text">Velocità</span>
			<span class="fbtn-ori fa fa-tachometer"></span><span class="fbtn-sub icon icon-close"></span></a>
			<div class="fbtn-dropdown">
				<a class="fbtn fbtn-alt"><span id="distanza" class="fbtn-text"></span><span class="fa fa-road"></span></a> 
				<a class="fbtn fbtn-alt"><span id="speed" class="fbtn-text"></span><span class="fa fa-tachometer"></span></a>
			</div>
		</div>
	</div>

	<div class="fbtn-container">
		<div class="fbtn-inner">
			<a class="fbtn fbtn-blue fbtn-lg" data-toggle="dropdown"><span class="fbtn-text">Altro</span>
			<span class="fbtn-ori fa fa-chevron-up"></span><span class="fbtn-sub icon icon-close"></span></a>
			<div class="fbtn-dropdown">
				<a class="fbtn fbtn-alt" data-toggle="modal" href="#video">
					<span class="fbtn-text">Visione video</span><span class="icon icon-videocam"></span></a>
			</div>
		</div>
	</div>

	<!--  <script src="js/base.min.js" type="text/javascript"></script>

	<script src="js/dynamic.js"></script>-->
</body>
</html>