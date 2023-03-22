package com.projetoagenda.agenda.entitys.pessoa;

import javax.persistence.InheritanceType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // @Inheritance define a estratégia
public abstract class Pessoa {
	
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;

	
	
	public Pessoa() {}
	public Pessoa(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
	
}
