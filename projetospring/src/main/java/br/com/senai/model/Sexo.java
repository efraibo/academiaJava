package br.com.senai.model;

public enum Sexo {
	
	 M("Masculino"), F("Feminino"),D("Outros");  
	  
    private String descricao;     
   private Sexo(String descricao) {  
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
