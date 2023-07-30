package br.com.cmo.domain.dto.mapper;

import br.com.cmo.domain.dto.request.HistoricoObreiroDTO;
import br.com.cmo.domain.model.HistoricoObreiro;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface HistoricoObreiroMapper {

	@Mapping( target = "dataSeperadoCoop", source = "dataSeperadoCoop", dateFormat = "dd-MM-yyyy")
	@Mapping( target = "dataConsagracaoPresbitero", source = "dataConsagracaoPresbitero", dateFormat = "dd-MM-yyyy")
	@Mapping( target = "dataConsagracaoPastor", source = "dataConsagracaoPastor", dateFormat = "dd-MM-yyyy")
    HistoricoObreiro toModel(HistoricoObreiroDTO dto);
	
	HistoricoObreiroDTO toDTO(HistoricoObreiro dto);
    
}
