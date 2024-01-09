<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bienvenida</title>
</head>
<body>
    <%-- Obtiene el nombre de usuario del atributo en el request --%>
    <% String username = (String)request.getAttribute("username"); %>

    <h1>Hola, <%= username %>!</h1>
</body>
</html>