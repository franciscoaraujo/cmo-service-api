package br.com.cmo.domain.model;

import br.com.cmo.domain.enums.Procedencia;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Getter
@Setter
@ToString
@EqualsAndHashCode
@ConstructorBinding
@DynamicUpdate
@Entity
@Table(name = "historicos_obreiros")
public class HistoricoObreiro implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dataSeperadoCoop;

	private String localSeparadoCoop;

	@DateTimeFormat(iso = ISO.DATE)
	private String dataConsagracaoDiagono;

	private String localConsagracaoDiacono;

	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dataConsagracaoPresbitero;

	private String localConsagracaoPresbitero;

	@DateTimeFormat(iso = ISO.DATE)
	private String dataConsagracaoEvangelista;

	private String localConsagracaoEvangelista;

	@DateTimeFormat(iso = ISO.DATE)
	private String dataConsagracaoMissionario;

	private String localConsagracaoMissionario;

	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dataConsagracaoPastor;

	private String localConsagracaoPastor;

	@Enumerated(EnumType.STRING)
	private Procedencia procedencia;// Convencao, Ministerio, Campos
	
	private String observacao;

}
