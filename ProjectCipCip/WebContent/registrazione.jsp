<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="it">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

<title>Registrati</title>

<!-- Bootstrap core CSS -->
<link href="bower_components/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link href="style/style.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

	<form action="registrationServlet">
		<div class="row">
			<div class="col-sm-12">
				<h1>Registrati</h1>
			</div>
		</div>
		<hr />
		<div class="row">
			<div class="col-sm-12">
				<h3>Utente</h3>
			</div>
		</div>
					
		<div class="row">
  			<div class="col-md-4"></div>
  			<div class="col-md-4">
				<label for="inputNome">Nome</label>
				<input type="text" class="form-control" id="inputNome" required="required" placeholder="Nome" />
			</div>
			<div class="col-md-4"></div>
		</div>
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4 col-sm-12">
				<label for="inputNome">Cognome</label>
				<input type="text" class="form-control" id="inputCognome" required="required" placeholder="Cognome" />
			</div>
			<div class="col-md-4 col-sm-12"></div>
		</div>
		
		
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4 col-sm-12">
				<label for="inputCellulare">Cellulare</label>
				<input type="text" class="form-control" id="inputCellulare" required="required" placeholder="Cellulare"/>
			</div>
			<div class="col-md-4 col-sm-12"></div>
		</div>
		<div class="row">
  			<div class="col-md-4"></div>
  			<div class="col-md-4">
				<label for="inputEmail1">Email</label>
				<input type="email" class="form-control" id="inputEmail1" required="required" placeholder="Email" />
			</div>
			<div class="col-md-4"></div>
		</div>
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4 col-sm-12">
				<label for="inputPassword1">Password</label>
				<input type="password" class="form-control" id="inputPassword1" required="required" placeholder="Password" />
			</div>
			<div class="col-md-4 col-sm-12"></div>
		</div>
		
		<hr />

		<!-- <div class="row">
			<div class="col-sm-12">
				<h3>Veicolo</h3>
			</div>
		</div>
		<div class="row">
			<div class="col-md-3 col-sm-12"></div>
			<div class="col-md-3 col-sm-12">
				<label for="inputMarca">Marca</label>
				<input type="text" class="form-control" id="inputMarca" required="required" placeholder="Marca" />
			</div>
			<div class="col-md-3 col-sm-12">
				<label for="inputModello">Modello</label>
				<input type="text" class="form-control" id="inputModello" required="required" placeholder="Modello" />
			</div>
			<div class="col-md-3 col-sm-12"></div>
		</div>
		<div class="row">
			<div class="col-md-3 col-sm-12"></div>
			<div class="col-md-3 col-sm-12">
				<label for="inputTarga">Targa</label>
				<input type="text" class="form-control" id="inputTarga" required="required" placeholder="Targa" />
			</div>
			<div class="col-md-3 col-sm-12">
				<label for="inputModello">Immatricolazione</label>
				<input type="text" class="form-control" id="inputImmatricolazione" required="required" placeholder="mm/aaaa"/>
			</div>
			<div class="col-md-3 col-sm-12"></div>
		</div>
		<hr />
		<div class="row">
			<div class="col-sm-12">
				<h3>Impostazioni soglia</h3>
			</div>
		</div>
		<div class="row">
			<div class="col-md-3 col-sm-12"></div>
			<div class="col-md-3 col-sm-12">
				<label for="inputSogliaEmail">Soglia email</label>
				<form class="form-inline">
					<div class="form-group">
						<div class="input-group">
							<input type="text" class="form-control" id="inputSogliaEmail" placeholder="Soglia email" />
							<div class="input-group-addon">km/h</div>
						</div>
					</div>
				</form>
			</div>
			<div class="col-md-3 col-sm-12">
				<label for="inputSogliaSms">Soglia sms</label>
				<form class="form-inline">
					<div class="form-group">
						<div class="input-group">
							<input type="text" class="form-control" id="inputSogliaSms" placeholder="Soglia SMS" />
							<div class="input-group-addon">km/h</div>
						</div>
					</div>
				</form>

			</div>
			<div class="col-md-3 col-sm-12"></div>
		</div> 
		<hr /> -->
		<div class="row">
			<div class="col-md-3 col-sm-12"></div>
			<div class="col-md-3 col-sm-12">

				<a href="index.jsp" class="btn btn-primary btn-lg btn-danger"
					role="button">Torna indietro</a>
			</div>
			<div class="col-md-3 col-sm-12">
				<!-- <a href="#" class="btn btn-primary btn-lg btn-success" role="button">Conferma registrazione</a> -->
				<button type="submit" class="btn btn-primary btn-lg btn-success">Conferma
					registrazione</button>
			</div>
			<div class="col-md-3 col-sm-12"></div>
		</div>
		<hr />
	</form>


</body>
</html>