<%@ include file="headDashboard.jsp" %>

    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
          <ul class="nav nav-sidebar">
          	<li><a href="dashboard.jsp">Dashboard</a></li>
            <li><a href="impostazioni.jsp">Impostazioni</a></li>  
            <li><a href="veicolo.jsp">Aggiungi veicolo</a></li>          
            <li class="active"><a href="#">Rimuovi veicolo <span class="sr-only">(current)</span></a></li>
            <li><a href="avvisi.jsp">Avvisi</a></li>
            <li><a href="gallery.jsp">Gallery</a></li>
            <li><a href="help.jsp">Help</a></li>
          </ul>
          
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">Rimuovi veicolo</h1>

          <div class="table-responsive">
            <table class="table table-hover">
              <thead>
                <tr>
                  <th>Marca</th>
                  <th>Modello</th>                  
                  <th>Targa</th>
                  <th>Data Immatricolazione</th>
                  <th></th>                                                       
                </tr>
              </thead>
              <tbody>
                <tr>               
                  <td><%= (String)session.getAttribute("marca")%></td>
                  <td><%= (String)session.getAttribute("modello")%></td>  
                  <td><%= (String)session.getAttribute("targa")%></td>
                  <td><%= (String)session.getAttribute("data_immatricolazione")%></td>
                  <td><form method="POST" action="RimuoviVeicoloServlet"><button class="btn btn-danger" type="submit" value="submit">Rimuovi</button></form></td>                                                                     
                </tr>               
              </tbody>
            </table>
          </div>
        </div>
      </div><!--  <a class=" type="submit" value="submit" role="button">-->
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
