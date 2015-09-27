package br.com.senai.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.senai.model.MeioDeComunicacao;
import br.com.senai.support.Fachada;

@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Named(value = "meioDeComunicacaoListMB")
public class MeioDeComunicacaoListMB {

	@Inject
	private Fachada fachada;

	private List<MeioDeComunicacao> listaMeioDeComunicacao;

	@PostConstruct
	private void init() {
		setListaMeioDeComunicacao(listarMeioDeComunicacao());
	}

	private List<MeioDeComunicacao> listarMeioDeComunicacao() {
		return fachada.listarMeioDeComunicacao();
	}

	public void excluir(MeioDeComunicacao meioDeComunicacao) {
		fachada.excluirMeioDeComunicacao(meioDeComunicacao);
		setListaMeioDeComunicacao(listarMeioDeComunicacao());
	}

	public List<MeioDeComunicacao> getListaMeioDeComunicacao() {
		return listaMeioDeComunicacao;
	}

	public void setListaMeioDeComunicacao(List<MeioDeComunicacao> listaMeioDeComunicacao) {
		this.listaMeioDeComunicacao = listaMeioDeComunicacao;
	}

}
