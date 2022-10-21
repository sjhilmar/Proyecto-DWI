
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <title>Tu Restaurante</title>
        <meta name="viewport" content="width=device-width, user-scalable=yes, initial-scale=1.0, maximun-scale=3.0, minimum-scale=1.0">
        <link rel="stylesheet" href="css/estilos.css">
        <link href="css/galeria.css" rel="stylesheet" type="text/css"/>
        <link href="https://file.myfontastic.com/m5VKJyveyYSzHadLP6JKAS/icons.css" rel="stylesheet">
    </head>
    <body>
        <div class="modal" id="modal">
            <div class="modal__content">
                <img src="" alt="" class="modal__img" id="modal__img">
            </div>
            <div class="modal__boton" id="modal__boton">X</div>
        </div>
        <header class="main-header">
            <div class="container container--flex">
                <div class="logo-container column column--50">
                    <h1 class="logo"> Galería | Tu Restaurante</h1>
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
                    <li class="menu__item"><a href="nosotros.jsp" class="menu__link">Nosotros</a></li>
                    <li class="menu__item"><a href="ProductoServlet?galeria" class="menu__link menu__link--select">Galería</a></li>
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
            <img src="img/banner_gallery_2.jpg" alt="" class="banner__img">
            <div class="banner__content">La mejor y exquisita comida está aquí</div>
        </section>

        <main class="main">
            <div class="group gallery">
                <h2 class="group__title">Nuestra Galería</h2>
                <div class="container container--flex">
                    <c:forEach var="p" items="${lista}">

                        <div class="column column--50-25">
                            <div>
                                <h3><label class="today_special__title">${p.getDescripcion()} </label></h3>
                                <label class="today_special__price">${p.getPrecioUnitario()}</label>
                            </div>
                            <img src="${p.getImagen()}" alt="" class="gallery__img gallery__img--small">
                            <p class="today_special__title" >${p.getObservacion()}</p>
                            <!--                            <img src="img/gallery/gallery1.jpg" alt="" class="gallery__img gallery__img--big">
                                                            <img src="img/gallery/gallery2.jpg" alt="" class="gallery__img gallery__img--small">-->
                        </div>
                    </c:forEach>
                    <!--                <div class="column column--50-25">
                                            <img src="img/gallery/gallery1.jpg" alt="" class="gallery__img gallery__img--big">
                                            <img src="img/gallery/gallery2.jpg" alt="" class="gallery__img gallery__img--small">
                                        </div>
                                        <div class="column column--50-25">
                                            <img src="img/gallery/gallery3.jpg" alt="" class="gallery__img gallery__img--small">
                                            <img src="img/gallery/gallery4.jpg" alt="" class="gallery__img gallery__img--big">
                                        </div>
                                        <div class="column column--50-25">
                                            <img src="img/gallery/gallery5.jpg" alt="" class="gallery__img gallery__img--big">
                                            <img src="img/gallery/gallery6.jpg" alt="" class="gallery__img gallery__img--small">
                                        </div>
                                        <div class="column column--50-25">
                                            <img src="img/gallery/gallery7.jpg" alt="" class="gallery__img gallery__img--small">
                                            <img src="img/gallery/gallery8.jpg" alt="" class="gallery__img gallery__img--big">
                                        </div>-->
                </div>
            </div>
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
                    <p class="column__txt">Telefono: 952 999 428</p>
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
        <script src="js/modal.js" type="text/javascript"></script>
    </body>
</html>
