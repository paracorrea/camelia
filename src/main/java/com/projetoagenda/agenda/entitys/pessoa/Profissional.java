package com.projetoagenda.agenda.entitys.pessoa;

import javax.persistence.Entity;


@Entity
public class Profissional extends Pessoa {
	
	
	private String cpf;
		  
	  

	public Profissional() {
		super();
	}
	
	
	
	public Profissional(String cpf) {
		super();
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	  
	  
	  
	  
	  
	}
	