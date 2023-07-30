package br.com.cmo.domain.dto.mapper;

import br.com.cmo.domain.dto.request.PessoaDTO;
import br.com.cmo.domain.model.Pessoa;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PessoaMapper {

	@Mapping(target = "dataNascimento", source = "dataNascimento", dateFormat = "dd-MM-yyyy")
    Pessoa toModel(PessoaDTO dto);
	
	PessoaDTO toDTO(Pessoa dto);
	
}
