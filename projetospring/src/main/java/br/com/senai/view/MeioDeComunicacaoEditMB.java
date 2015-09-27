package br.com.senai.view;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.senai.model.MeioDeComunicacao;
import br.com.senai.support.Fachada;

@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Named(value = "meioDeComunicacaoEditMB")
public class MeioDeComunicacaoEditMB {

	@Autowired
	private Fachada fachada;

	private MeioDeComunicacao meioDeComunicacao;

	@PostConstruct
	private void init() {
		meioDeComunicacao = new MeioDeComunicacao();
	}

	public void preAlterar(MeioDeComunicacao meioDeComunicacao) {
		setMeioDeComunicacao(meioDeComunicacao);
	}

	public String salvar() {
		fachada.salvarMeioDeComunicacao(meioDeComunicacao);
		return "success";
	}

	public MeioDeComunicacao getMeioDeComunicacao() {
		return meioDeComunicacao;
	}

	public void setMeioDeComunicacao(MeioDeComunicacao meioDeComunicacao) {
		this.meioDeComunicacao = meioDeComunicacao;
	}

}
