<%@ include file="headDashboard.jsp"%>
<script type="text/javascript" src="js/mailAmministratore.js"></script>
<body>
<div class="container-fluid">
	<div class="row">
		<div class="col-sm-3 col-md-2 sidebar">
			<ul class="nav nav-sidebar">
				<li class="active"><a href="dashboardAmministrazione.jsp">Utenti </a></li>
				<li><a href="eliminaUtente.jsp">Elimina utente</a></li>
				<li><a href="veicoliAmministrazione.jsp">Veicoli</a></li>
				<li><a href="eliminaVeicolo.jsp">Elimina veicolo</a></li>
				<li><a href="impostazioniAmministrazione.jsp">Profilo personale<span
						class="sr-only">(current)</span></a></li>
			</ul>

		</div>
		
		<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
			
		
				<h1 class="page-header"> Gestione messaggio: <%=request.getParameter("rdbSelezione")%>
				<%=request.getParameter("rdbSelezioneNome")%>
				</h1>
						<% 	
							String id =request.getParameter("rdbSelezione");
							request.getSession().setAttribute("rdbSelezione",id);
														
						 %>
		</div>		
		<div id="form-main">
				<div id="form-div">
						
						<h4>Messaggio processato. </br>
						Verrà inviata una mail di conferma lettura al cliente dall'operatore</h4>
							
			
						<script type="text/javascript">
						function invioEmail(){
							alert("Ho inviato una mail di conferma di lettura all'utente");
							
						}
						</script>
						<form name="form" method="post" onsubmit="invioEmail();return false">
						<input type="submit" name="Submit" value="InvioEmail"></form>
						
						<% 	
							String id1 =request.getParameter("rdbSelezione");
							request.getSession().setAttribute("rdbSelezione",id1);
							System.out.println("ID: "+id1);									
						 %>
						
						 
						<form  method="POST" action="NotificheClientiServlet" class="form" id="form1">
						<div class="submit">
							<input style="margin-bottom: 15px;" type="submit" value="Elimina messaggio" /></div></form>
							<div class="ease"></div></div>
						 
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
