<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%-- 
    Document   : index
    Created on : 2/02/2022, 11:03:45 p. m.
    Author     : javier
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!
    String mensaje = "Se ha podido";
%>
<%
    Connection conn;
    try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/parqueadero", "root", "135689795623Javana@");
    } catch (Exception e) {
        mensaje = "no se ha podido";
    }
%>
<!DOCTYPE html>
<html lang="es" translate="no">
    <head>
        <title>Este va a ser el grán título</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <link type="text/css" rel="stylesheet" href="main.css">
        <!--link type="text/css" rel="stylesheet" href="statics/css/all.min.css"-->
        <!--link type="text/css" rel="stylesheet" href="statics/css/fonts/Nunito.css"-->
    </head>
    
    <body>
        <header>
            <h1 class="fa-car">
                Parqueadero La Mudanza
            </h1>
        </header>

        <div id="contenedor_principal">
            <aside>
                
            </aside>
            
            <main>
                Mensaje: <%=mensaje%>
            </main>
        </div>
        
        <script src="statics/js/libs/jquery/jquery.js"></script>
        <script src="statics/js/libs/vue/vue.js"></script>
        <script src="statics/js/main.js"></script>
    </body>
</html>