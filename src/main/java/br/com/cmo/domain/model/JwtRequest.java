package br.com.cmo.domain.model;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JwtRequest {
	
	private String username;
	private String password;

}
