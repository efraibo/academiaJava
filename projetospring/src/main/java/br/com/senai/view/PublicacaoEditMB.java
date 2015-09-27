package br.com.senai.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.senai.model.Aluno;
import br.com.senai.model.MeioDeComunicacao;
import br.com.senai.model.Professor;
import br.com.senai.model.Publicacao;
import br.com.senai.support.Fachada;

@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Named(value = "publicacaoEditMB")
public class PublicacaoEditMB {

	@Autowired
	private Fachada fachada;
	private Publicacao publicacao;	
	private MeioDeComunicacao MeioDeComunicacao;
	private Aluno aluno;
	
	
	

	public List<MeioDeComunicacao> getListaMeioDeComunicacao(){
		return fachada.listarMeioDeComunicacao();
	}
	
	public List<Aluno> getListaAluno(){
		return fachada.listarAluno();
	}

	@PostConstruct
	private void init() {
		//alteracao
		publicacao = new Publicacao();
		aluno = new Aluno();		
	}

	public void preAlterar(Publicacao publicacao) {
		setPublicacao(publicacao);
	}

	public String salvar() {		
		fachada.salvarPublicacao(publicacao);
		return "success";
	}

	public Publicacao getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(Publicacao publicacao) {
		this.publicacao = publicacao;
	}

	public MeioDeComunicacao getMeioDeComunicacao() {
		return MeioDeComunicacao;
	}

	public void setMeioDeComunicacao(MeioDeComunicacao meioDeComunicacao) {
		MeioDeComunicacao = meioDeComunicacao;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	

}
