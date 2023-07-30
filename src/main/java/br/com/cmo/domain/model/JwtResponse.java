package br.com.cmo.domain.model;

import lombok.*;

import java.io.Serializable;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JwtResponse implements Serializable {

	private static final long serialVersionUID = -8091879091924046844L;

	private String jwttoken;
}
