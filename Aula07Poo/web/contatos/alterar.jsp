<%-- 
    Document   : alterar
    Created on : 25/03/2019, 17:04:49
    Author     : a
--%>

<%@page import="br.com.fatecpg.oo.BD"%>
<%@page import="br.com.fatecpg.oo.Contato"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alterar Contato</title>
    </head>
    <body>
        <% int id = Integer.parseInt(request.getParameter("id"));%>
        <%Contato c = BD.getContatosList().get(id);%>
        <h1>WebApp</h1>
        <h2>Alterar Contato</h2>
        <h3>ID: <b><%= id %></b></h3>
        <form action="lista.jsp">
            Nome: <br/><input type="text" name="nome" value="<%=c.getNome()%>"/>
            <br/>Telefone: <br/><input type="text" name="telefone" value="<%=c.getTelefone()%>"/>
            <br/>E-mail: <br/><input type="text" name="email" value="<%=c.getEmail()%>"/>
            <hr/><h4>Tem certeza que deseja alterar esse registro?</h4>
            <input type="submit" name="alterar" value="Sim">
            <input type="submit" name="alterar" value="Não">
            <input type="hidden" name="id" value="<%=id%>">
        </form>
    </body>
</html>
