package br.com.assmbl.domain.dto.mapper;

import org.mapstruct.Mapper;

import br.com.assmbl.domain.dto.request.EnderecoDTO;
import br.com.assmbl.domain.model.Endereco;

@Mapper(componentModel = "spring")
public interface EnderecoMapper {
	
	Endereco toModel(EnderecoDTO dto);
	
	EnderecoDTO toDTO(Endereco dto);
	
}
