<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Cadastro de aluno</title>
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
		<form action="formularioAluno?acao=alterar" method="post">

			<table class="table">
				<tr>
					<td>
						<input type="hidden" name="id" value="${aluno.id}"/>
					</td>
				</tr>
				<tr>
					<td><input id="nome" class="form-control" type="text"
						name="nome" placeholder="Nome" value="${aluno.nome}" /></td>
				</tr>
				<tr>
					<td><input class="form-control" type="text" name="matricula"
						placeholder="Matrícula"  value="${aluno.matricula}"/></td>
				</tr>
				<tr>
					<td><input class="form-control" type="text" name="logradouro"
						placeholder="Logradouro"  value="${aluno.logradouro}"/></td>
				</tr>
				<tr>
					<td><input class="form-control" type="text" name="cep"
						placeholder="Cep"  value="${aluno.cep}"/></td>
				</tr>
				<tr>
					<td><input class="form-control" type="text" name="complemento"
						placeholder="Complemento"  value="${aluno.complemento}"/></td>
				</tr>
				<tr>
					<td><input class="form-control" type="text" name="dataNascimento"
						placeholder="Data de Nascimento"  value="${aluno.dataNascimento}"/></td>
				</tr>
				<tr>
					<td>
						<select name="usuario" class="form-control">
							<option value="">Selecione um usuário</option>
							<option selected="selected" value="${usuarioselecionado.id}">${usuarioselecionado.nome}</option>
							<c:forEach var="usuario" items="${usuarios}">
								<option value="${usuario.id}">${usuario.nome}</option>
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="alterar"
						class="btn btn-primary btn-block" /></td>
				</tr>
			</table>

		</form>
	</div>
</body>
</html>