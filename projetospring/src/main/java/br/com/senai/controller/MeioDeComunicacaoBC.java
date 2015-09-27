package br.com.senai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.senai.model.MeioDeComunicacao;
import br.com.senai.model.repository.IMeioDeComunicacaoDAO;


@Controller
public class MeioDeComunicacaoBC {

	@Autowired
	private IMeioDeComunicacaoDAO dao;

	public void salvarMeioDeComunicacao(MeioDeComunicacao meioDeComunicacao) {
		dao.save(meioDeComunicacao);
	}

	public void excluirMeioDeComunicacao(MeioDeComunicacao meioDeComunicacao) {
		dao.delete(meioDeComunicacao);
	}

	public List<MeioDeComunicacao> listarMeioDeComunicacao() {
		return dao.findAll();
	}

}
