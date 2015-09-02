<%@ include file="headDashboard.jsp"%>

<div class="container-fluid">
	<div class="row">
		<div class="col-sm-3 col-md-2 sidebar">
			<ul class="nav nav-sidebar">
				<li><a href="dashboard.jsp">Dashboard</a></li>
				<li><a href="impostazioni.jsp">Inserisci o modifica impostazioni personali</a></li>
				<li><a href="veicolo.jsp">Inserisci o modifica dati veicolo</a></li>
				<li><a href="rimuoviVeicolo.jsp">Rimuovi veicolo</a></li>
				<li><a href="avvisi.jsp">Avvisi</a></li>
				<li><a href="gallery.jsp">Gallery</a></li>
				<li class="active"><a href="#">Help <span
						class="sr-only">(current)</span></a></li>				
			</ul>


		</div>
		<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
			<h1 class="page-header">Help</h1>


<div id="form-main">
				<div id="form-div">
					<form method="post" action="helpServlet" class="form" id="form1">
						<h3>CONTATTACI- </h3>
						<h4>ti verrà inviata una risposta quanto prima dai nostri operatori</h4>
						
						<p class="name">
							<input name="nome" type="text" required="required"
								class="validate[required,custom[onlyLetter],length[0,100]] feedback-input"
								placeholder="Nome *" id="nome" />
						</p>

						<p class="email">
							<input name="email" type="email"
								required="required" class="validate[required,custom[email]] feedback-input"
								id="email" placeholder="Email per contatto *" />
						</p>

						<p class="messaggio">
							<textarea name="messaggio" type="text"
								required="required" class="validate[required,length[6,300]] feedback-input"
								id="comment" placeholder="Il tuo messaggio *" ></textarea>
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