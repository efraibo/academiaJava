package br.com.senai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import br.com.senai.model.Aluno;
import br.com.senai.model.repository.IAlunoDAO;


@Controller
public class AlunoBC {

	@Autowired
	private IAlunoDAO dao;

	public void salvarAluno(Aluno aluno) {
		
		dao.save(aluno);
	}

	public void excluirAluno(Aluno aluno) {
		dao.delete(aluno);
	}

	public List<Aluno> listarAluno() {
		return dao.findAll();
	}

}
