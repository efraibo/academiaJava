package br.com.senai;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formularioUsuario")
public class FormularioUsuario extends HttpServlet {

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
		}

	}

	private void alterar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");
		String email = request.getParameter("email");
		int id = Integer.parseInt(request.getParameter("id"));

		Usuario usuario = new Usuario(id, nome, senha, email);

		UsuarioDAO dao = new UsuarioDAO();
		dao.alterar(usuario);

		request.getRequestDispatcher("/listarUsuario.jsp").forward(request,
				response);

	}

	private void prealterar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		UsuarioDAO dao = new UsuarioDAO();
		int idUsuario = Integer.parseInt(request.getParameter("id"));

		Usuario usuario = dao.buscar(idUsuario);

		request.setAttribute("usuario", usuario);

		request.getRequestDispatcher("/formularioUsuarioAlterar.jsp").forward(
				request, response);

	}

	private void inserir(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");
		String email = request.getParameter("email");
		Usuario usuario = new Usuario(nome, senha, email);

		UsuarioDAO dao = new UsuarioDAO();

		dao.inserir(usuario);

		String[] telefones = request.getParameterValues("telefone[]");

		TelefoneDAO tdao = new TelefoneDAO();
		for (String telefone : telefones) {
			Telefone tel = new Telefone();
			tel.setNumero(telefone);
			tel.setUsuario(usuario);
			tdao.inserir(tel);
		}

		request.getRequestDispatcher("/listarUsuario.jsp").forward(request,
				response);
	}

	private void excluir(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		UsuarioDAO dao = new UsuarioDAO();

		dao.excluir(Integer.parseInt(request.getParameter("id")));

		request.getRequestDispatcher("/listarUsuario.jsp").forward(request,
				response);

	}

}
