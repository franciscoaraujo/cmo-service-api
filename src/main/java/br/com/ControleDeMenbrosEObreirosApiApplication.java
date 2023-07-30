package br.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.assmbl.domain.dto.request.EnderecoDTO;
import br.com.assmbl.domain.dto.request.MenbroDTO;
import br.com.assmbl.domain.dto.request.PessoaDTO;

@SpringBootApplication
public class ControleDeMenbrosEObreirosApiApplication {

	public static void main(String[] args) throws JsonProcessingException {
		 SpringApplication.run(ControleDeMenbrosEObreirosApiApplication.class, args);

		//conveterPojoParaJson();

	}

	public static void conveterPojoParaJson() throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		
		EnderecoDTO endereco = new EnderecoDTO();
		PessoaDTO pessoa = new PessoaDTO();
		MenbroDTO menbro = new MenbroDTO();
		
		pessoa.setEndereco(endereco);
		menbro.setPessoa(pessoa);
		
		
		String jsonString = mapper.writeValueAsString(menbro);
		System.out.println(jsonString);
		

	}

}
