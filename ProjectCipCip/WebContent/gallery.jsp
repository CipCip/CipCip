<%@ include file="headDashboard.jsp"%>

<div class="container-fluid">
	<div class="row">
		<div class="col-sm-3 col-md-2 sidebar">
			<ul class="nav nav-sidebar">
				<li><a href="dashboard.jsp">Dashboard</a></li>
				<li><a href="impostazioni.jsp">Inserisci o modifica impostazioni personali</a></li>
				<li><a href="veicolo.jsp">Inserisci o modifica dati veicolo</a></li>
				<li><a href="rimuoviVeicolo.jsp">Rimuovi veicolo</a></li>
				<li><a href="avvisi.jsp">Avvisi</a></li>
				<li class="active"><a href="gallery.jsp">Gallery <span
						class="sr-only">(current)</span></a></li>
				<li><a href="help.jsp">Help</a></li>
			</ul>


		</div>
		<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
			<h1 class="page-header">Gallery</h1>

			<div class="row">


				<div class="col-lg-3 col-md-4 col-xs-6 thumb">
					<!--  <a class="thumbnail" href="#"> -->
					<!--  <img class="img-responsive" src="http://placehold.it/400x300" alt=""> -->
						<object data="images/samples/Filmato.mp4" type="video/mpeg">
  							<param name="autostart" value="true">
  							<param name="loop" value="true">
  							<param name="src" value="images/samples/Filmato.mp4">
  							<embed src="images/samples/Filmato.mp4" autostart="true" loop="true"></embed>
						</object>
					
				</div>
	
			</div>
		</div>
	</div>
</div>