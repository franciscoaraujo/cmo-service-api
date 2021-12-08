package br.com.assmbl.domain.dto.mapper;

import br.com.assmbl.domain.dto.request.HistoricoObreiroDTO;
import br.com.assmbl.domain.model.HistoricoObreiro;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-05T02:40:42-0300",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.0.v20210708-0430, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class HistoricoObreiroMapperImpl implements HistoricoObreiroMapper {

    @Override
    public HistoricoObreiro toModel(HistoricoObreiroDTO dto) {
        if ( dto == null ) {
            return null;
        }

        HistoricoObreiro historicoObreiro = new HistoricoObreiro();

        historicoObreiro.setDataConsagracaoPresbitero( dto.getDataConsagracaoPresbitero() );
        historicoObreiro.setDataSeperadoCoop( dto.getDataSeperadoCoop() );
        historicoObreiro.setDataConsagracaoPastor( dto.getDataConsagracaoPastor() );
        historicoObreiro.setDataConsagracaoDiagono( dto.getDataConsagracaoDiagono() );
        historicoObreiro.setDataConsagracaoEvangelista( dto.getDataConsagracaoEvangelista() );
        historicoObreiro.setDataConsagracaoMissionario( dto.getDataConsagracaoMissionario() );
        historicoObreiro.setId( dto.getId() );
        historicoObreiro.setLocalConsagracaoDiacono( dto.getLocalConsagracaoDiacono() );
        historicoObreiro.setLocalConsagracaoEvangelista( dto.getLocalConsagracaoEvangelista() );
        historicoObreiro.setLocalConsagracaoMissionario( dto.getLocalConsagracaoMissionario() );
        historicoObreiro.setLocalConsagracaoPastor( dto.getLocalConsagracaoPastor() );
        historicoObreiro.setLocalConsagracaoPresbitero( dto.getLocalConsagracaoPresbitero() );
        historicoObreiro.setLocalSeparadoCoop( dto.getLocalSeparadoCoop() );
        historicoObreiro.setObservacao( dto.getObservacao() );
        historicoObreiro.setProcedencia( dto.getProcedencia() );

        return historicoObreiro;
    }

    @Override
    public HistoricoObreiroDTO toDTO(HistoricoObreiro dto) {
        if ( dto == null ) {
            return null;
        }

        HistoricoObreiroDTO historicoObreiroDTO = new HistoricoObreiroDTO();

        historicoObreiroDTO.setDataConsagracaoDiagono( dto.getDataConsagracaoDiagono() );
        historicoObreiroDTO.setDataConsagracaoEvangelista( dto.getDataConsagracaoEvangelista() );
        historicoObreiroDTO.setDataConsagracaoMissionario( dto.getDataConsagracaoMissionario() );
        historicoObreiroDTO.setDataConsagracaoPastor( dto.getDataConsagracaoPastor() );
        historicoObreiroDTO.setDataConsagracaoPresbitero( dto.getDataConsagracaoPresbitero() );
        historicoObreiroDTO.setDataSeperadoCoop( dto.getDataSeperadoCoop() );
        historicoObreiroDTO.setId( dto.getId() );
        historicoObreiroDTO.setLocalConsagracaoDiacono( dto.getLocalConsagracaoDiacono() );
        historicoObreiroDTO.setLocalConsagracaoEvangelista( dto.getLocalConsagracaoEvangelista() );
        historicoObreiroDTO.setLocalConsagracaoMissionario( dto.getLocalConsagracaoMissionario() );
        historicoObreiroDTO.setLocalConsagracaoPastor( dto.getLocalConsagracaoPastor() );
        historicoObreiroDTO.setLocalConsagracaoPresbitero( dto.getLocalConsagracaoPresbitero() );
        historicoObreiroDTO.setLocalSeparadoCoop( dto.getLocalSeparadoCoop() );
        historicoObreiroDTO.setObservacao( dto.getObservacao() );
        historicoObreiroDTO.setProcedencia( dto.getProcedencia() );

        return historicoObreiroDTO;
    }
}
