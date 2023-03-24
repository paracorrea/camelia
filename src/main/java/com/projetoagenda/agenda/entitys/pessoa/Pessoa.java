package com.projetoagenda.agenda.entitys.pessoa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.projetoagenda.agenda.entity.Endereco;
import com.projetoagenda.agenda.entity.Servico;


@Entity
@Table(name="pessoas")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // @Inheritance define a estratégia
public abstract class Pessoa {
	
	
	@Id
	@GeneratedValue
	private Integer id;
	
	
	private String nome;
	private String email;
	private Date  data_nasc;
	private String telefone;
	
	@OneToMany(mappedBy = "pessoa")
	private List<Endereco> enderecos = new ArrayList<>();
	
	
	
	@ManyToMany(mappedBy = "pessoas")
	private List<Servico> servicos;
	
	
	
	public Pessoa() {
		super();
	}


	public Pessoa(Integer id, String nome, String email, Date data_nasc, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.data_nasc = data_nasc;
		this.telefone = telefone;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getData_nasc() {
		return data_nasc;
	}


	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	
	public List<Servico> getServicos() {
		return servicos;
	}


	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}


	public List<Endereco> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(id, other.id);
	}
	
	
	

	
	
}
