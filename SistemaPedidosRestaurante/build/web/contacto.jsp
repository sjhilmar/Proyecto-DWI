<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <title>Tu Restaurante</title>
        <meta name="viewport" content="width=device-width, user-scalable=yes, initial-scale=1.0, maximun-scale=3.0, minimum-scale=1.0">
        <link rel="stylesheet" href="css/estilos.css">
        <link href="css/contacto.css" rel="stylesheet" type="text/css"/>
        <link href="https://file.myfontastic.com/m5VKJyveyYSzHadLP6JKAS/icons.css" rel="stylesheet">
    </head>
    <body>
        <header class="main-header">
            <div class="container container--flex">
                <div class="logo-container column column--50">
                    <h1 class="logo"> Contacto | Tu Restaurante</h1>
                </div>
                <div class="main-header__contactInfo column column--50">
                    <p class="main-header__contactInfo__phone">
                        <span class="icon-phone"> 952 999 428</span>
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
                    <li class="menu__item"><a href="nosotros.jsp" class="menu__link ">Nosotros</a></li>
                    <li class="menu__item"><a href="ProductoServlet?galeria" class="menu__link">Galería</a></li>                  
                    <li class="menu__item"><a href="contacto.jsp" class="menu__link menu__link--select">Contacto</a></li>
                     <li class="menu__item"><a href="Login.jsp" class="menu__link">Login</a></li>
                </ul>
                <div class="social-icon">
                    <a href="" class="social-icon__link"><span class="icon-facebook"></span></a>
                    <a href="" class="social-icon__link"><span class="icon-twitter"></span></a>
                    <a href="" class="social-icon__link"><span class="icon-mail"></span></a>
                </div>
            </div>
        </nav>
        <section class="banner">
            <img src="img/banner_contact.jpg" alt="" class="banner__img">
            <div class="banner__content">La mejor y exquisita comida está aquí</div>
        </section>
        <main class="main">
            <section class="group contact">
                <h2 class="group__title">Contáctanos</h2>
                <div class="container container--flex">
                    <div class="contact-information column column--50">
                        <h3 class="column__litle">Información de contacto</h3>
                        <p class="column__txt">Descripciones</p>
                        <p class="column__txt"><span class="icon-phone"></span> Telefono 1: 987 158 845</p>
                        <p class="column__txt"><span class="icon-phone"></span>Telefono 1: 987 478 814</p>
                        <p class="column__txt"><span class="icon-location"></span>Urb. Las Dunas 123, Las Flores, San Juan de Lurigancho</p>
                        <p class="column__txt"><span class="icon-mail"></span>consultas@yourrestaurant.com</p>
                        <div class="social-icon">
                            <a href="" class="social-icon__link"><span class="icon-facebook"></span></a>
                            <a href="" class="social-icon__link"><span class="icon-twitter"></span></a>
                            <a href="" class="social-icon__link"><span class="icon-mail"></span></a>
                        </div>
                    </div>
                    <form action="" method="post" class="formulario column column--50" >
                        <label for="" class="formulario__label" >Nombre:</label>
                        <input type="text" class="formulario__input-txt" name="nombre">
                        <label for="" class="formulario__label" >Correo:</label>
                        <input type="text" class="formulario__input-txt" name="Correo">
                        <label for="" class="formulario__label" >Teléfono:</label>
                        <input type="text" class="formulario__input-txt" name="telefono">
                        <textarea name="mensaje" id="" cols="30" rows="10" class="formulario__textarea"></textarea>
                        <input type="submit" class="btn formulario__btn" value="Enviar" name="">
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
