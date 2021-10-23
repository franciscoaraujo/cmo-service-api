package br.com.assmbl.domain.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.assmbl.domain.dto.request.HistoricoObreiroDTO;
import br.com.assmbl.domain.model.HistoricoObreiro;

@Mapper(componentModel = "spring")
public interface HistoricoObreiroMapper {

	@Mapping( target = "dataSeperadoCoop", source = "dataSeperadoCoop", dateFormat = "dd-MM-yyyy")
	@Mapping( target = "dataConsagracaoPresbitero", source = "dataConsagracaoPresbitero", dateFormat = "dd-MM-yyyy")
	@Mapping( target = "dataConsagracaoPastor", source = "dataConsagracaoPastor", dateFormat = "dd-MM-yyyy")
	HistoricoObreiro toModel(HistoricoObreiroDTO dto);
	
	HistoricoObreiroDTO toDTO(HistoricoObreiro dto);
    
}
