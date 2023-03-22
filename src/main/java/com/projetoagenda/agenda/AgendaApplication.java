package com.projetoagenda.agenda;

import com.projetoagenda.agenda.entitys.pessoa.Cliente;
import com.projetoagenda.agenda.entitys.pessoa.Profissional;
import com.projetoagenda.agenda.repositories.ClienteRepository;
import com.projetoagenda.agenda.repositories.ProfissionalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AgendaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AgendaApplication.class, args);
	}

	
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ProfissionalRepository profissionalRepo;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Cliente cli1 = new Cliente();
		cli1.setNome("Fulano beltrano");
		cli1.setCpf("123132135135");
		cli1.setId(null);
		
		clienteRepository.save(cli1);
		
		
		Profissional prof1 = new Profissional();
		prof1.setId(null);
		prof1.setNome("Maria Bonita");
		prof1.setCpf("14415153213");
		
		profissionalRepo.save(prof1);
		
	}

}
