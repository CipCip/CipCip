<%@ include file="headDashboard.jsp"%>

<div class="container-fluid">
	<div class="row">
		<div class="col-sm-3 col-md-2 sidebar">
			<ul class="nav nav-sidebar">
				<li><a href="dashboard.jsp">Dashboard</a></li>
				<li class="active"><a href="#">Inserisci o modifica impostazioni personali<span
						class="sr-only">(current)</span></a></li>
				<li><a href="veicolo.jsp">Inserisci o modifica dati veicolo</a></li>
				<li><a href="rimuoviVeicolo.jsp">Rimuovi veicolo</a></li>
				<li><a href="avvisi.jsp">Avvisi</a></li>
				<li><a href="gallery.jsp">Gallery</a></li>
				<li><a href="help.jsp">Help</a></li>
			</ul>


		</div>
		<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
			<h1 class="page-header">Inserisci impostazioni personali</h1>
			<h4 class="page-header">Dovrai compilare interamente il post</h1>




			<div id="form-main">
				<div id="form-div">
					<form  method="POST" action="ImpostazioniServlet" class="form" id="form1">
						
						<p class="targa">
							<input style="text-transform:uppercase" minlength="6" maxlength="7" name="targa" type="text"
								class="feedback-input"
								id="targa" placeholder="Conferma targa inserita" />
						</p>
						
						<p class="email">
							<input name="password" type="text"
								class="feedback-input"
								id="password" placeholder="Modifica password" />
								
						</p>

						<p class="phone">
							<input name="cellulare" type="text"
								class="feedback-input"
								id="cellulare" placeholder="Modifica numero di telefono" />
						</p>
						
						<p class="email">
							<input name="soglia_mail" type="text"
								class="feedback-input"
								id="soglia_mail" min="1" max="450" placeholder="Modifica soglia velocità per email" />
						</p>
						
						<p class="phone">
							<input name="soglia_sms" type="text"
								class="feedback-input"
								id="soglia_sms" min="1" max="450" placeholder="Modifica soglia velocità per SMS" />
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
