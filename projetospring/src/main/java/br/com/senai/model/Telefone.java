package br.com.senai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table
public class Telefone extends EntidadeBase<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4255701406306471785L;
	
	@Column(name = "ddd", length = 3, nullable = false)
	private int ddd;
	
	@Column(name = "numero", length = 10, nullable = false)
	private int numero;
	
	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}	
	
}
