<%@ include file="headDashboard.jsp"%>

<div class="container-fluid">
	<div class="row">
		<div class="col-sm-3 col-md-2 sidebar">
			<ul class="nav nav-sidebar">				
				<li><a href="dashboardAmministrazione.jsp">Utenti</a></li>
				<li><a href="veicoliAmministrazione.jsp">Veicoli</a></li>
				<li class="active"><a href="#">Profilo personale<span
						class="sr-only">(current)</span></a></li>
			</ul>

		</div>
		<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
			<h1 class="page-header">Profilo personale</h1>




			<div id="form-main">
				<div id="form-div">
					<form  method="POST" action="" class="form" id="form1">
						

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
