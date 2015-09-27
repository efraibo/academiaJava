package br.com.senai.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.model.Aluno;

public interface IAlunoDAO extends JpaRepository<Aluno, Long>{

}
