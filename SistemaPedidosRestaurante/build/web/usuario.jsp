<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <title>Tu Restaurante</title>
        <meta name="viewport" content="width=device-width, user-scalable=yes, initial-scale=1.0, maximun-scale=3.0, minimum-scale=1.0">
        <link rel="stylesheet" href="css/estilos.css">
        <link href="css/usuario.css" rel="stylesheet" type="text/css"/>
        <link href="https://file.myfontastic.com/m5VKJyveyYSzHadLP6JKAS/icons.css" rel="stylesheet">
    </head>
    <body>
        <header class="main-header">
            <div class="container container--flex">
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
        <nav class="main-nav">
            <div class="container container--flex">
                <span class="icon-menu" id="btnmenu"></span>
                <ul class="menu" id="menu">
                    <li class="menu__item"><a href="index.jsp" class="menu__link">Inicio</a></li>
                    <li class="menu__item"><a href="nosotros.jsp" class="menu__link">Nosotros</a></li>
                    <li class="menu__item"><a href="ProductoServlet?galeria" class="menu__link">Galería</a></li>
                    <li class="menu__item"><a href="contacto.jsp" class="menu__link">Contacto</a></li>
                    <li class="menu__item"><a href="usuario.jsp" class="menu__link menu__link--select">Registrar</a></li>
                </ul>
                <div class="social-icon">
                    <a href="" class="social-icon__link"><span class="icon-facebook"></span></a>
                    <a href="" class="social-icon__link"><span class="icon-twitter"></span></a>
                    <a href="" class="social-icon__link"><span class="icon-mail"></span></a>
                </div>
            </div>
        </nav>
        <section class="banner">
            <img src="img/banner.jpg" alt="" class="banner__img">
            <div class="banner__content">La mejor y exquisita comida está aquí</div>
        </section>
        <main class="main">
            <section class="group group--color">
                <div class="container">
                    <h2 class="main__title">Creación de Usuario</h2>
                    <p class="main-txt">Registrarse</p>
                </div>
            </section>
            <section class="group contact">

                <div class="container container--flex">
                    <!--<div class="contact-information column column--50">-->


                    <form action="UsuarioServlet01" method="post" class="formulario column column--50" >

                        <!-- <label for="userID" class="formulario__label" >UserID:</label> -->
                        <input type="hidden"  name="accion" value="InsertarUsuario">        
                        <label for="usuario" class="formulario__label" >Usuario:</label>
                        <input type="text" class="formulario__input-txt" name="usuario" id="usuario">
                        <label for="contrasenia" class="formulario__label" >Contraseña:</label>
                        <input type="password" class="formulario__input-txt" name="contrasenia" id="contrasenia">
                        <label for="nombres" class="formulario__label" >Nombres:</label>
                        <input type="text" class="formulario__input-txt" name="nombres" id="nombres">
                        <label for="apellidos" class="formulario__label" >Apellidos:</label>
                        <input type="text" class="formulario__input-txt" name="apellidos" id="apellidos">
                        <label for="tipo_documento" class="formulario__label" >Tipo de Documento:</label>
                        <select  class="formulario__input-txt" name="tipo_documento" id="tipo_documento">
                            <option value="1" id="1">DNI</option>
                            <option value="4" id="4">CARNET DE EXTRANJERÍA</option>
                            <option value="6" id="6">RUC</option>
                            <option value="7" id="7">PASAPORTE</option>
                            <option value="0" id="0">OTRO TIPO DE DOCUMENTOS</option>
                        </select>
                        <label for="numero_documento" class="formulario__label" >Numero de Documento:</label>
                        <input type="text" class="formulario__input-txt" name="numero_documento" id="numero_documento">

                        <label for="Correo" class="formulario__label" >Correo:</label>
                        <input type="text" class="formulario__input-txt" name="Correo" id="Correo">
                        <label for="Departamento" class="formulario__label" >Departamento:</label>
                        <input type="text" class="formulario__input-txt" name="departamento" id="departamento">
                        <label for="Provincia" class="formulario__label" >Provincia:</label>
                        <input type="text" class="formulario__input-txt" name="Provincia" id="Provincia">
                        <label for="Distrito" class="formulario__label" >Distrito:</label>
                        <input type="text" class="formulario__input-txt" name="Distrito" id="Distrito">
                        <label for="direccion" class="formulario__label" >Dirección:</label>
                        <input type="text" class="formulario__input-txt" name="direccion" id="direccion">
                        <!-- <label for="tipo_usuario" class="formulario__label" >Tipo Usuario:</label>-->


                        <input type="hidden" class="formulario__input-txt" name="tipo_usuario" id="tipo_usuario" value="3">

                        <input type="submit" class="btn formulario__btn" value="Registrar">
                    </form> 
                </div>
            </section>

        </main>
        <footer class="main-footer">
            <div class="container container--flex">
                <div class="column column--33">
                    <h2 class="column__title">¿Por qué visitarnos?</h2>
                    <p class="column__txt">Descripción</p>
                </div>
                <div class="column column--33">
                    <h2 class="column__title">Contáctanos</h2>
                    <p class="column__txt">Av. Siempre Viva 350, Las flores, San Juan de Lurigancho, Perú</p>
                    <p class="column__txt">Telefono: 965 458 425</p>
                    <p class="column__txt">consultas@yourrestaurant.com</p>
                </div>
                <div class="column column--33">
                    <h2 class="column__title">Síguenos en nuestras redes</h2>
                    <p class="column__txt">Facebook</p>
                    <p class="column__txt">Síguenos en Twitter</p>
                    <p class="column__txt">Visita nuestro canal</p>
                </div>
                <p class="copy">© 2022 Tu Restaurante | Todos los derechos reservados</p>
            </div>
        </footer>
        <script src="js/menu.js"></script>
    </body>
</html>