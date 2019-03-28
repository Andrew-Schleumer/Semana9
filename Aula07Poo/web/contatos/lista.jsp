<%-- 
    Document   : lista.jsp
    Created on : 25/03/2019, 15:47:14
    Author     : a
--%>

<%@page import="br.com.fatecpg.oo.BD"%>
<%@page import="br.com.fatecpg.oo.Contato"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    if (request.getParameter("adicionar") != null) {
        String nome = request.getParameter("nome");
        String telefone = request.getParameter("telefone");
        String email = request.getParameter("email");
        Contato novoContato = new Contato();
        novoContato.setNome(nome);
        novoContato.setTelefone(telefone);
        novoContato.setEmail(email);
        BD.getContatosList().add(novoContato);
        response.sendRedirect(request.getRequestURI());
    } else if (request.getParameter("excluir") != null) {
        String resposta = request.getParameter("excluir");
        if (resposta.equals("Sim")) {
            int id = Integer.parseInt(request.getParameter("id"));
            BD.getContatosList().remove(id);
        }
        response.sendRedirect(request.getRequestURI());
    } else if (request.getParameter("alterar") != null) {
        String resposta = request.getParameter("alterar");
        if (resposta.equals("Sim")) {
            int id = Integer.parseInt(request.getParameter("id"));
            Contato novoContato = new Contato();
            novoContato.setNome(request.getParameter("nome"));
            novoContato.setTelefone(request.getParameter("telefone"));
            novoContato.setEmail(request.getParameter("email"));
            BD.getContatosList().set(id, novoContato);

        }
        response.sendRedirect(request.getRequestURI());
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contatos WebApp</title>
    </head>
    <body>
        <h1>WebApp</h1>
        <h2>Contatos</h2>
        <h1>HUEEEEEEEEEEEEEEEEEEEEEEEEEEE</h1>
        <form action="adicionar.jsp">
            <input type="submit" value="Adicionar">
        </form>
        <h3>Listagem</h3>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Telefone</th>
                <th>Email</th>
                <th>Comandos</th>
            </tr>
            <%for (Contato c : BD.getContatosList()) {%>
            <tr>
                <%int id = BD.getContatosList().indexOf(c);%>

                <td><%= id%></td>
                <td><%= c.getNome()%></td>
                <td><%= c.getTelefone()%></td>
                <td><%= c.getEmail()%></td>
                <td>
                    <a href="alterar.jsp?id=<%=id%>">
                        <button>Alterar</button>

                    </a>
                    <a href="excluir.jsp?id=<%=id%>">
                        <button>Excluir</button>
                    </a>
                </td>
            </tr>

            <%}%>
        </table>

    </body>
</html>
