package br.com.senai.view;

import java.util.List;
import java.util.Random;

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
import br.com.senai.support.Fachada;

@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Named(value = "alunoEditMB")
public class AlunoEditMB {

	@Autowired	
	private Fachada fachada;
	
	private Aluno aluno;
	private Sexo sexo;
	private TipoPessoa tipoPessoa;	
	
	
	public List<Endereco> getListaEndereco(){
		return fachada.listarEndereco();
	}
	
	public List<Telefone> getListaTelefone(){
		return fachada.listarTelefone();
	}
	
	@PostConstruct
	private void init() {		
		aluno = new Aluno();		
	}

	public void preAlterar(Aluno aluno) {
		setAluno(aluno);
		
	}

	public String salvar() {
		//gerar a matricula randomicamente(Automaticamente)
		int matricula = Math.abs(new Random().nextInt());
		aluno.setMatricula(matricula);
		fachada.salvarAluno(aluno);		
		return "success";
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
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
	
}
