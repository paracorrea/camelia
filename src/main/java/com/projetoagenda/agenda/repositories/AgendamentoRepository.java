package com.projetoagenda.agenda.repositories;

import javax.persistence.Id;

import com.projetoagenda.agenda.entity.Agendamento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento , Id> {

	



}
