<%@ include file="headDashboard.jsp"%>

<div class="container-fluid">
	<div class="row">
		<div class="col-sm-3 col-md-2 sidebar">
			<ul class="nav nav-sidebar">
				<li><a href="dashboard.jsp">Dashboard</a></li>
				<li class="active"><a href="#">Impostazioni </a></li>
				<li><a href="veicolo.jsp">Veicolo<span
						class="sr-only">(current)</span></a></li>
				<li><a href="avvisi.jsp">Avvisi</a></li>
				<li><a href="gallery.jsp">Gallery</a></li>
				<li><a href="#">Help</a></li>
			</ul>


		</div>
		<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
			<h1 class="page-header">Veicolo</h1>




			<div id="form-main">
				<div id="form-div">
					<form  method="POST" action="VeicoloServlet" class="form" id="form1">
						
						<!-- Mauri targa -->
						<p class="targa">
							<input name="targa" type="text"
								class="feedback-input"
								id="targa" placeholder="Inserisci targa" />
								
						</p>
						<!-- Mauri marca -->
						<p class="marca">
							<input name="marca" type="text"
								class="feedback-input"
								id="marca" placeholder="Inserisci marca del veicolo" />
						</p>
						<!-- Mauri modello -->		
						<p class="modello">
							<input name="modello" type="number"
								class="feedback-input"
								id="modello" min="1" max="450" placeholder="Inserisci modello del veicolo" />
						</p>
						<!-- Mauri data immatricolazione -->
						<p class="date">
							<input name="data" type="number"
								class="feedback-input"
								id="data_immatricolazione" min="1" max="450" placeholder="Inserisci data di immatricolazione" />
						</p>
						<!-- Mauri Soglia velocità email -->
						<p class="velocità">
							<input style="text-transform:uppercase" minlength="6" maxlength="7" name="email" type="text"
								class="feedback-input"
								id="soglia_email" placeholder="Soglia velocità per email" />
						</p>
						<!-- Mauri Soglia velocità sms -->
						<p class="velocità">
							<input style="text-transform:uppercase" minlength="6" maxlength="7" name="email" type="text"
								class="feedback-input"
								id="soglia_sms" placeholder="Soglia velocità per sms" />
						</p>
						
						
						
						

						<div class="submit">
							<input style="margin-bottom: 15px;" type="submit" value="salva"
								id="button-blue" />
							<div class="ease"></div>
						</div>
						
						<div class="submit">
							<a style="text-align: center "id="button-red" href="#">cancellati</a>
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
