package br.com.cmo.domain.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

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
