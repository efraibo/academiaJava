package br.com.senai.model;

public enum Cidade {
	
	R("Recife"), E("Escada"), J("Jaboatão do Guararapes");
	
	private String descricao;
	
	private Cidade(String descricao){
		this.descricao = descricao;
	}
	
	public String toString(){
		return this.descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
