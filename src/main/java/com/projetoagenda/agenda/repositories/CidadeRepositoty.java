package com.projetoagenda.agenda.repositories;

import javax.persistence.Id;

import com.projetoagenda.agenda.entity.Cidade;



import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepositoty extends JpaRepository<Cidade , Id> {



}
