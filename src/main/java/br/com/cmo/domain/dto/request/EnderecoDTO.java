package br.com.cmo.domain.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

/***
 * 
 * @author arauj Alterado em 08/09/2020
 */
@Data
@Getter
@Setter
@NoArgsConstructor
public class EnderecoDTO {
	
	@JsonIgnore
	private Long id;
	
	@NotEmpty(message = "{NotEmpty.endereco.logradouro}")
	private String logradouro;
	
	@NotEmpty(message = "{NotEmpty.endereco.bairro}")
	private String bairro;
	
	@NotEmpty(message = "{NotEmpty.endereco.cidade}")
	private String cidade;
	
	@NotEmpty(message = "{NotEmpty.endereco.estado}")
	private String estado;
	
	@NotEmpty(message = "{NotEmpty.endereco.cep}")
	private String cep;
	
	@NotNull
	private Integer numero;
	
	@NotEmpty(message = "{NotEmpty.endereco.complemento}")
	private String complemento;
	
	private PessoaDTO pessoa;
	
}