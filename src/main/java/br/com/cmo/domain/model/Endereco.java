package br.com.cmo.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.boot.context.properties.ConstructorBinding;

import javax.persistence.*;
import java.io.Serializable;

/***
 * 
 * @author arauj Alterado em 08/09/2020
 */
@Data
@Getter
@Setter
@EqualsAndHashCode
@ConstructorBinding
@DynamicUpdate
@Entity
@Table(name = "enderecos")
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private Integer numero;
	private String complemento;
	
}
