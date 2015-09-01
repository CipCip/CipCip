<%@ page language="java" contentType="text/html"
	pageEncoding="ISO-8859-1" import="it.univr.bean.*" import="it.univr.model.*"
	import="java.util.*"%>
<%@ include file="headDashboard.jsp" %>

    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
          <ul class="nav nav-sidebar">
          	<li><a href="dashboard.jsp">Dashboard</a></li>
            <li><a href="impostazioni.jsp">Inserisci o modifica impostazioni personali</a></li>  
            <li><a href="veicolo.jsp">Inserisci o modifica dati veicolo</a></li>
            <li><a href="rimuoviVeicolo.jsp">Rimuovi veicolo</a></li>          
            <li class="active"><a href="#">Avvisi <span class="sr-only">(current)</span></a></li>
            <li><a href="gallery.jsp">Gallery</a></li>
            <li><a href="help.jsp">Help</a></li>
          </ul>
          
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">Cronologia avvisi</h1>

          

          <div class="table-responsive">
            <table class="table table-hover">
              <thead>
                <tr>                 
                  <th>Targa</th>
                  <th>Posizione inizio rilevamento</th>
                  <th>Posizione fine rilevamento</th>                                     
                </tr>
              </thead>
               <tbody>
              <!-- %String targa=(String)session.getAttribute("targa"); %>-->
              
              
              	<%
				List<PosizioniBean> listaPosizioni = PositionDAO.getPosizioni((String)session.getAttribute("targa"));
				%>

				<%
				for (PosizioniBean pos : listaPosizioni) {
				%>
				
                <tr>
                
                  <td><%=pos.getTarga() %></td>
                  <td><%=pos.getPosIniziale() %></td>
                  <td><%=pos.getPosFinale() %></td>
                                                                
               
                </tr>
                 <%} %>          
                
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
    <script src="../../assets/js/vendor/holder.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
