package br.com.senai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "aluno")
public class Aluno extends Pessoa {
	
	
	@GeneratedValue
	@Column(name = "matricula", nullable = false)
	private int matricula;
	
	
	@ManyToOne
	private Professor professor;
	
	
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}	
	
}
