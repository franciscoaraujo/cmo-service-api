package br.com.assmbl.domain.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.assmbl.domain.dto.request.PessoaDTO;
import br.com.assmbl.domain.model.Pessoa;

@Mapper(componentModel = "spring")
public interface PessoaMapper {

	@Mapping(target = "dataNascimento", source = "dataNascimento", dateFormat = "dd-MM-yyyy")
	Pessoa toModel(PessoaDTO dto);
	
	PessoaDTO toDTO(Pessoa dto);
	
}
