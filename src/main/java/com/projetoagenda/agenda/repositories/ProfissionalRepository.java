package com.projetoagenda.agenda.repositories;

import javax.persistence.Id;

import com.projetoagenda.agenda.entitys.pessoa.Cliente;
import com.projetoagenda.agenda.entitys.pessoa.Profissional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfissionalRepository extends JpaRepository<Profissional , Id> {

	Cliente findById(Integer id);

}
