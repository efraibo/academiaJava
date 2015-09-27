package br.com.senai;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@ManagedBean

@Entity
@Table(name = "usuario")
public class UsuarioBean {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "name", length = 30, nullable = false)	
	private String nome;
	
	@Column(name = "senha", length = 10, nullable = false)
	private String senha;
	
	@Column(name = "email", length = 30, nullable = false)
	private String email;	
	
	
	
	public UsuarioBean() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void nomeFoiDigitado(){
		System.out.println("\nUsuarioBean");
	}

}
