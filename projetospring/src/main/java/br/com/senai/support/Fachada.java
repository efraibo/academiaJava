package br.com.senai.support;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.senai.controller.AlunoBC;
import br.com.senai.controller.EnderecoBC;
import br.com.senai.controller.MeioDeComunicacaoBC;
import br.com.senai.controller.ProfessorBC;
import br.com.senai.controller.PublicacaoBC;
import br.com.senai.controller.TelefoneBC;
import br.com.senai.controller.TitulacaoBC;
import br.com.senai.controller.UsuarioBC;
import br.com.senai.model.Aluno;
import br.com.senai.model.Endereco;
import br.com.senai.model.MeioDeComunicacao;
import br.com.senai.model.Professor;
import br.com.senai.model.Publicacao;
import br.com.senai.model.Telefone;
import br.com.senai.model.Titulacao;
import br.com.senai.model.Usuario;

@Component
public class Fachada {

	@Autowired
	private UsuarioBC usuarioBC;

	@Autowired
	private MeioDeComunicacaoBC meioDeComunicacaoBC;

	@Autowired
	private TitulacaoBC titulacaoBC;

	@Autowired
	private TelefoneBC telefoneBC;

	@Autowired
	private EnderecoBC enderecoBC;

	@Autowired
	private PublicacaoBC publicacaoBC;

	@Autowired
	private ProfessorBC professorBC;

	@Autowired
	private AlunoBC alunoBC;

	// metodos Usuario
	public void salvarUsuario(Usuario usuario) {
		usuarioBC.salvarUsuario(usuario);
	}

	public void excluirUsuario(Usuario usuario) {
		usuarioBC.excluirUsuario(usuario);
	}

	public List<Usuario> listarUsuario() {
		return usuarioBC.listarUsuario();
	}

	// metodos Meio de comunicação

	public void salvarMeioDeComunicacao(MeioDeComunicacao meioDeComunicacao) {
		meioDeComunicacaoBC.salvarMeioDeComunicacao(meioDeComunicacao);
	}

	public void excluirMeioDeComunicacao(MeioDeComunicacao meioDeComunicacao) {
		meioDeComunicacaoBC.excluirMeioDeComunicacao(meioDeComunicacao);
	}

	public List<MeioDeComunicacao> listarMeioDeComunicacao() {
		return meioDeComunicacaoBC.listarMeioDeComunicacao();
	}

	// metodos Titulacao
	public void salvarTitulacao(Titulacao titulacao) {
		titulacaoBC.salvarTitulacao(titulacao);
	}

	public void excluirTitulacao(Titulacao titulacao) {
		titulacaoBC.excluirTitulacao(titulacao);
	}

	public List<Titulacao> listarTitulacao() {
		return titulacaoBC.listarTitulacao();
	}

	// metodos Telefone
	public void salvarTelefone(Telefone telefone) {
		telefoneBC.salvarTelefone(telefone);
	}

	public void excluirTelefone(Telefone telefone) {
		telefoneBC.excluirTelefone(telefone);
	}

	public List<Telefone> listarTelefone() {
		return telefoneBC.listarTelefone();
	}

	// metodos Endereço
	public void salvarEndereco(Endereco endereco) {
		enderecoBC.salvarEndereco(endereco);
	}

	public void excluirEndereco(Endereco endereco) {
		enderecoBC.excluirEndereco(endereco);
	}

	public List<Endereco> listarEndereco() {
		return enderecoBC.listarEndereco();
	}

	// metodos publicacao

	public void salvarPublicacao(Publicacao publicacao) {
		publicacaoBC.salvarPublicacao(publicacao);
	}

	public void excluirPublicacao(Publicacao publicacao) {
		publicacaoBC.excluirPublicacao(publicacao);
	}

	public List<Publicacao> listarPublicacao() {
		return publicacaoBC.listarPublicacao();
	}

	// metodos professor

	public void salvarProfessor(Professor professor) {
		professorBC.salvarProfessor(professor);
	}

	public void excluirProfessor(Professor professor) {
		professorBC.excluirProfessor(professor);
	}

	public List<Professor> listarProfessor() {
		return professorBC.listarProfessor();
	}

	// metodos Aluno

	public void salvarAluno(Aluno aluno) {
		alunoBC.salvarAluno(aluno);
	}

	public void excluirAluno(Aluno aluno) {
		alunoBC.excluirAluno(aluno);
	}

	public List<Aluno> listarAluno() {
		return alunoBC.listarAluno();
	}

}
