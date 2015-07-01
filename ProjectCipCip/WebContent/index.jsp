<%@ include file="head.jsp" %>  

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
				
				<div class="mastfoot">
					<div class="inner">
						<p class="testoFooter">Progetto di Ingegneria del Software AA
							2014/2015 - Università degli Studi di Verona</p>
					</div>
				</div>
				
			</div>





			<div id="form-main">
				<div id="form-div">
					<form  method="POST" action="loginServlet" class="form" id="form1">
						<h3>ACCEDI</h3>

						<p class="email">
							<input name="email" type="text"
								class="validate[required,custom[email]] feedback-input"
								id="email" placeholder="Email" required="required" />
						</p>

						<p class="password">
							<input type="password" name="password"
								class="validate[required,length[6,300]] feedback-input"
								id="password" placeholder="Password">							
						</p>


						<div class="submit">
							<input style="margin-bottom: 15px;" type="submit" value="accedi"
								id="button-blue" />
							<div class="ease"></div>
						</div>

						<div class="submit">
							<a id="button-blue" href="registrazione.jsp">registrati</a>
							<div class="ease"></div>
						</div>
					</form>
										
				</div>								
			</div>			
		</div>

	</div>
	
</body>
</html>