<%@ include file="headDashboard.jsp"%>

<div class="container-fluid">
	<div class="row">
		<div class="col-sm-3 col-md-2 sidebar">
			<ul class="nav nav-sidebar">
				<li><a href="dashboardAmministrazione.jsp">Utenti</a></li>
				<li><a href="eliminaUtente.jsp">Elimina utente</a></li>
				<li class="active"><a href="veicoliAmministrazione.jsp">Veicoli
						<span class="sr-only">(current)</span>
						<li><a href="eliminaVeicolo.jsp">Elimina veicolo</a></li>
				</a></li>
				<li><a href="impostazioniAmministrazione.jsp">Profilo personale</a></li>
				<li><a href="notificheClienti.jsp">Notifiche clienti</a></li>
			</ul>

		</div>
		<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
			<h1 class="page-header">Gestione veicolo <%=request.getParameter("rdbSelezione")%></h1>
				<% String a = request.getParameter("rdbSelezione");
				request.getSession().setAttribute("rdbSelezione",
						a);
						 %>


			<div id="form-main">
				<div id="form-div">
					<form method="POST" action="CarAmminServlet" class="form" id="form1">

						<p class="targa">
							<input name="targa" type="text" class="feedback-input" id="targa"
								placeholder="Modifica targa" />
						</p>
						
						<p class="marca">
							<input name="marca" type="text" class="feedback-input" id="marca"
								placeholder="Modifica marca" />
						</p>
						
						<p class="modello">
							<input name="modello" type="text" class="feedback-input"
								id="modello" placeholder="Modifica modello" />
						</p>
						
						<p class="date">
							<input name="data_immatricolazione" type="text" onfocus="(this.type='month')"
								class="feedback-input" id="data_immatricolazione" placeholder="Modifica data di immatricolazione" /> 
								
						</p>
						
						<p class="velocità">
							<input name="soglia_mail" type="number" min="1" max="350" class="feedback-input"
								id="soglia_mail" placeholder="Modifica velocità per email" />
						</p>
						
						<p class="velocità">
							<input name="soglia_sms" type="number" min="1" max="350" class="feedback-input"
								id="soglia_sms" placeholder="Modifica velocità per sms" />
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
