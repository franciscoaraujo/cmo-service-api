/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.assmbl.domain.dto.request;

import java.time.LocalDate;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.Valid;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import br.com.assmbl.domain.enums.Ativo;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author francisco
 * @date 10/01/2019 Alterado em 08/09/2020
 */

@Data
@Getter
@Setter
@NoArgsConstructor
public class ObreiroDTO {
	
	@JsonIgnore
	private Long id;
	
	@NotNull
	private Long numeroObreiro;
	
	@Valid
	@JsonIgnore
	private MenbroDTO menbroDTO;
	
	@AssertTrue(message = "{AssertTrue.obreiro.conjugeEvangelico}")
	private boolean conjugeEvangelico;
	
	@AssertTrue(message = "{AssertTrue.obreiro.batizadoEspiritoSanto}")
	private boolean batizadoEspiritoSanto;
	
	@NotEmpty(message = "{NotEmpty.obreiro.cargo}")
	private String cargo;
	
	@NotNull
	private LocalDate dataReconhecimento;
	
	@Valid
	private HistoricoObreiroDTO historicoObreiro;
	
	@NotNull
	private LocalDate dataReconhecimentoGargo;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private Ativo flagAtivacao;
	
	
}
