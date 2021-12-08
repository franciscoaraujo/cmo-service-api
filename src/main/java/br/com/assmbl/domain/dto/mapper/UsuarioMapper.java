package br.com.assmbl.domain.dto.mapper;

import org.mapstruct.Mapper;

import br.com.assmbl.domain.dto.request.UsuarioDTO;
import br.com.assmbl.domain.model.Usuario;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

	Usuario toUsuario(UsuarioDTO dto);
	
	UsuarioDTO toUsuarioDTO(Usuario usuario);
}
