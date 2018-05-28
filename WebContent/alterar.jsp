<%@page import="com.estudo.entidade.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	Usuario usuario = (Usuario)request.getAttribute("usuario");
%>

<p>Alterar Cadastro</p>
	<form action="alterarusuariocontroller.do" method="post">
		Código: 
		<input type="text" name="txtcodigo" readonly="readonly" value="<%=usuario.getCodigo()%>"/>
		Nome:
		<input type="text" name="txtnome" value="<%=usuario.getNome()%> "/>
		Login:
		<input type="text" name="txtlogin" value="<%=usuario.getLogin() %>" />
		Senha:
		<input type="password" name="txtsenha" value="<%=usuario.getSenha()%>" />
		
		<input type="submit" value="Alterar" />
				
	</form>
</body>
</html>