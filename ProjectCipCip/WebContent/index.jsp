<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="it">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

<title>CipCip - Benvenuto</title>

<!-- Bootstrap core CSS -->
<link href="bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="style/style.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

	<div class="site-wrapper">

		<div class="site-wrapper-inner">

			<div class="cover-container">

				<div class="masthead clearfix">
					<div class="inner">
						<h3 class="masthead-brand">Cip Cip</h3>
						<nav>
							<ul class="nav masthead-nav">
								<li class="active"><a href="#">Home</a></li>
								<li><a href="#">Chi siamo</a></li>
								<li><a href="#">Contattaci</a></li>
							</ul>
						</nav>
					</div>
				</div>

				<div class="inner cover">
				<form action="IndexServlet">
					<h1 class="cover-heading">Benvenuto in cip cip</h1>
					<p class="lead">It's a chip and it's cheap</p>
					<p class="lead">
					<form class="form-inline">
						<div class="form-group">
							<label>Email</label> <input type="email"
								class="form-control" name="email" id="inputLoginMail">
						</div>
						<div class="form-group">
							<label>Password</label> <input type="password"
								class="form-control" name="password" id="inputLoginPwd"
								>
						</div>
						<button type="submit" class="btn btn-default">Accedi</button>
					</form>
					<br/><br/>
					
					<a class="btn btn-primary btn-lg" href="registrazione.jsp" role="button">Registrati</a>
				</div>

				<div class="mastfoot">
					<div class="inner">
						<p class="testoFooter">Progetto di Ingegneria del Software AA 2014/2015 -
							Università degli Studi di Verona</p>
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
	<script src="../../dist/js/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
