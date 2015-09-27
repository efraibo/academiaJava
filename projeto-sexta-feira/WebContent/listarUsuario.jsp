<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page import="br.com.senai.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="br.com.senai.UsuarioDAO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
<title>Listar Usuario</title>
<style>
.jumbotron {
	width: 500px;
	text-align: center;
	margin-left: auto;
	margin-right: auto;
	margin-top: 20px;
}

.table {
	width: 450px;
	margin-top: 20px;
	margin-left: auto;
	margin-right: auto;
}

.form-control {
	width: 350px;
	margin-bottom: 5px;
	margin-left: auto;
	margin-right: auto;
}

.btn-block {
	width: 350px;
	margin-left: auto;
	margin-right: auto;
}
</style>
</head>
<body>
	<div class="jumbotron">
		<h4><a href="index.html">Home</a></h4>
		<h4><a href="formularioUsuario.jsp">Cadastrar usuario</a></h4>
		<%
			UsuarioDAO dao = new UsuarioDAO();
			List<Usuario> listaUsuario = dao.listarUsuario();
		%>
		<table class="table">
			<tr>
				<th>Nome</th>
				<th>Email</th>
				<th>Senha</th>
				<th></th>
			</tr>
			<%
				for (Usuario usuario : listaUsuario) {
			%>
			<tr>
				<td><%=usuario.getNome()%></td>
				<td><%=usuario.getEmail()%></td>
				<td><%=usuario.getSenha()%></td>
				<td><a
					href="formularioUsuario?acao=prealterar&id=<%=usuario.getId()%>">Alterar</a></td>
				<td><a
					href="formularioUsuario?acao=excluir&id=<%=usuario.getId()%>">Excluir</a></td>
			</tr>
			<%
				}
			%>
		</table>
	</div>

</body>
</html>