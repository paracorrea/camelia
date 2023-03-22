package com.projetoagenda.agenda;

import java.text.SimpleDateFormat;



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
		cli1.setEmail("fulano@gmail.com");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		cli1.setData_nasc(sdf.parse("03/04/1968"));
		cli1.setTelefone("19991021215");
		
		clienteRepository.save(cli1);
		
		
		Profissional prof1 = new Profissional();
		prof1.setId(null);
		prof1.setNome("Maria Bonita");
		prof1.setCpf("14415153213");
		prof1.setEmail("maria@bonarte.com.br");
		//SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		prof1.setData_nasc( sdf.parse("07/01/1995"));
		prof1.setTelefone("989898989");
		profissionalRepo.save(prof1);
		
	}

}
