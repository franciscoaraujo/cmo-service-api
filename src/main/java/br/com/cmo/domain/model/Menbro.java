package br.com.cmo.domain.model;

import br.com.cmo.domain.enums.Ativo;
import br.com.cmo.domain.enums.Cargo;
import br.com.cmo.domain.enums.Procedencia;
import br.com.cmo.domain.enums.StatusMenbroAnterior;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author francisco
 * @date 11/01/2019 Alterado em 08/09/2020
 */
@Getter
@Setter
@ToString
@ConstructorBinding
@DynamicUpdate
@Entity
@Table(name = "menbros")
public class Menbro implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_pessoa_fk")
	private Pessoa pessoa;
	
	private LocalDate dataNascimento;
	
	@Column(nullable = true)
	private Long numeroMatricula;// numero da matricula será adicionado na mao

	private String congrecacao;
	
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dataBatismo;
	
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dataAdmissao;

	@Column(name = "conjuge")
	private String nomeConjuge;
	
	private String igrejaBatismo;

	@Enumerated(EnumType.STRING)
	private Cargo cargos;

	@Enumerated(EnumType.STRING)
	private StatusMenbroAnterior statusMenbroAnterior;

	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dataSaida;
	
	@Enumerated(EnumType.STRING)
	private Procedencia procedencia;

	private String observacao;
	
	private String congregacao;
	
	@Enumerated(EnumType.STRING)
	private Ativo flagAtivacao;
}
