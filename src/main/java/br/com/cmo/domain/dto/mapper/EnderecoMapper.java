package br.com.cmo.domain.dto.mapper;

import br.com.cmo.domain.dto.request.EnderecoDTO;
import br.com.cmo.domain.model.Endereco;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EnderecoMapper {
	
	Endereco toModel(EnderecoDTO dto);
	
	EnderecoDTO toDTO(Endereco dto);
	
}
