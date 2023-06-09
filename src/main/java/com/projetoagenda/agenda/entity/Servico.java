package com.projetoagenda.agenda.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.projetoagenda.agenda.entitys.pessoa.Pessoa;


@Entity
@Table(name="Servicos")
public class Servico implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String nomeDoServico;
	private Double valor;
	
	@ManyToMany
	@JoinTable(name = "SERVICO_PROFISSIONAL",
			joinColumns = @JoinColumn(name ="servico_id"),
			inverseJoinColumns = @JoinColumn(name ="pessoa_id")
		)
		private List<Pessoa> pessoas;

	
	
	
	
	
	
	public Servico() {
	
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeDoServico() {
		return nomeDoServico;
	}

	public void setNomeDoServico(String nomeDoServico) {
		this.nomeDoServico = nomeDoServico;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public List<Pessoa> getPessoa() {
		return pessoas;
	}

	public void setPessoa(List<Pessoa> pessoa) {
		this.pessoas = pessoa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Servico other = (Servico) obj;
		return Objects.equals(id, other.id);
	}
	
	
	

}
