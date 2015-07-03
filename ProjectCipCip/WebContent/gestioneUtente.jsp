<%@ include file="headDashboard.jsp"%>

<div class="container-fluid">
	<div class="row">
		<div class="col-sm-3 col-md-2 sidebar">
			<ul class="nav nav-sidebar">
				<li class="active"><a href="dashboardAmministrazione.jsp">Utenti <span
						class="sr-only">(current)</span></a></li>
				<li><a href="veicoliAmministrazione.jsp">Veicoli</a></li>
				<li><a href="impostazioniAmministrazione.jsp">Profilo personale</a></li>
			</ul>

		</div>
		
		<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
			
		
				<h1 class="page-header">Gestione utente <%=request.getParameter("rdbSelezione")%></h1>
				<% String a = request.getParameter("rdbSelezione");
				request.getSession().setAttribute("rdbSelezione",
						a);
						 %>

<div id="form-main">
				<div id="form-div">
					<form  method="POST" action="ModificaUtenteServlet" class="form" id="form1">
						

						<p class="email">
							<input name="email" type="text"
								class="feedback-input"
								id="email" placeholder="Modifica email" />
								
						</p>
						
						<!-- la targa meglio di no ho già troppi elementi da gestire che mi arrivano dalla pagina precedente -->
						<p class="targa">
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
							<input name="nome" type="text"
								class="feedback-input"
								id="nome" min="1" max="450" placeholder="Modifica Nome" />
						</p>
						
						<p class="phone">
							<input name="cognome" type="text"
								class="feedback-input"
								id="cognome" min="1" max="450" placeholder="Modifica Cognome" />
						</p>
						
						
						
						
						
						

						<div class="submit">
							<input style="margin-bottom: 15px;" type="submit" value="aggiorna"
								id="button-blue" />
							<div class="ease"></div>
						</div>
						
						<div class="submit">
							<a style="text-align: center "id="button-red" href="#">elimina utente</a>
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
