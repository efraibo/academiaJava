<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Cadastro de Aluno</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />

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
		<form name="form" action="formularioAluno?acao=inserir" method="post">

			<h4>
				<a href="index.html">Home</a>
			</h4>
			<h4>
				<a href="listarAluno.jsp">Listar aluno</a>
			</h4>

			<table class="table">
				<tr>
					<td><input id="nome" class="form-control" type="text"
						name="nome" placeholder="Nome"  /></td>
				</tr>
				<tr>
					<td><input class="form-control" type="text" name="matricula"
						placeholder="Matrícula"  /></td>
				</tr>
				<tr>
					<td><input class="form-control" type="text" name="logradouro"
						placeholder="Logradouro"  /></td>
				</tr>
				<tr>
					<td><input class="form-control" type="text" name="cep"
						placeholder="Cep"  /></td>
				</tr>
				<tr>
					<td><input class="form-control" type="text" name="complemento"
						placeholder="Complemento"  /></td>
				</tr>
				<tr>
					<td><input class="form-control" type="text" name="dataNascimento"
						placeholder="Data de Nascimento"  /></td>
				</tr>
				<tr>
					<td>
						<select name="usuario" class="form-control">
							<option value="">Selecione um usuário</option>
							<c:forEach var="usuario" items="${usuarios}">
								<option value="${usuario.id}">${usuario.nome}</option>
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td><input id="botaoSalvar"
						type="submit" value="salvar" class="btn btn-primary btn-block" />
					</td>
				</tr>
			</table>

		</form>
	</div>
</body>
</html>