package br.com.assmbl.domain.dto.request;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class UsuarioDTO {
	
	@JsonIgnore
	private Long id;
	
	@NotEmpty(message = "{NotEmpty.usuario.username}")
	private String username;
	
	@NotEmpty(message = "{NotEmpty.usuario.password}")
	private String password;
	
}
