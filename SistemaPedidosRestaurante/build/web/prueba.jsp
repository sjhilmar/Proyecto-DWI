

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <form action="ProductoServlet" method="POST" >
            <div class="container mt-4">
                <div class="row">
                    <c:forEach var="p" items="${productos}">
                        <div class="col">
                            <div>
                                <label>Descripción de producto: ${p.getDescripcion}</label>
                            </div>

                        </div>

                    </c:forEach>

                </div>

            </div>
            <div>
                <input type="button" name="btn" id="btn" value="Prueba">
            </div>
        </form>
    
</html>
