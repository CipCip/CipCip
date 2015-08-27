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
                  <th>Data</th>
                  <th>Ora</th>                  
                  <th>Targa</th>
                  <th>Latitudine</th>
                  <th>Longitudine</th>                                     
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td>21/06/2015</td>
                  <td>12:50:15</td>  
                  <td>AB123CD</td>
                  <td>21.9</td>
                  <td>12.33</td>                                 
                </tr>
                <tr>
                  <td>10/06/2015</td>
                  <td>14:00:15</td>  
                  <td>AB123CD</td>
                  <td>121.9</td>
                  <td>52.433</td>                                 
                </tr>
                <tr>
                  <td>21/06/2015</td>
                  <td>15:45:15</td>  
                  <td>AB123CD</td>
                  <td>12.9</td>
                  <td>18.4833</td>                                 
                </tr>
                <tr>
                  <td>03/06/2015</td>
                  <td>19:00:15</td>  
                  <td>AB123CD</td>
                  <td>31.9</td>
                  <td>87.4833</td>                                 
                </tr>
                <tr>
                  <td>21/06/2015</td>
                  <td>12:00:15</td>  
                  <td>AB123CD</td>
                  <td>87.9</td>
                  <td>12.4833</td>                                 
                </tr>
                
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
