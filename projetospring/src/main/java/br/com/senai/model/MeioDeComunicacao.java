package br.com.senai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "meio_comunicacao")
public class MeioDeComunicacao extends EntidadeBase<Long>{	
	
	
	@Column(name = "descricao", length = 100, nullable = false)
	private String descricao;
	
	/*
	@Column(name = "publicacao")
	private Publicacao publicacao;	
	*/
	
	public MeioDeComunicacao() {
		super();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
/*
	public Publicacao getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(Publicacao publicacao) {
		this.publicacao = publicacao;
	}
*/	
}
