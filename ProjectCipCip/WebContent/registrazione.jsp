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
		<div class="col-md-3 col-sm-12"></div>
		<div class="col-md-3 col-sm-12">
			<label for="inputEmail1">Email</label> <input type="email"
				class="form-control" id="inputEmail1" placeholder="Email">
		</div>
		<div class="col-md-3 col-sm-12">
			<label for="inputPassword1">Password</label> <input type="password"
				class="form-control" id="inputPassword1" placeholder="Password">
		</div>
		<div class="col-md-3 col-sm-12"></div>
	</div>
	<div class="row">
		<div class="col-md-3 col-sm-12"></div>
		<div class="col-md-3 col-sm-12">
			<label for="inputNome">Nome</label> <input type="text"
				class="form-control" id="inputNome" placeholder="Nome">
		</div>
		<div class="col-md-3 col-sm-12">
			<label for="inputNome">Cognome</label> <input type="text"
				class="form-control" id="inputCognome" placeholder="Cognome">
		</div>
		<div class="col-md-3 col-sm-12"></div>
	</div>
	<div class="row">
		<div class="col-md-3 col-sm-12"></div>
		<div class="col-md-3 col-sm-12">
			<label for="inputCellulare">Cellulare</label> <input type="text"
				class="form-control" id="inputCellulare" placeholder="Cellulare">
		</div>
		<div class="col-md-3 col-sm-12"></div>
		<div class="col-md-3 col-sm-12"></div>
	</div>
	<hr />

	<div class="row">
		<div class="col-sm-12">
			<h3>Veicolo</h3>
		</div>
	</div>
	<div class="row">
		<div class="col-md-3 col-sm-12"></div>
		<div class="col-md-3 col-sm-12">
			<label for="inputMarca">Marca</label> <input type="text"
				class="form-control" id="inputMarca" placeholder="Marca">
		</div>
		<div class="col-md-3 col-sm-12">
			<label for="inputModello">Modello</label> <input type="text"
				class="form-control" id="inputModello" placeholder="Modello">
		</div>
		<div class="col-md-3 col-sm-12"></div>
	</div>
	<div class="row">
		<div class="col-md-3 col-sm-12"></div>
		<div class="col-md-3 col-sm-12">
			<label for="inputTarga">Targa</label> <input type="text"
				class="form-control" id="inputTarga" placeholder="Targa">
		</div>
		<div class="col-md-3 col-sm-12">
			<label for="inputModello">Immatricolazione</label> <input type="text"
				class="form-control" id="inputImmatricolazione"
				placeholder="Immatricolazione">
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
						<input type="text" class="form-control" id="inputSogliaEmail"
							placeholder="Soglia email">
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
						<input type="text" class="form-control" id="inputSogliaSms"
							placeholder="Soglia SMS">
						<div class="input-group-addon">km/h</div>
					</div>
				</div>
			</form>

		</div>
		<div class="col-md-3 col-sm-12"></div>
	</div>
	<hr />
	<div class="row">
		<div class="col-md-3 col-sm-12"></div>
		<div class="col-md-3 col-sm-12">
			<a href="http://localhost:8080/ProgettoIngegneria" class="btn btn-primary btn-lg btn-danger" role="button">Torna indietro</a>
		</div>
		<div class="col-md-3 col-sm-12">
			<a href="#" class="btn btn-primary btn-lg btn-success" role="button">Conferma registrazione</a>
		</div>
		<div class="col-md-3 col-sm-12"></div>
	</div>
	<hr/>
	


</body>
</html>