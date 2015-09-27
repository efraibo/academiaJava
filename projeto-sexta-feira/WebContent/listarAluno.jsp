<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page import="br.com.senai.Aluno"%>
<%@page import="java.util.List"%>
<%@page import="br.com.senai.AlunoDAO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
<title>Listar Aluno</title>
<style>
.jumbotron {
	width: 700px;
	text-align: center;
	margin-left: auto;
	margin-right: auto;
	margin-top: 20px;
}

.table {
	width: 650px;
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
		<h4><a href="formularioAluno?acao=preinserir">Cadastrar aluno</a></h4>
		<%
			AlunoDAO dao = new AlunoDAO();
			List<Aluno> listaAluno = dao.listarAluno();
		%>
		<table class="table">
			<tr>
				<th>Nome</th>
				<th>Matricula</th>
				<th>Logradouro</th>
				<th>Cep</th>
				<th>Complemento</th>
				<th>Data de Nascimento</th>
				<th>Usuário Vinculado</th>
				<th></th>
			</tr>
			<%
				for (Aluno aluno : listaAluno) {
			%>
			<tr>
				<td><%=aluno.getNome()%></td>
				<td><%=aluno.getMatricula()%></td>
				<td><%=aluno.getLogradouro()%></td>
				<td><%=aluno.getCep()%></td>
				<td><%=aluno.getComplemento()%></td>
				<td><%=aluno.getDataNascimento()%></td>
				<td><%
					if(aluno.getUsuario() != null){
					%>
					
						<%=aluno.getUsuario().getNome() %>
					
					<%	
					}
					%>
				
				</td>
				<td><a
					href="formularioAluno?acao=prealterar&id=<%=aluno.getId()%>">Alterar</a></td>
				<td><a
					href="formularioAluno?acao=excluir&id=<%=aluno.getId()%>">Excluir</a></td>
			</tr>
			<%
				}
			%>
		</table>
	</div>

</body>
</html>