package br.com.senai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class  Pessoa extends EntidadeBase<Long> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3578897279868648701L;
	
	
	@Column(name = "nome", length = 100, nullable = false)
	private String nome;
	
	

	@Column(name = "cpf", length = 14, nullable = false)
	private String cpf;		
	
	@ManyToOne
	private Endereco endereco;
	
	@ManyToOne
	private Telefone telefone;
	
	//Verificação de tipo enum
	@Enumerated(EnumType.ORDINAL)
	private Sexo sexo;
	
	
	//Verificação de tipo enum
	@Enumerated(EnumType.STRING)
	private TipoPessoa tipoPessoa;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}	
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}	
	
}

