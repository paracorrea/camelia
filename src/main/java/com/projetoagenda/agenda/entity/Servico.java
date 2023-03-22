package com.projetoagenda.agenda.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.projetoagenda.agenda.entitys.pessoa.Pessoa;


@Entity
public class Servico implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nomeDoServico;
	private Double valor;
	
	@ManyToMany
	@JoinTable(name = "SERVICO_PROFISSIONAL",
			joinColumns = @JoinColumn(name ="servico_id"),
			inverseJoinColumns = @JoinColumn(name ="pessoa_id")
		)
		private List<Pessoa> pessoa = new ArrayList<>();

}
