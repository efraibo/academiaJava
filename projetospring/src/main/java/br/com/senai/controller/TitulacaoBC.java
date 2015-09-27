package br.com.senai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.senai.model.Titulacao;
import br.com.senai.model.repository.ITitulacaoDAO;


@Controller
public class TitulacaoBC {

	@Autowired
	private ITitulacaoDAO dao;

	public void salvarTitulacao(Titulacao titulacao) {
		dao.save(titulacao);
	}

	public void excluirTitulacao(Titulacao titulacao) {
		dao.delete(titulacao);
	}

	public List<Titulacao> listarTitulacao() {
		return dao.findAll();
	}

}
