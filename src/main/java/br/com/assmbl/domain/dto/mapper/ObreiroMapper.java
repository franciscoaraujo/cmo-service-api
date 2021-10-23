package br.com.assmbl.domain.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.assmbl.domain.dto.request.ObreiroDTO;
import br.com.assmbl.domain.model.Obreiro;

@Mapper(componentModel = "spring")
public interface ObreiroMapper {
	
	@Mapping(target = "dataReconhecimento", source = "dataReconhecimento", dateFormat = "dd-MM-yyyy")
	@Mapping(target = "dataReconhecimentoGargo", source = "dataReconhecimentoGargo", dateFormat = "dd-MM-yyyy")
	Obreiro toModel(ObreiroDTO dto);
	
	ObreiroDTO toDTO(Obreiro dto);
	
}
