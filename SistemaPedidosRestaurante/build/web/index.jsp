<%-- 
    Document   : index
    Created on : 19 oct. 2022, 16:26:52
    Author     : JMR CODE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <title>Tu Restaurante</title>
        <meta name="viewport" content="width=device-width, user-scalable=yes, initial-scale=1.0, maximun-scale=3.0, minimum-scale=1.0">
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
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
            <img src="img/banner.jpg" alt="" class="banner__img">
            <div class="banner__content">La mejor y exquisita comida está aquí</div>
        </section>
        <main class="main">
            <section class="group group--color">
                <div class="container">
                    <h2 class="main__title">Bienvenido a su restaurante</h2>
                    <p class="main-txt">Bienvenido ${usu}</p>
                </div>
            </section>
            <section class="group main__about__description">
                <div class="container container--flex">
                    <div class="column column--50">
                        <img class="img" src="img/food-1.jpg" alt="">
                    </div>
                    <div class="column column--50">
                        <h3 class="column__title">Experiencia en la industria culinaria</h3>
                        <p class="column__txt"> descripcion</p>
                        <a href="contacto.html" class="btn btn--contact">Contáctanos</a>
                    </div>
                </div>
            </section>
            <section class="group today-special">
                <h2 class="group__title">Especial de hoy</h2>
                <div class="container container--flex">
                    <div class="column column--50-25">
                        <img src="img/plate1.jpg" alt="" class="today-special__img">
                        <div class="today_special__title">Especial del día 1</div>
                        <div class="today_special__price">$</div>
                    </div>
                    <div class="column column--50-25">
                        <img src="img/plate2.jpg" alt="" class="today-special__img">
                        <div class="today_special__title">Especial del día </div>
                        <div class="today_special__price">$</div>
                    </div>
                    <div class="column column--50-25">
                        <img src="img/plate3.jpg" alt="" class="today-special__img">
                        <div class="today_special__title">Especial del día </div>
                        <div class="today_special__price">$</div>
                    </div>
                    <div class="column column--50-25">
                        <img src="img/plate4.jpg" alt="" class="today-special__img">
                        <div class="today_special__title">Especial del día </div>
                        <div class="today_special__price">$</div>
                    </div>
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
