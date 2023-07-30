package br.com.cmo.domain.dto.mapper;

import br.com.cmo.domain.dto.request.UsuarioDTO;
import br.com.cmo.domain.model.Usuario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

	Usuario toUsuario(UsuarioDTO dto);
	
	UsuarioDTO toUsuarioDTO(Usuario usuario);
}
