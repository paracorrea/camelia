package com.projetoagenda.agenda.entitys.pessoa;

import javax.persistence.Entity;


@Entity
public class Profissional extends Pessoa {
	
	
	
	 private String cpf;
	  
	  
	  

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	  
	  
	  
	  
	  
	}
	