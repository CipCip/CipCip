<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Notifiche clienti</title>
</head>
<body>
<div class="container-fluid">
	<div class="row">
		<div class="col-sm-3 col-md-2 sidebar">
			<ul class="nav nav-sidebar">				
				<li><a href="dashboardAmministrazione.jsp">Utenti</a></li>
				<li><a href="eliminaUtente.jsp">Elimina utente</a></li>
				<li><a href="veicoliAmministrazione.jsp">Veicoli</a></li>
				<li><a href="eliminaVeicolo.jsp">Elimina veicolo</a></li>
				<li><a href="impostazioniAmministrazione.jsp">Profilo personale</a></li>
				<li class="active"><a href="#">Notifiche clienti<span
						class="sr-only">(current)</span></a></li>
			</ul>

		</div>
		<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
			<h1 class="page-header">Notifiche clienti</h1>




			<div id="form-main">
				<div id="form-div">
					<form  method="POST" action="NotificheCLientiServlet" class="form" id="form1">
						

						<p class="name">
							<input name="nome" type="text" required="required"
								class="validate[required,custom[onlyLetter],length[0,100]] feedback-input"
								placeholder="Nome *" id="nome" />
						</p>
						
						<p class="email">
							<input name="email" type="email" required="required"
								class="validate[required,custom[email]] feedback-input" id="email"
								placeholder="Email privata per la risposta *" />

						<p class="email">
							<input name="messaggio" type="text"
								class="feedback-input"
								id="email" placeholder="Messaggio *" />
						</p>
						
						

						<div class="submit">
							<input style="margin-bottom: 15px;" type="submit" value="Invia messaggio"
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

