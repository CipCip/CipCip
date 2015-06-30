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
    <link rel="shortcut icon" type="image/png" href="http://www.mammagallo.com/wp-content/uploads/2015/02/Twitter-logo.jpg"/>
</head>

<body>

	<!-- <div class="site-wrapper">

		<div class="site-wrapper-inner">

		<div class="cover-container">

			<div class="masthead clearfix">
				<div class="inner">
					<h3 class="masthead-brand">Cip Cip</h3>
					<nav>
						<ul class="nav masthead-nav">
							<li><a href="index.jsp">Home</a></li>
							<li><a href="chisiamo.jsp">Chi siamo</a></li>
							<li><a href="contattaci.jsp">Contattaci</a></li>
						</ul>
					</nav>
				</div>
			</div> -->




	<div id="form-main">
		<div id="form-div">
			<form method="post" action="registration.jsp" class="form" id="form1">
				<h3>REGISTRATI</h3>

				<!-- NOME -->
				<p class="name">
					<input name="nome" type="text" required="required"
						class="validate[required,custom[onlyLetter],length[0,100]] feedback-input"
						placeholder="Nome *" id="name" />
				</p>

				<!-- COGNOME -->
				<p class="name">
					<input name="nome" type="text" required="required"
						class="validate[required,custom[onlyLetter],length[0,100]] feedback-input"
						placeholder="Cognome *" id="name" />
				</p>

				<!-- TELEFONO -->
				<p class="phone">
					<input name="cogname" type="text" required="required"
						class="validate[required,custom[onlyLetter],length[0,100]] feedback-input"
						placeholder="Telefono *" id="phone" />
				</p>

				<p class="email">
					<input name="email" type="email" required="required"
						class="validate[required,custom[email]] feedback-input" id="email"
						placeholder="Email *" />
				</p>

				<p class="password">
					<input type="password" name="text"
						class="validate[required,length[6,300]] feedback-input"
						id="password" placeholder="Password" required="required"/>					
				</p>


				<div class="submit">
					<input style="margin-bottom: 15px;" type="submit"
						value="registrati" id="button-blue" />
					<div class="ease"></div>
				</div>
				<div class="submit">
					<a id="button-blue" href="index.jsp">torna indietro</a>
					<div class="ease"></div>
				</div>
			</form>
		</div>
	</div>
	<!-- 		</div>

	</div> -->
</body>
</html>