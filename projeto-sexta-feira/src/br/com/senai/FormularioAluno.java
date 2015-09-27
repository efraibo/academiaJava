package br.com.senai;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formularioAluno")
public class FormularioAluno extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		if (request.getParameter("acao").equals("excluir")) {
			excluir(request, response);
		} else if (request.getParameter("acao").equals("inserir")) {
			inserir(request, response);
		} else if (request.getParameter("acao").equals("prealterar")) {
			prealterar(request, response);
		} else if (request.getParameter("acao").equals("alterar")) {
			alterar(request, response);
		} else if (request.getParameter("acao").equals("preinserir")) {
			preinserir(request, response);
		}

	}

	private void preinserir(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		UsuarioDAO udao = new UsuarioDAO();
		request.setAttribute("usuarios", udao.listarUsuarioDesvinculado());

		request.getRequestDispatcher("/formularioAluno.jsp").forward(request,
				response);

	}

	private void alterar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String matricula = request.getParameter("matricula");
		String logradouro = request.getParameter("logradouro");
		String cep = request.getParameter("cep");
		String complemento = request.getParameter("complemento");
		String dataNascimento = request.getParameter("dataNascimento");
		int id = Integer.parseInt(request.getParameter("id"));

		Aluno aluno = new Aluno(id, nome, matricula, logradouro, cep,
				complemento, dataNascimento);

		AlunoDAO dao = new AlunoDAO();
		dao.alterar(aluno);

		request.getRequestDispatcher("/listarAluno.jsp").forward(request,
				response);

	}

	private void prealterar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		AlunoDAO dao = new AlunoDAO();
		int idAluno = Integer.parseInt(request.getParameter("id"));

		Aluno aluno = dao.buscar(idAluno);

		request.setAttribute("aluno", aluno);
		request.setAttribute("usuarioselecionado", aluno.getUsuario());
		request.setAttribute("usuarios",
				new UsuarioDAO().listarUsuarioDesvinculado());

		request.getRequestDispatcher("/formularioAlunoAlterar.jsp").forward(
				request, response);

	}

	private void inserir(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String matricula = request.getParameter("matricula");
		String logradouro = request.getParameter("logradouro");
		String cep = request.getParameter("cep");
		String complemento = request.getParameter("complemento");
		String dataNascimento = request.getParameter("dataNascimento");
		Aluno aluno = new Aluno(nome, matricula, logradouro, cep, complemento,
				dataNascimento);

		String idUsuario = request.getParameter("usuario");

		if (idUsuario != null && idUsuario != "") {
			Usuario usuario = new UsuarioDAO().buscar(Integer
					.parseInt(idUsuario));

			aluno.setUsuario(usuario);
		}

		AlunoDAO dao = new AlunoDAO();

		dao.inserir(aluno);

		request.getRequestDispatcher("/listarAluno.jsp").forward(request,
				response);
	}

	private void excluir(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		AlunoDAO dao = new AlunoDAO();

		dao.excluir(Integer.parseInt(request.getParameter("id")));

		request.getRequestDispatcher("/listarAluno.jsp").forward(request,
				response);

	}

}
