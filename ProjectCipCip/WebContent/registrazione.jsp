<%@ include file="head.jsp" %>

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
			<form method="post" action="registrationServlet" class="form" id="form1">
				<h3>REGISTRATI</h3>

				<!-- NOME -->
				<p class="name">
					<input name="nome" type="text" required="required"
						class="validate[required,custom[onlyLetter],length[0,100]] feedback-input"
						placeholder="Nome *" id="nome" />
				</p>

				<!-- COGNOME -->
				<p class="name">
					<input name="cognome" type="text" required="required"
						class="validate[required,custom[onlyLetter],length[0,100]] feedback-input"
						placeholder="Cognome *" id="cognome" />
				</p>

				<!-- CELLULARE -->
				<p class="phone">
					<input name="cellulare" type="text" required="required"
						class="validate[required,custom[onlyLetter],length[0,100]] feedback-input"
						placeholder="Telefono *" id="cellulare" />
				</p>
				
				<!-- EMAIL -->
				<p class="email">
					<input name="email" type="email" required="required"
						class="validate[required,custom[email]] feedback-input" id="email"
						placeholder="Email *" />
				</p>
				<!-- PASSWORD -->
				<p class="password">
					<input type="password" name="password"
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