package com.projetoagenda.agenda.repositories;

import javax.persistence.Id;

import com.projetoagenda.agenda.entitys.pessoa.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente , Id> {

	Cliente findById(Integer id);

}
