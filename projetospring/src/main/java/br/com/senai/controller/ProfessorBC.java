package br.com.senai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import br.com.senai.model.Professor;
import br.com.senai.model.repository.IProfessorDAO;


@Controller
public class ProfessorBC {

	@Autowired
	private IProfessorDAO dao;

	public void salvarProfessor(Professor professor) {
		
		dao.save(professor);
	}

	public void excluirProfessor(Professor professor) {
		dao.delete(professor);
	}

	public List<Professor> listarProfessor() {
		return dao.findAll();
	}

}
