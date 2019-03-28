<%-- 
    Document   : adicionar
    Created on : 25/03/2019, 16:24:16
    Author     : a
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Adicionar Contato</title>
    </head>
    <body>
        <h1>WebApp</h1>
        <h2>Novo Contato</h2>
        <form action="lista.jsp">
            <br/>Nome: <br/><input type="text" name="nome"/>
            <br/>Telefone: <br/><input type="text" name="telefone"/>
            <br/>E-mail: <br/><input type="text" name="email"/>
            <br/><br/><input type="submit" name="adicionar"/>
        </form>  
    </body>
</html>
