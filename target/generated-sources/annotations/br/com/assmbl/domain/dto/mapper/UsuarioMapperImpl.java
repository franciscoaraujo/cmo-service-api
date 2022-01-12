package br.com.assmbl.domain.dto.mapper;

import br.com.assmbl.domain.dto.request.UsuarioDTO;
import br.com.assmbl.domain.model.Usuario;
import br.com.assmbl.domain.model.Usuario.UsuarioBuilder;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-11T22:22:28-0300",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.0.v20210708-0430, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
    public Usuario toUsuario(UsuarioDTO dto) {
        if ( dto == null ) {
            return null;
        }

        UsuarioBuilder usuario = Usuario.builder();

        usuario.id( dto.getId() );
        usuario.password( dto.getPassword() );
        usuario.username( dto.getUsername() );

        return usuario.build();
    }

    @Override
    public UsuarioDTO toUsuarioDTO(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        UsuarioDTO usuarioDTO = new UsuarioDTO();

        usuarioDTO.setId( usuario.getId() );
        usuarioDTO.setPassword( usuario.getPassword() );
        usuarioDTO.setUsername( usuario.getUsername() );

        return usuarioDTO;
    }
}
