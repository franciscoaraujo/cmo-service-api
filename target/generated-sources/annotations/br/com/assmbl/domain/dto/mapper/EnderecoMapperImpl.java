package br.com.assmbl.domain.dto.mapper;

import br.com.assmbl.domain.dto.request.EnderecoDTO;
import br.com.assmbl.domain.model.Endereco;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-11T22:22:28-0300",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.0.v20210708-0430, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class EnderecoMapperImpl implements EnderecoMapper {

    @Override
    public Endereco toModel(EnderecoDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Endereco endereco = new Endereco();

        endereco.setBairro( dto.getBairro() );
        endereco.setCep( dto.getCep() );
        endereco.setCidade( dto.getCidade() );
        endereco.setComplemento( dto.getComplemento() );
        endereco.setEstado( dto.getEstado() );
        endereco.setId( dto.getId() );
        endereco.setLogradouro( dto.getLogradouro() );
        endereco.setNumero( dto.getNumero() );

        return endereco;
    }

    @Override
    public EnderecoDTO toDTO(Endereco dto) {
        if ( dto == null ) {
            return null;
        }

        EnderecoDTO enderecoDTO = new EnderecoDTO();

        enderecoDTO.setBairro( dto.getBairro() );
        enderecoDTO.setCep( dto.getCep() );
        enderecoDTO.setCidade( dto.getCidade() );
        enderecoDTO.setComplemento( dto.getComplemento() );
        enderecoDTO.setEstado( dto.getEstado() );
        enderecoDTO.setId( dto.getId() );
        enderecoDTO.setLogradouro( dto.getLogradouro() );
        enderecoDTO.setNumero( dto.getNumero() );

        return enderecoDTO;
    }
}
