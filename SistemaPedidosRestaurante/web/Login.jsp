<%-- 
    Document   : Login
    Created on : 29/11/2022, 02:26:07 AM
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link href="https://file.myfontastic.com/m5VKJyveyYSzHadLP6JKAS/icons.css" rel="stylesheet">
        <link href="css/estilos_login.css" rel="stylesheet" type="text/css"/>
        <title>Login</title>
    </head>
    <% String Alerta="";
        if(request.getParameter("validar")!=null){
           int val=Integer.parseInt(request.getParameter("validar"));
            if(val==0){
                Alerta="Error de usuario y/o conteseña";
             }
        }
    %>
    
    <body >
        <header class="main-header">
            <div class="container02 container02--flex">
                <div class="logo-container column column--50">
                    <h1 class="logo"> Your Restaurant</h1>
                </div>
                <div class="main-header__contactInfo column column--50">
                    <p class="main-header__contactInfo__phone">
                        <span class="icon-phone"> 952 999 000</span>
                    </p>
                    <p class="main-header__contactInfo__addres">
                        <span class="icon-location"> Av. Siempre Viva 350, Las flores, San Juan de Lurigancho, Perú</span>
                    </p>
                </div>
            </div>
        </header>
        <div class="container col-lg-3">
            <form action="UsuarioServlet01" method="post" class="formulario column column--50" >
                <div class="form-group text-center">
                    <p><h2>Iniciar Sesión</h2></p>
                </div>
                <div class="form-group">
                    <input type="hidden"  name="accion" value="LoguearUsuario">        
                    <label for="usuario" class="formulario__label" >Usuario:</label>
                    <input type="text" class="form-control" name="usuario" id="usuario" placeholder="Ingresar Usuario">
                </div>
                <div class="form-group">
                    <label for="contrasenia" class="formulario__label" >Contraseña:</label>
                    <input type="password" class="form-control" name="contrasenia" id="contrasenia" placeholder="Ingresar Password">
                </div>
                <input type="submit" class="btn btn-danger btn-block" value="Login" >
                <p stryle="color: red;" align="center"><%=Alerta%></p>
            </form>
            
        </div>
        <p><center><a href="usuario.jsp" class="main-header__contactInfo__addres" >Registrar Usuario</a></center>
        <section class="banner">
            <img src="img/banner_about.jpg" alt="" class="banner__img">

        </section>
        
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>
