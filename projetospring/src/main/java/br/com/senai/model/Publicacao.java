package br.com.senai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "publicacao")
public class Publicacao extends EntidadeBase<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5963552772369710785L;

	@Column(name = "tituloPublicacao", length = 100, nullable = false)
	private String tituloPublicacao;

	@Column(name = "descricaoPublicacao", length = 500, nullable = false)
	private String descricaoPublicacao;
	
	
	@ManyToOne
	private MeioDeComunicacao meioDeComunicacao;
	
	@ManyToOne
	private Aluno aluno;	


	public String getTituloPublicacao() {
		return tituloPublicacao;
	}


	public void setTituloPublicacao(String tituloPublicacao) {
		this.tituloPublicacao = tituloPublicacao;
	}


	public String getDescricaoPublicacao() {
		return descricaoPublicacao;
	}


	public void setDescricaoPublicacao(String descricaoPublicacao) {
		this.descricaoPublicacao = descricaoPublicacao;
	}


	public MeioDeComunicacao getMeioDeComunicacao() {
		return meioDeComunicacao;
	}


	public void setMeioDeComunicacao(MeioDeComunicacao meioDeComunicacao) {
		this.meioDeComunicacao = meioDeComunicacao;
	}


	public Aluno getAluno() {
		return aluno;
	}


	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
}
