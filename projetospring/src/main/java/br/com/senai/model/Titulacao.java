package br.com.senai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "titulacao")
public class Titulacao extends EntidadeBase<Long>{
	
	@Column(name = "titulo", length = 50, nullable = false)
	private String titulo;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}	
}
