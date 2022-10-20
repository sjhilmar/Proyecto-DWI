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
                    <li class="menu__item"><a href="index.jsp" class="menu__link menu__link--select">Inicio</a></li>
                    <li class="menu__item"><a href="nosotros.jsp" class="menu__link">Nosotros</a></li>
                    <li class="menu__item"><a href="ProductoServlet?galeria" class="menu__link">Galería</a></li>
                    <li class="menu__item"><a href="contacto.jsp" class="menu__link">Contacto</a></li>
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


                    <form action="" method="post" class="formulario column column--50" >

                        <label for="userID" class="formulario__label" >UserID:</label>
                        <input type="text" class="formulario__input-txt" name="userID">        
                        <label for="usuario" class="formulario__label" >Usuario:</label>
                        <input type="text" class="formulario__input-txt" name="usuario">
                        <label for="contrasenia" class="formulario__label" >Contraseña:</label>
                        <input type="password" class="formulario__input-txt" name="contrasenia">
                        <label for="nombres" class="formulario__label" >Nombres:</label>
                        <input type="text" class="formulario__input-txt" name="nombres">
                        <label for="apellidos" class="formulario__label" >Apellidos:</label>
                        <input type="text" class="formulario__input-txt" name="apellidos">
                        <label for="tipo_documento" class="formulario__label" >Tipo de Documento:</label>
                        <input type="text" class="formulario__input-txt" name="tipo_documento">
                        <label for="numero_documento" class="formulario__label" >Numero de Documento:</label>
                        <input type="text" class="formulario__input-txt" name="numero_documento">

                <!--    </form>
                    </div>-->

                    <!--<div class="contact-information column column--50">
                    <form action="" method="post" class="formulario column column--50" >-->
                        <label for="Correo" class="formulario__label" >Correo:</label>
                        <input type="text" class="formulario__input-txt" name="Correo">
                        <label for="Departamento" class="formulario__label" >Departamento:</label>
                        <select class="formulario__input-txt" name="Departamento">
                            <option>Ancash</option>
                            <option>Apurimac</option>
                            <option>Arequipa</option>
                            <option>Ayacucho</option>
                            <option>Cajamarca</option>
                            <option>Callao</option>
                            <option>Cusco</option>
                            <option>Huancavelica</option>
                            <option>Huanuco</option>
                            <option>Ica</option>
                            <option>Junín</option>
                            <option>LaLibertad</option>
                            <option>Lambayeque</option>
                            <option>Lima</option>
                            <option>Loreto</option>
                            <option>MadredeDios</option>
                            <option>Moquegua</option>
                            <option>Pasco</option>
                            <option>Piura</option>
                            <option>Puno</option>
                            <option>SanMartín</option>
                            <option>Tacna</option>
                            <option>Tumbes</option>
                            <option>Ucayali.</option>
                        </select>
                        <label for="Provincia" class="formulario__label" >Provincia:</label>
                        <input type="text" class="formulario__input-txt" name="Provincia">
                        <label for="Distrito" class="formulario__label" >Distrito:</label>
                        <input type="text" class="formulario__input-txt" name="Distrito">
                        <label for="direccion" class="formulario__label" >Dirección:</label>
                        <input type="text" class="formulario__input-txt" name="direccion">
                        <label for="tipo_usuario" class="formulario__label" >Tipo Usuario:</label>
                        <input type="text" class="formulario__input-txt" name="tipo_usuario">

                        <input type="submit" class="btn formulario__btn" value="Registrarse" name="Registrar">
                    </form> 
                    <!--</div>-->
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