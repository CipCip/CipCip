<%@ include file="headDashboard.jsp"%>

<div class="container-fluid">
	<div class="row">
		<div class="col-sm-3 col-md-2 sidebar">
			<ul class="nav nav-sidebar">
				<li><a href="dashboard.jsp">Dashboard</a></li>
				<li class="active"><a href="#">Impostazioni <span
						class="sr-only">(current)</span></a></li>
				<li><a href="#">Avvisi</a></li>
				<li><a href="#">Media</a></li>
				<li><a href="#">Help</a></li>
			</ul>


		</div>
		<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
			<h1 class="page-header">Impostazioni</h1>




			<div id="form-main">
				<div id="form-div">
					<form  method="POST" action="loginServlet" class="form" id="form1">
						

						<p class="email">
							<input name="email" type="text"
								class="feedback-input"
								id="email" placeholder="Email" />
						</p>

						<p class="phone">
							<input name="phone" type="text"
								class="feedback-input"
								id="phone" placeholder="Telefono" />
						</p>
						
						<p class="email">
							<input name="phone" type="number"
								class="feedback-input"
								id="email" placeholder="Avviso email" />
						</p>
						
						<p class="phone">
							<input name="phone" type="number"
								class="feedback-input"
								id="phone" placeholder="Avviso SMS" />
						</p>
						
						<p class="targa">
							<input name="email" type="text"
								class="feedback-input"
								id="targa" placeholder="Cambia targa" />
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
