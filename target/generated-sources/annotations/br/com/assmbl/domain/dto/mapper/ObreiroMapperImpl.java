package br.com.assmbl.domain.dto.mapper;

import br.com.assmbl.domain.dto.request.HistoricoObreiroDTO;
import br.com.assmbl.domain.dto.request.ObreiroDTO;
import br.com.assmbl.domain.enums.Cargo;
import br.com.assmbl.domain.model.HistoricoObreiro;
import br.com.assmbl.domain.model.Obreiro;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-03T08:12:19-0300",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.0.v20210708-0430, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class ObreiroMapperImpl implements ObreiroMapper {

    @Override
    public Obreiro toModel(ObreiroDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Obreiro obreiro = new Obreiro();

        obreiro.setDataReconhecimento( dto.getDataReconhecimento() );
        obreiro.setDataReconhecimentoGargo( dto.getDataReconhecimentoGargo() );
        obreiro.setBatizadoEspiritoSanto( dto.isBatizadoEspiritoSanto() );
        if ( dto.getCargo() != null ) {
            obreiro.setCargo( Enum.valueOf( Cargo.class, dto.getCargo() ) );
        }
        obreiro.setConjugeEvangelico( dto.isConjugeEvangelico() );
        obreiro.setFlagAtivacao( dto.getFlagAtivacao() );
        obreiro.setHistoricoObreiro( historicoObreiroDTOToHistoricoObreiro( dto.getHistoricoObreiro() ) );
        obreiro.setId( dto.getId() );

        return obreiro;
    }

    @Override
    public ObreiroDTO toDTO(Obreiro dto) {
        if ( dto == null ) {
            return null;
        }

        ObreiroDTO obreiroDTO = new ObreiroDTO();

        obreiroDTO.setBatizadoEspiritoSanto( dto.isBatizadoEspiritoSanto() );
        if ( dto.getCargo() != null ) {
            obreiroDTO.setCargo( dto.getCargo().name() );
        }
        obreiroDTO.setConjugeEvangelico( dto.isConjugeEvangelico() );
        obreiroDTO.setDataReconhecimento( dto.getDataReconhecimento() );
        obreiroDTO.setDataReconhecimentoGargo( dto.getDataReconhecimentoGargo() );
        obreiroDTO.setFlagAtivacao( dto.getFlagAtivacao() );
        obreiroDTO.setHistoricoObreiro( historicoObreiroToHistoricoObreiroDTO( dto.getHistoricoObreiro() ) );
        obreiroDTO.setId( dto.getId() );

        return obreiroDTO;
    }

    protected HistoricoObreiro historicoObreiroDTOToHistoricoObreiro(HistoricoObreiroDTO historicoObreiroDTO) {
        if ( historicoObreiroDTO == null ) {
            return null;
        }

        HistoricoObreiro historicoObreiro = new HistoricoObreiro();

        historicoObreiro.setDataConsagracaoDiagono( historicoObreiroDTO.getDataConsagracaoDiagono() );
        historicoObreiro.setDataConsagracaoEvangelista( historicoObreiroDTO.getDataConsagracaoEvangelista() );
        historicoObreiro.setDataConsagracaoMissionario( historicoObreiroDTO.getDataConsagracaoMissionario() );
        historicoObreiro.setDataConsagracaoPastor( historicoObreiroDTO.getDataConsagracaoPastor() );
        historicoObreiro.setDataConsagracaoPresbitero( historicoObreiroDTO.getDataConsagracaoPresbitero() );
        historicoObreiro.setDataSeperadoCoop( historicoObreiroDTO.getDataSeperadoCoop() );
        historicoObreiro.setId( historicoObreiroDTO.getId() );
        historicoObreiro.setLocalConsagracaoDiacono( historicoObreiroDTO.getLocalConsagracaoDiacono() );
        historicoObreiro.setLocalConsagracaoEvangelista( historicoObreiroDTO.getLocalConsagracaoEvangelista() );
        historicoObreiro.setLocalConsagracaoMissionario( historicoObreiroDTO.getLocalConsagracaoMissionario() );
        historicoObreiro.setLocalConsagracaoPastor( historicoObreiroDTO.getLocalConsagracaoPastor() );
        historicoObreiro.setLocalConsagracaoPresbitero( historicoObreiroDTO.getLocalConsagracaoPresbitero() );
        historicoObreiro.setLocalSeparadoCoop( historicoObreiroDTO.getLocalSeparadoCoop() );
        historicoObreiro.setObservacao( historicoObreiroDTO.getObservacao() );
        historicoObreiro.setProcedencia( historicoObreiroDTO.getProcedencia() );

        return historicoObreiro;
    }

    protected HistoricoObreiroDTO historicoObreiroToHistoricoObreiroDTO(HistoricoObreiro historicoObreiro) {
        if ( historicoObreiro == null ) {
            return null;
        }

        HistoricoObreiroDTO historicoObreiroDTO = new HistoricoObreiroDTO();

        historicoObreiroDTO.setDataConsagracaoDiagono( historicoObreiro.getDataConsagracaoDiagono() );
        historicoObreiroDTO.setDataConsagracaoEvangelista( historicoObreiro.getDataConsagracaoEvangelista() );
        historicoObreiroDTO.setDataConsagracaoMissionario( historicoObreiro.getDataConsagracaoMissionario() );
        historicoObreiroDTO.setDataConsagracaoPastor( historicoObreiro.getDataConsagracaoPastor() );
        historicoObreiroDTO.setDataConsagracaoPresbitero( historicoObreiro.getDataConsagracaoPresbitero() );
        historicoObreiroDTO.setDataSeperadoCoop( historicoObreiro.getDataSeperadoCoop() );
        historicoObreiroDTO.setId( historicoObreiro.getId() );
        historicoObreiroDTO.setLocalConsagracaoDiacono( historicoObreiro.getLocalConsagracaoDiacono() );
        historicoObreiroDTO.setLocalConsagracaoEvangelista( historicoObreiro.getLocalConsagracaoEvangelista() );
        historicoObreiroDTO.setLocalConsagracaoMissionario( historicoObreiro.getLocalConsagracaoMissionario() );
        historicoObreiroDTO.setLocalConsagracaoPastor( historicoObreiro.getLocalConsagracaoPastor() );
        historicoObreiroDTO.setLocalConsagracaoPresbitero( historicoObreiro.getLocalConsagracaoPresbitero() );
        historicoObreiroDTO.setLocalSeparadoCoop( historicoObreiro.getLocalSeparadoCoop() );
        historicoObreiroDTO.setObservacao( historicoObreiro.getObservacao() );
        historicoObreiroDTO.setProcedencia( historicoObreiro.getProcedencia() );

        return historicoObreiroDTO;
    }
}
