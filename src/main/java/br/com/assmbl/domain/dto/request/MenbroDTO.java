package br.com.assmbl.domain.dto.request;

import java.time.LocalDate;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import br.com.assmbl.domain.enums.Ativo;
import br.com.assmbl.domain.enums.Cargo;
import br.com.assmbl.domain.enums.Procedencia;
import br.com.assmbl.domain.enums.StatusMenbroAnterior;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author francisco
 * @date 11/01/2019 Alterado em 08/09/2020
 */
@Data
@Getter
@Setter
@NoArgsConstructor
@Validated
public class MenbroDTO {
	
	@JsonIgnore
	private Long id;
	
	@Valid
	private PessoaDTO pessoa;
	
	@NotNull
	private Long numeroMatricula;// numero da matricula será adicionado na mao
	
	@NotEmpty(message = "{NotEmpty.menbro.congregacao}")
	private String congregacao;
	
	@DateTimeFormat(iso = ISO.DATE)
	@NotNull
	private LocalDate dataBatismo;
	
	@DateTimeFormat(iso = ISO.DATE)
	@NotNull
	private LocalDate dataAdmissao;
	
	@NotEmpty(message = "{NotEmpty.menbro.nomeConjuge}")
	private String nomeConjuge;
	
	@NotEmpty(message = "{NotEmpty.menbro.igrejaBatismo}")
	private String igrejaBatismo;
	
	@JsonIgnore	
	private Cargo cargos;
	
	@NotNull
	private StatusMenbroAnterior statusMenbroAnterior;
	
	@DateTimeFormat(iso = ISO.DATE)
	@NotNull
	private LocalDate dataSaida;
	
	@NotNull
	private Procedencia procedencia;
	
	private String observacao;
	
	@NotNull
	private LocalDate dataNascimento;
	
	private Ativo flagAtivacao;
}
