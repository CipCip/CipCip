<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="it">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

<title>Contattaci</title>

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

	<div class="site-wrapper">

		<!-- <div class="site-wrapper-inner"> -->

		<div class="cover-container">

			<div class="masthead clearfix">
				<div class="inner">
					<h3 class="masthead-brand">Cip Cip</h3>
					<nav>
						<ul class="nav masthead-nav">
							<li class="active"><a href="index.jsp">Home</a></li>
							<li><a href="chisiamo.jsp">Chi siamo</a></li>
							<li><a href="contattaci.jsp">Contattaci</a></li>
						</ul>
					</nav>
				</div>
			</div>





			<div id="form-main">
				<div id="form-div">
					<form class="form" id="form1">
						<h3>ACCEDI</h3>					

						<p class="email">
							<input name="email" type="text"
								class="validate[required,custom[email]] feedback-input"
								id="email" placeholder="Email" required="required"/>
						</p>

						<p class="password">
							<input type="password" name="text"
								class="validate[required,length[6,300]] feedback-input"
								id="password" placeholder="Password"></textarea>
						</p>


						<div class="submit">
							<input type="submit" value="accedi" id="button-blue" />
							<div class="ease"></div>
						</div>
						
						<div class="submit">
							<input type="submit" value="registrati" id="button-blue" />
							<div class="ease"></div>
						</div>
					</form>
				</div>
			</div>
		</div>

	</div>
</body>
</html>