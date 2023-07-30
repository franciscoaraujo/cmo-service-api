package br.com.cmo.domain.dto.mapper;

import br.com.cmo.domain.dto.request.ObreiroDTO;
import br.com.cmo.domain.model.Obreiro;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ObreiroMapper {
	
	@Mapping(target = "dataReconhecimento", source = "dataReconhecimento", dateFormat = "dd-MM-yyyy")
	@Mapping(target = "dataReconhecimentoGargo", source = "dataReconhecimentoGargo", dateFormat = "dd-MM-yyyy")
    Obreiro toModel(ObreiroDTO dto);
	
	ObreiroDTO toDTO(Obreiro dto);
	
}
