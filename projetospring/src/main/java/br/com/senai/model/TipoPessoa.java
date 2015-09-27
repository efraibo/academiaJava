package br.com.senai.model;

public enum TipoPessoa {
	
	 A("Aluno"), P("Professor");  
	  
	    private String descricao;     
	        private TipoPessoa(String descricao) {  
	        this.descricao= descricao;  
	    }  
	  
	    public String getDescricao() {
				return descricao;
			}

			public void setDescricao(String descricao) {
				this.descricao = descricao;
			}

		public String toString() {  
	        return this.descricao;  
	    }  

}
