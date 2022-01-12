package br.com.assmbl.domain.dto.mapper;

import br.com.assmbl.domain.dto.request.EnderecoDTO;
import br.com.assmbl.domain.dto.request.PessoaDTO;
import br.com.assmbl.domain.model.Endereco;
import br.com.assmbl.domain.model.Pessoa;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-11T22:22:28-0300",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.0.v20210708-0430, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class PessoaMapperImpl implements PessoaMapper {

    @Override
    public Pessoa toModel(PessoaDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Pessoa pessoa = new Pessoa();

        pessoa.setDataNascimento( dto.getDataNascimento() );
        pessoa.setCelular( dto.getCelular() );
        pessoa.setCpf( dto.getCpf() );
        pessoa.setEmail( dto.getEmail() );
        pessoa.setEndereco( enderecoDTOToEndereco( dto.getEndereco() ) );
        pessoa.setEscolaridade( dto.getEscolaridade() );
        pessoa.setEstado( dto.getEstado() );
        pessoa.setEstadoCivil( dto.getEstadoCivil() );
        pessoa.setId( dto.getId() );
        pessoa.setNacionalidade( dto.getNacionalidade() );
        pessoa.setNaturalDe( dto.getNaturalDe() );
        pessoa.setNome( dto.getNome() );
        pessoa.setNomeMae( dto.getNomeMae() );
        pessoa.setNomePai( dto.getNomePai() );
        pessoa.setNumeroDocumento( dto.getNumeroDocumento() );
        pessoa.setProfissao( dto.getProfissao() );
        pessoa.setRg( dto.getRg() );
        pessoa.setTipoDocumento( dto.getTipoDocumento() );
        pessoa.setTituloEleitor( dto.getTituloEleitor() );

        return pessoa;
    }

    @Override
    public PessoaDTO toDTO(Pessoa dto) {
        if ( dto == null ) {
            return null;
        }

        PessoaDTO pessoaDTO = new PessoaDTO();

        pessoaDTO.setCelular( dto.getCelular() );
        pessoaDTO.setCpf( dto.getCpf() );
        pessoaDTO.setDataNascimento( dto.getDataNascimento() );
        pessoaDTO.setEmail( dto.getEmail() );
        pessoaDTO.setEndereco( enderecoToEnderecoDTO( dto.getEndereco() ) );
        pessoaDTO.setEscolaridade( dto.getEscolaridade() );
        pessoaDTO.setEstado( dto.getEstado() );
        pessoaDTO.setEstadoCivil( dto.getEstadoCivil() );
        pessoaDTO.setId( dto.getId() );
        pessoaDTO.setNacionalidade( dto.getNacionalidade() );
        pessoaDTO.setNaturalDe( dto.getNaturalDe() );
        pessoaDTO.setNome( dto.getNome() );
        pessoaDTO.setNomeMae( dto.getNomeMae() );
        pessoaDTO.setNomePai( dto.getNomePai() );
        pessoaDTO.setNumeroDocumento( dto.getNumeroDocumento() );
        pessoaDTO.setProfissao( dto.getProfissao() );
        pessoaDTO.setRg( dto.getRg() );
        pessoaDTO.setTipoDocumento( dto.getTipoDocumento() );
        pessoaDTO.setTituloEleitor( dto.getTituloEleitor() );

        return pessoaDTO;
    }

    protected Endereco enderecoDTOToEndereco(EnderecoDTO enderecoDTO) {
        if ( enderecoDTO == null ) {
            return null;
        }

        Endereco endereco = new Endereco();

        endereco.setBairro( enderecoDTO.getBairro() );
        endereco.setCep( enderecoDTO.getCep() );
        endereco.setCidade( enderecoDTO.getCidade() );
        endereco.setComplemento( enderecoDTO.getComplemento() );
        endereco.setEstado( enderecoDTO.getEstado() );
        endereco.setId( enderecoDTO.getId() );
        endereco.setLogradouro( enderecoDTO.getLogradouro() );
        endereco.setNumero( enderecoDTO.getNumero() );

        return endereco;
    }

    protected EnderecoDTO enderecoToEnderecoDTO(Endereco endereco) {
        if ( endereco == null ) {
            return null;
        }

        EnderecoDTO enderecoDTO = new EnderecoDTO();

        enderecoDTO.setBairro( endereco.getBairro() );
        enderecoDTO.setCep( endereco.getCep() );
        enderecoDTO.setCidade( endereco.getCidade() );
        enderecoDTO.setComplemento( endereco.getComplemento() );
        enderecoDTO.setEstado( endereco.getEstado() );
        enderecoDTO.setId( endereco.getId() );
        enderecoDTO.setLogradouro( endereco.getLogradouro() );
        enderecoDTO.setNumero( endereco.getNumero() );

        return enderecoDTO;
    }
}
