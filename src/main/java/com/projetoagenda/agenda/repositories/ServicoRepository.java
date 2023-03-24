package com.projetoagenda.agenda.repositories;

import javax.persistence.Id;

import com.projetoagenda.agenda.entity.Servico;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico , Id> {



}
