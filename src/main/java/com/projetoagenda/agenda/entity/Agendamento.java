package com.projetoagenda.agenda.entity;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.projetoagenda.agenda.entitys.pessoa.Pessoa;
import com.projetoagenda.agenda.entitys.pessoa.Profissional;

@Entity
public class Agendamento  implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	
	private LocalDateTime data;
	
	 @ManyToMany
	    @JoinTable(
	        name = "agendamento_funcionario_servico",
	        joinColumns = @JoinColumn(name = "id_agendamento"),
	        inverseJoinColumns = {
	            @JoinColumn(name = "id_funcionario"),
	            @JoinColumn(name = "id_servico")
	        }
	    )
	    private List<Pessoa> pessoa;
   
	   @ManyToMany
	    @JoinTable(
	        name = "agendamento_servico_funcionario",
	        joinColumns = @JoinColumn(name = "id_agendamento"),
	        inverseJoinColumns = {
	            @JoinColumn(name = "id_servico"),
	            @JoinColumn(name = "id_funcionario")
	        }
	    )
	    private List<Servico> servicos;

	    // Construtor e getters/setters

	    public void setData(LocalDateTime data) {
	        if (data.getDayOfWeek() == DayOfWeek.SUNDAY || data.getDayOfWeek() == DayOfWeek.MONDAY) {
	            throw new IllegalArgumentException("Os agendamentos só podem ser feitos de terça a sábado.");
	        }

	        if (data.getHour() < 8 || data.getHour() >= 18) {
	            throw new IllegalArgumentException("Os agendamentos só podem ser feitos entre as 8h e 18h.");
	        }

	        this.data = data;
	    }

		public Agendamento() {
			super();
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public List<Pessoa> getPessoa() {
			return pessoa;
		}

		public void setPessoa(List<Pessoa> pessoa) {
			this.pessoa = pessoa;
		}

	

		public List<Servico> getServicos() {
			return servicos;
		}

		public void setServicos(List<Servico> servicos) {
			this.servicos = servicos;
		}

		public LocalDateTime getData() {
			return data;
		}

		public void setData(LocalDate date, LocalTime time) {
			// TODO Auto-generated method stub
			
		}

		public void setServicos(Servico serv1) {
			// TODO Auto-generated method stub
			
		}

		public void setPessoa(Profissional prof1) {
			// TODO Auto-generated method stub
			
		}
	    
	    
	    
	    
	}

	

