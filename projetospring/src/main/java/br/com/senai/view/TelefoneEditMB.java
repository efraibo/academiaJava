package br.com.senai.view;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.senai.model.Telefone;
import br.com.senai.support.Fachada;

@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Named(value = "telefoneEditMB")
public class TelefoneEditMB {

	@Autowired
	private Fachada fachada;
	
	
	private Telefone telefone;

	@PostConstruct
	private void init() {
		telefone = new Telefone();
	}

	public void preAlterar(Telefone telefone) {
		setTelefone(telefone);
	}

	public String salvar() {
		fachada.salvarTelefone(telefone);
		return "success";
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

}
