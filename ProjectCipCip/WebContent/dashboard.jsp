<%@ include file="headDashboard.jsp"%>

<div class="container-fluid">
	<div class="row">
		<div class="col-sm-3 col-md-2 sidebar">
			<ul class="nav nav-sidebar">
				<li class="active"><a href="#">Dashboard <span
						class="sr-only">(current)</span></a></li>
				<li><a href="impostazioni.jsp">Impostazioni</a></li>
				<li><a href="avvisi.jsp">Avvisi</a></li>
				<li><a href="gallery.jsp">Gallery</a></li>
				<li><a href="#">Help</a></li>
			</ul>

		</div>
		<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
			<h1 class="page-header">Dashboard</h1>


			<div class="row">

				<div class="col-md-8">

					<iframe
						src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d89605.16059904924!2d10.9925313!3d45.42625035!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0000000000000000%3A0xbc2dfbab240120cb!2sPorta+Nuova!5e0!3m2!1sit!2sit!4v1435753132682"
						width="600" height="450" frameborder="0" style="border: 0"
						allowfullscreen></iframe>
				</div>

				<div class="col-md-4">
					<table class="table">
					<caption>Report</caption>
						<thead>
							<tr>
								<th>Velocità</th>
								<th>Chilometri percorsi</th>								
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>130 km/h</td>
								<td>40 km</td>								
							</tr>
						</tbody>
					</table>
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
