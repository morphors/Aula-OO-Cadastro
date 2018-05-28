<%@page import="com.estudo.entidade.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listar Usuarios</title>
</head>
<body>
<%
	ArrayList<Usuario> listaUsuarios = (ArrayList<Usuario>)request.getAttribute("lista");
%>
	<h1> Cadastrar novo Usuário</h1>
	<a href="Cadastro.html">Novo!!</a><br/>
	<h1>Buscar Todos Usuarios</h1>
	
	<table border="2" style="" cellspacing="0" align="center" width=80%>
		<thead>
			<tr bgcolor="black" style="color:white">
				<th>Codigo</th><th>Nome</th><th>Login</th><th>Senha</th><th colspan="2">Ação</th>
			</tr>
		</thead>
		<tbody>
			<% for(Usuario usuario:listaUsuarios){ %>
				<tr>
					<td><%=usuario.getCodigo() %></td>
					<td><%=usuario.getNome() %></td>
					<td><%=usuario.getLogin() %></td>
					<td><%=usuario.getSenha() %></td>
					<td><a href="alterarusuariocontroller.do?codigo=<%=usuario.getCodigo()%>">Alterar</a></td>
					<td><a href="excluirusuariocontroller.do?codigo=<%=usuario.getCodigo()%>">Excluir</a></td>
				</tr>
			<% } %>
		</tbody>
	</table>

</body>
</html>
