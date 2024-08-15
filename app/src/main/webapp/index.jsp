<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<%
String frutas[] = {"Maça", "Uva", "Morango"};
session.setAttribute("frutas", frutas);
%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Aplicação</title>
    </head>
    <body>
        <h1>Olá Mundo!!!</h1>
        <c:forEach var="f" items="${frutas}">
            <p>${f}</p>
        </c:forEach>
    </body>
</html>