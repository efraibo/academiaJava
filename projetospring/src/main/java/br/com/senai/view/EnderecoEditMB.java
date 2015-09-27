package br.com.senai.view;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.senai.model.Cidade;
import br.com.senai.model.Endereco;
import br.com.senai.support.Fachada;

@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Named(value = "enderecoEditMB")
public class EnderecoEditMB {

	@Autowired
	private Fachada fachada;	
	
	private Endereco endereco;
	
	private Cidade cidade;
	
	

	public Cidade[] getCidade() {
		return cidade.values();
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	@PostConstruct
	private void init() {
		endereco = new Endereco();
	}

	public void preAlterar(Endereco endereco) {
		setEndereco(endereco);
	}

	public String salvar() {
		fachada.salvarEndereco(endereco);
		return "success";
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
