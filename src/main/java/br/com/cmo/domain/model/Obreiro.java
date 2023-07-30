/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cmo.domain.model;

import br.com.cmo.domain.enums.Ativo;
import br.com.cmo.domain.enums.Cargo;
import com.fasterxml.jackson.annotation.JsonRootName;
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
 * @date 10/01/2019 Alterado em 08/09/2020
 */

@Getter
@Setter
@ToString
@ConstructorBinding
@DynamicUpdate
@Entity
@Table(name = "obreiros")
@JsonRootName(value = "obreiro")
public class Obreiro  implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="id_menbro_fk")
	private Menbro menbro;
	
	private boolean conjugeEvangelico;

	private boolean batizadoEspiritoSanto;

	@Enumerated(EnumType.STRING)
	private Cargo cargo;

	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dataReconhecimento;

	@OneToOne
	@JoinColumn(name="id_historico_fk")
	private HistoricoObreiro historicoObreiro;

	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dataReconhecimentoGargo;

	@Enumerated(EnumType.STRING)
	private Ativo flagAtivacao;
	
}
