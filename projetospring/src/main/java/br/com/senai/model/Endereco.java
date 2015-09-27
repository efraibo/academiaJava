package br.com.senai.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "endereco")
public class Endereco extends EntidadeBase<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5963552772369710785L;

	@Column(name = "logradouro", length = 200, nullable = false)
	private String logradouro;

	@Column(name = "bairro", length = 100, nullable = false)
	private String bairro;

	// falta validação
	@Column(name = "numero", length = 10, nullable = false)
	private int numero;

	
	@Column(name = "uf", length = 2 ,nullable = false)
	private String uf;
	
	@Enumerated(EnumType.ORDINAL)
	private Cidade cidade;
	

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}


}
