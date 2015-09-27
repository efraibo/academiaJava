package br.com.senai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;;

@Entity
@Table(name = "professor")
public class Professor extends Pessoa{

	
	@Column(name = "instituicao", length = 50, nullable = false)
	private String instituicaoEnsino;
	
	@Column(name = "dtAdmissao", length = 30, nullable = false)
	private String dtAdmissao;
	/*@Temporal(TemporalType.DATE)
	private Date dtAdmissao;*/	
	
	@ManyToOne	
	private Titulacao titulacao;
	

	public String getInstituicaoEnsino() {
		return instituicaoEnsino;
	}

	public void setInstituicaoEnsino(String instituicaoEnsino) {
		this.instituicaoEnsino = instituicaoEnsino;
	}

	public String getDtAdmissao() {
		return dtAdmissao;
	}

	public void setDtAdmissao(String dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}
	
	
	
	public Titulacao getTitulacao() {
		return titulacao;
	}

	/*public Date getDtAdmissao() {
		return dtAdmissao;
	}

	public void setDtAdmissao(Date dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}
*/
	public void setTitulacao(Titulacao titulacao) {
		this.titulacao = titulacao;
	}
	
}
