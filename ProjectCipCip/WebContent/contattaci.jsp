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
							<li><a href="index.jsp">Home</a></li>
							<li><a href="chisiamo.jsp">Chi siamo</a></li>
							<li class="active"><a href="contattaci.jsp">Contattaci</a></li>
						</ul>
					</nav>
				</div>
			</div>




			<div id="form-main">
				<div id="form-div">
					<form class="form" id="form1">
						<h3>CONTATTACI</h3>
						<p class="name">
							<input name="nome" type="text"
								required="required" class="validate[required,custom[onlyLetter],length[0,100]] feedback-input"
								placeholder="Nome *" id="name" />
						</p>

						<p class="email">
							<input name="email" type="email"
								required="required" class="validate[required,custom[email]] feedback-input"
								id="email" placeholder="Email *" />
						</p>

						<p class="text">
							<textarea name="text"
								required="required" class="validate[required,length[6,300]] feedback-input"
								id="comment" placeholder="Il tuo messaggio *"></textarea>
						</p>


						<div class="submit">
							<input type="submit" value="invia" id="button-blue" />
							<div class="ease"></div>
						</div>
					</form>
				</div>
			</div>
		</div>

	</div>
</body>
</html>