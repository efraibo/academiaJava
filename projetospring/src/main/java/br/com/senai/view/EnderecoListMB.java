package br.com.senai.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.senai.model.Endereco;
import br.com.senai.support.Fachada;

@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Named(value = "enderecoListMB")
public class EnderecoListMB {

	@Inject
	private Fachada fachada;

	private List<Endereco> listaEndereco;

	@PostConstruct
	private void init() {
		setListaEndereco(listarEndereco());
	}

	private List<Endereco> listarEndereco() {
		return fachada.listarEndereco();
	}

	public void excluir(Endereco endereco) {
		fachada.excluirEndereco(endereco);
		setListaEndereco(listarEndereco());
	}

	public List<Endereco> getListaEndereco() {
		return listaEndereco;
	}

	public void setListaEndereco(List<Endereco> listaEndereco) {
		this.listaEndereco = listaEndereco;
	}

}
