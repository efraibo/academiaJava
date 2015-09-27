<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Cadastro de Usuario</title>
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
		<form action="formularioUsuario?acao=alterar" method="post">

			<table class="table">
				<tr>
					<td>
						<input type="hidden" name="id" value="${usuario.id}"/>
					</td>
				</tr>
				<tr>
					<td><input class="form-control" type="text" name="nome"
						placeholder="Nome" value="${usuario.nome}" /></td>
				</tr>
				<tr>
					<td><input class="form-control" type="password" name="senha"
						placeholder="Senha" value="${usuario.senha}"/></td>
				</tr>
				<tr>
					<td><input class="form-control" type="text" name="email"
						placeholder="Email" value="${usuario.email}"/></td>
				</tr>	
				 			
				<tr>
					<td colspan="2"><input type="submit" value="alterar"
						class="btn btn-primary btn-block" /></td>
				</tr>
			</table>
			
			
		      
			<%-- <h4>Telefones</h4>
			
			<div id="Lista_telefone" class="container">
			<c:forEach var="telefone" items="${telefones}">
			 <input class="form-control" type="text" id="${telefone.id}"
			 name="telefone[]">${telefone.numero}</input>
			</c:forEach>			
			</div> --%>
			

		</form>
	</div>
</body>
</html>