<%-- 
    Document   : inicio
    Created on : 18/11/2024, 1:10:30 p. m.
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link
            rel="stylesheet"
            href="https://cdn.jsdelivr.net/npm/@picocss/pico@2/css/pico.min.css"
>
        <title>JSP Page</title>
    </head>
    <style>
       
        /* Fondo personalizado */
        body {
            background: linear-gradient(to bottom, #4CAF50, #2E7D32);
            color: white;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        h1 {
            font-size: 3rem;
            margin-bottom: 1rem;
            text-align: center;
        }

        /* Formulario centrado */
        main {
            max-width: 400px;
            padding: 2rem;
            background: #fff;
            color: #000;
            border-radius: 8px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
        }

        /* Navegación superior */
        nav {
            background-color: rgba(255, 255, 255, 0.1);
            border: none;
            position: absolute;
            top: 0;
            width: 100%;
            padding: 1rem;
        }

        nav ul {
            justify-content: center;
        }

        nav ul li a {
            color: white;
        }

        nav ul li a:hover {
            color: #FFEB3B;
        }
    </style>
<nav>
    <ul>
        <li><a href="inicio.jsp">Inicio</a></li>
        <li><a href="#features">Características</a></li>
        <li><a href="#contact">Contacto</a></li>
    </ul>
</nav>
    <body>
        <%
            if(session.getAttribute("nomusu")==null){
            response.sendRedirect("index.html");
            return;
            }
            %>
        <h1>Bienvenido a mí aplicación!</h1>
    </body>
</html>
