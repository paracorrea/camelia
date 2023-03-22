package com.projetoagenda.agenda.controller;

import com.projetoagenda.agenda.entitys.pessoa.Cliente;
import com.projetoagenda.agenda.entitys.pessoa.Pessoa;
import com.projetoagenda.agenda.repositories.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/pessoa")
public class PessoaController {
	
	
	@Autowired
	private ClienteRepository service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		
		Pessoa obj = service.findById(id);
		
		return ResponseEntity.ok().body(obj);
		
	}
}
