package br.com.senai.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.senai.model.Telefone;
import br.com.senai.support.Fachada;

@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Named(value = "telefoneListMB")
public class TelefoneListMB {

	@Inject
	private Fachada fachada;

	private List<Telefone> listaTelefone;

	@PostConstruct
	private void init() {
		setListaTelefone(listarTelefone());
	}

	private List<Telefone> listarTelefone() {
		return fachada.listarTelefone();
	}

	public void excluir(Telefone telefone) {
		fachada.excluirTelefone(telefone);
		setListaTelefone(listarTelefone());
	}

	public List<Telefone> getListaTelefone() {
		return listaTelefone;
	}

	public void setListaTelefone(List<Telefone> listaTelefone) {
		this.listaTelefone = listaTelefone;
	}

}
