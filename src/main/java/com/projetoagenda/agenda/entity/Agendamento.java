package com.projetoagenda.agenda.entity;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="agenda")
public class Agendamento  implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;
	
	private LocalDateTime data;
	


	    public void setData(LocalDateTime data) {
	        if (data.getDayOfWeek() == DayOfWeek.SUNDAY || data.getDayOfWeek() == DayOfWeek.MONDAY) {
	            throw new IllegalArgumentException("Os agendamentos só podem ser feitos de terça a sábado.");
	        }

	        if (data.getHour() < 8 || data.getHour() >= 18) {
	            throw new IllegalArgumentException("Os agendamentos só podem ser feitos entre as 8h e 18h.");
	        }

	        this.data = data;
	    }

	public Agendamento() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDate date, LocalTime time) {
		// TODO Auto-generated method stub
		
	}
	    
	
	    
	}

	

