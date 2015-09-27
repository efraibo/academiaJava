package br.com.senai.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.senai.model.Aluno;
import br.com.senai.model.Endereco;
import br.com.senai.model.Professor;
import br.com.senai.model.Sexo;
import br.com.senai.model.Telefone;
import br.com.senai.model.TipoPessoa;
import br.com.senai.model.Titulacao;
import br.com.senai.support.Fachada;

@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Named(value = "professorEditMB")
public class ProfessorEditMB {

	@Autowired
	private Fachada fachada;

	private Professor professor;
	private Sexo sexo;
	private TipoPessoa tipoPessoa;
	
	private Titulacao titulacao;
	
	public List<Endereco> getListaEndereco(){
		return fachada.listarEndereco();
	}
	
	public List<Telefone> getListaTelefone(){
		return fachada.listarTelefone();
	}
	
	public List<Titulacao> getListaTitulacao(){
		return fachada.listarTitulacao();
	}
	
	@PostConstruct
	private void init() {		
		professor = new Professor();
	}

	public void preAlterar(Professor professor) {
		setProfessor(professor);
	}

	public String salvar() {
		fachada.salvarProfessor(professor);
		return "success";
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Sexo[] getSexo() {
		return sexo.values();
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public TipoPessoa[] getTipoPessoa() {
		return tipoPessoa.values();
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	
	public Titulacao getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(Titulacao titulacao) {
		this.titulacao = titulacao;
	}
	
}
