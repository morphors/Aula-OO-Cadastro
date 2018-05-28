<%@page import="com.estudo.entidade.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bem Vindo</title>

</head>
<body>

<%
	Usuario usuario = (Usuario)session.getAttribute("usuario");
%>
	<h5>Seja bem vindo <%=usuario.getNome()%> </h5>
	
	<a href="autenticarusuariocontroller.do">Sair do Sistema</a>
</body>
</html>