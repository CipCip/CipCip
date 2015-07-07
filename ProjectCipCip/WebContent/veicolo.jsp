<%@ include file="headDashboard.jsp"%>

<div class="container-fluid">
	<div class="row">
		<div class="col-sm-3 col-md-2 sidebar">
			<ul class="nav nav-sidebar">
				<li><a href="dashboard.jsp">Dashboard</a></li>
				<li><a href="impostazioni.jsp">Impostazioni </a></li>
				<li class="active"><a href="#">Aggiungi veicolo<span class="sr-only">(current)</span></a></li>
				<li><a href="rimuoviVeicolo.jsp">Rimuovi veicolo</a></li>
				<li><a href="avvisi.jsp">Avvisi</a></li>
				<li><a href="gallery.jsp">Gallery</a></li>
				<li><a href="help.jsp">Help</a></li>
			</ul>


		</div>
		<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
			<h1 class="page-header">Aggiungi veicolo</h1>




			<div id="form-main">
				<div id="form-div">
					<form method="POST" action="VeicoloServlet" class="form" id="form1">

						
						<p class="targa">
							<input name="targa" type="text" class="feedback-input"
								style="text-transform:uppercase" minlength="6" maxlength="7" id="targa"
								placeholder="Inserisci targa" />
								
								
								

						</p>
						
						<p class="marca">
							<input name="marca" type="text" class="feedback-input" id="marca"
								placeholder="Inserisci marca del veicolo" />
						</p>
						
						<p class="modello">
							<input name="modello" type="text" class="feedback-input"
								id="modello" placeholder="Inserisci modello del veicolo" />
						</p>
						
						<p class="date">
							<input name="data_immatricolazione" type="text" onfocus="(this.type='month')"
								class="feedback-input" id="data_immatricolazione" placeholder="Inserisci data di immatricolazione" /> 
								
						</p>
						
						<p class="velocità">
							<input name="soglia_mail" type="number" min="1" max="350" class="feedback-input"
								id="soglia_mail" placeholder="Soglia velocità per email" />
						</p>
						
						<p class="velocità">
							<input name="soglia_sms" type="number" min="1" max="350" class="feedback-input"
								id="soglia_sms" placeholder="Soglia velocità per sms" />
						</p>





						<div class="submit">
							<input style="margin-bottom: 15px;" type="submit" value="salva"
								id="button-blue" />
							<div class="ease"></div>
						</div>


					</form>

				</div>
			</div>




		</div>
	</div>
</div>

<!-- Bootstrap core JavaScript
    ================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- Just to make our placeholder images work. Don't actually copy the next line! -->
<script src="../../assets/js/vendor/holder.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
