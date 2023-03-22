package com.projetoagenda.agenda;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import com.projetoagenda.agenda.entity.Cidade;
import com.projetoagenda.agenda.entity.Endereco;
import com.projetoagenda.agenda.entity.UF;
import com.projetoagenda.agenda.entitys.pessoa.Cliente;
import com.projetoagenda.agenda.entitys.pessoa.Profissional;
import com.projetoagenda.agenda.repositories.CidadeRepositoty;
import com.projetoagenda.agenda.repositories.ClienteRepository;
import com.projetoagenda.agenda.repositories.EnderecoRepository;
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
	@Autowired
	private EnderecoRepository enderRepo;
	@Autowired
	private CidadeRepositoty cidadeRepo;
	
	
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Cidade cida1 = new Cidade();
		cida1.setId(null);
		cida1.setNome("Campinas");
		cida1.setUf(UF.SP);
		cidadeRepo.save(cida1);
		
		Endereco end1 = new Endereco();
		end1.setCidade(cida1);
		end1.setLogradouro("Rua Américo Bueno");
		end1.setNumero("34");
		end1.setComplemento(null);
		end1.setBairro("Bom Jesus");
		end1.setCidade(cida1);
		
	
		
		
		Cliente cli1 = new Cliente();
		cli1.setNome("Fulano beltrano");
		cli1.setCpf("123132135135");
		cli1.setId(null);
		cli1.setEmail("fulano@gmail.com");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		cli1.setData_nasc(sdf.parse("03/04/1968"));
		cli1.setTelefone("19991021215");
		end1.setPessoa(cli1);
		cli1.getEnderecos().addAll(Arrays.asList(end1));
		
		Cliente cli2 = new Cliente();
		cli2.setNome("Pedro Augusto");
		cli2.setCpf("1378946784848");
		cli2.setId(null);
		cli2.setEmail("pedro@gmail.com");
		cli2.setData_nasc(sdf.parse("01/02/1987"));
		cli2.setTelefone("19998010218");
		end1.setPessoa(cli2);
		cli2.getEnderecos().addAll(Arrays.asList(end1));
		
		
	
	
		
		
		clienteRepository.saveAll(Arrays.asList(cli1,cli2));
		enderRepo.save(end1);
		
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
