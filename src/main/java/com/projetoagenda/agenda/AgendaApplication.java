package com.projetoagenda.agenda;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

import com.projetoagenda.agenda.entity.Agendamento;
import com.projetoagenda.agenda.entity.Cidade;
import com.projetoagenda.agenda.entity.Endereco;
import com.projetoagenda.agenda.entity.Servico;
import com.projetoagenda.agenda.entity.UF;
import com.projetoagenda.agenda.entitys.pessoa.Cliente;
import com.projetoagenda.agenda.entitys.pessoa.Profissional;
import com.projetoagenda.agenda.repositories.AgendamentoRepository;
import com.projetoagenda.agenda.repositories.CidadeRepositoty;
import com.projetoagenda.agenda.repositories.ClienteRepository;
import com.projetoagenda.agenda.repositories.EnderecoRepository;
import com.projetoagenda.agenda.repositories.ProfissionalRepository;
import com.projetoagenda.agenda.repositories.ServicoRepository;

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
	@Autowired
	private ServicoRepository servicoRepo;
	@Autowired
	private AgendamentoRepository agendaRepo;;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Cidade cida1 = new Cidade();
		cida1.setId(null);
		cida1.setNome("Campinas");
		cida1.setUf(UF.SP);
		
		Cidade cida2 = new Cidade();
		cida2.setId(null);
		cida2.setNome("Hortolandia");
		cida2.setUf(UF.SP);
		
		cidadeRepo.saveAll(Arrays.asList(cida1, cida2));
		
		Endereco end1 = new Endereco();
		end1.setCidade(cida1);
		end1.setLogradouro("Rua Américo Bueno");
		end1.setNumero("34");
		end1.setComplemento(null);
		end1.setBairro("Bom Jesus");
		end1.setCidade(cida1);
		
		
		Endereco end2 = new Endereco();
		end2.setCidade(cida1);
		end2.setLogradouro("Rua Transeunte Moreno");
		end2.setNumero("1234");
		end2.setComplemento(null);
		end2.setBairro("Satira Josun");
		end2.setCidade(cida2);
		
		Endereco end3 = new Endereco();
		end3.setCidade(cida1);
		end3.setLogradouro("Rua Thereza Branquela");
		end3.setNumero("343");
		end3.setComplemento(null);
		end3.setBairro("Sapo Boi");
		end3.setCidade(cida1);
		
		
		enderRepo.saveAll(Arrays.asList(end1,end2, end3));
	
		
		
		Cliente cli1 = new Cliente();
		cli1.setNome("Fulano beltrano");
		cli1.setCpf("123132135135");
		cli1.setId(null);
		cli1.setEmail("fulano@gmail.com");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		cli1.setData_nasc(sdf.parse("03/04/1968"));
		cli1.setTelefone("19991021215");
		
		cli1.getEnderecos().addAll(Arrays.asList(end2));
	
		
		end1.setPessoa(cli1);
		
		
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
		
		
		Profissional prof1 = new Profissional();
		prof1.setId(null);
		prof1.setNome("Maria Bonita");
		prof1.setCpf("14415153213");
		prof1.setEmail("maria@bonarte.com.br");
		//SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		prof1.setData_nasc( sdf.parse("07/01/1995"));
		prof1.setTelefone("989898989");
		prof1.getEnderecos().addAll(Arrays.asList(end3));
		
		
		profissionalRepo.save(prof1);
		
		
		Servico serv1 = new Servico();
		serv1.setId(null);
		serv1.setNomeDoServico("Corte Cabelo");
		serv1.setValor(45.90);
		serv1.setPessoa(Arrays.asList(prof1));
		servicoRepo.save(serv1);
				
		Servico serv2 = new Servico();
		serv2.setId(null);
		serv2.setNomeDoServico("Hidratação");
		serv2.setValor(25.10);
		serv2.setPessoa(Arrays.asList(prof1));
		servicoRepo.save(serv2);
		
	
		
		 LocalDate date   = LocalDate.of(2023, 12, 31);
		 LocalTime time = LocalTime.of(8, 30, 45);
		Agendamento agenda1 = new Agendamento();
		agenda1.setData(date,time);
		agenda1.setId(null);
		//agenda1.setServicos(serv1);
	
		agendaRepo.save(agenda1);
	}
	
	

}
