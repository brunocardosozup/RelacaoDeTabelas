package com.br.relacao.de.tabelas.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Login implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank(message = "Apelido não pode ficar em branco")
	@Size(min = 4, message = "Apelido tem que ter no mínimo 4 letras")
	private String apelido;
	
	@NotBlank(message = "Senha não pode ficar em branco")
	@Size(min = 2, message = "Senha tem que ter no mínimo 8 caracteres")
	private String senha;
	
	@OneToOne(cascade = {CascadeType.ALL})
	private Usuario usuario;

	
	public Login() {
		
	}

	public Login(Integer id, String apelido, String senha, Usuario usuario) {
		
		this.id = id;
		this.apelido = apelido;
		this.senha = senha;
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}
