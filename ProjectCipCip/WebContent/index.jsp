<%@page contentType="text/html" pageEncoding="UTF-8" import="it.univr.bean.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
    </head>
    <body>
    <form action="indexServlet">
       
        <!--  Sto cercando di far vedere il nome e cognome dell' utente
        adesso funziona -->
        <%
  		String nome=(String)session.getAttribute("nome");
        String cognome=(String)session.getAttribute("cognome");
        %>
        
        
      <table class="skin_tbl" align="center"  border=1 cellpadding="0" cellspacing="0"><tr><td class="mleft_top"></td>
      <td><table class="mback" width="100%" cellpadding="0" cellspacing="0"><tr><td class="mback_left"></td><td class="mback_center">

<div class="mtitle">Benvenuto utente <%=nome%> <%=cognome%></div>

</td><td class="mback_right"></td></tr></table></td><td class="mright_top"></td></tr><tr><td class="mleft"></td><td><table class="mainbg" style="text-align:center;width:100%" cellpadding="4" cellspacing="1">


<tr title="RIGA1">
<td class="ww" rowspan="5">mappa</td>
<td class="aa"><a href="targa.jsf">Inserimento targa</a></td>
</tr>

<tr title="RIGA2">
<td class="ww"><a href="notifiche.jsf">Parametri-notifiche</a></td>
</tr>
<tr title="RIGA3">
<td class="ww"><a href="avvisi.jsf">Avvisi</a></td>
</tr>
<tr title="RIGA4">
<td class="ww"><a href="foto.jsf">Foto</a></td>
</tr>
<tr title="RIGA5">
<td class="ww"><a href="help.jsf">Help-desk</a></td>
</tr>
      
                </tbody>
            </table>
            </center>
        </form>
    </body>
</html>