<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Cadastro de Usuario</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />

<script type="text/javascript">
	function validarCampos() {

		var boolNome = document.form.nome.value == "";
		var boolSenha = document.form.senha.value == "";
		var boolEmail = document.form.email.value == "";

		if (boolNome) {
			document.form.nome.style.backgroundColor = "#FFCC99";
		}

		if (boolSenha) {
			document.form.senha.style.backgroundColor = "#FFCC99";
		}

		if (boolEmail) {
			document.form.email.style.backgroundColor = "#FFCC99";
		}

		if (!boolNome && !boolSenha && !boolEmail) {
			document.form.submit();
		}
	}

	function mudarCor() {

		var boolNome = document.form.nome.value == "";
		var boolSenha = document.form.senha.value == "";
		var boolEmail = document.form.email.value == "";

		if (!boolNome) {
			document.form.nome.style.backgroundColor = "#FFFFFF";
		}

		if (!boolSenha) {
			document.form.senha.style.backgroundColor = "#FFFFFF";
		}

		if (!boolEmail) {
			document.form.email.style.backgroundColor = "#FFFFFF";
		}

	}

	function addTelefone() {

		var original = document.getElementById('telefone');
		var clone = original.cloneNode();
		var lista = document.getElementById('lista_telefone');
		if(lista.childElementCount < 3){
			lista.appendChild(clone);
		} else {
			alert("Número máximo de telefones é 3");
		}

	}
</script>

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
		<form name="form" action="formularioUsuario?acao=inserir"
			method="post">

			<h4>
				<a href="index.html">Home</a>
			</h4>
			<h4>
				<a href="listarUsuario.jsp">Listar usuario</a>
			</h4>

			<table class="table">
				<tr>
					<td><input id="nome" class="form-control" type="text"
						name="nome" placeholder="Nome" onkeypress="mudarCor()" /></td>
				</tr>
				<tr>
					<td><input class="form-control" type="password" name="senha"
						placeholder="Senha" onkeypress="mudarCor()" /></td>
				</tr>
				<tr>
					<td><input class="form-control" type="text" name="email"
						placeholder="Email" onkeypress="mudarCor()" /></td>
				</tr>


			</table>
			
			<input type="button" onclick="addTelefone()" value="add telefone"
				class="btn btn-primary btn-block" /> 
				
			<input id="botaoSalvar"
				onclick="validarCampos()" type="button" value="salvar"
				class="btn btn-primary btn-block" />
			<h4>
				Telefones:
				</h4>
				<div id="lista_telefone" class="container">
					<input type="text" class="form-control" id="telefone"
						name="telefone[]" />
				</div>
		</form>
	</div>
</body>
</html>