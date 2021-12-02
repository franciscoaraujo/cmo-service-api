package br.com.assmbl.domain.dto.mapper;

import br.com.assmbl.domain.dto.request.EnderecoDTO;
import br.com.assmbl.domain.dto.request.MenbroDTO;
import br.com.assmbl.domain.dto.request.PessoaDTO;
import br.com.assmbl.domain.model.Endereco;
import br.com.assmbl.domain.model.Menbro;
import br.com.assmbl.domain.model.Pessoa;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-28T18:49:00-0300",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.0.v20210708-0430, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class MenbroMapperImpl implements MenbroMapper {

    @Override
    public Menbro toModel(MenbroDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Menbro menbro = new Menbro();

        menbro.setDataSaida( dto.getDataSaida() );
        menbro.setDataBatismo( dto.getDataBatismo() );
        menbro.setDataAdmissao( dto.getDataAdmissao() );
        menbro.setCargos( dto.getCargos() );
        menbro.setCongregacao( dto.getCongregacao() );
        menbro.setFlagAtivacao( dto.getFlagAtivacao() );
        menbro.setId( dto.getId() );
        menbro.setIgrejaBatismo( dto.getIgrejaBatismo() );
        menbro.setNomeConjuge( dto.getNomeConjuge() );
        menbro.setNumeroMatricula( dto.getNumeroMatricula() );
        menbro.setObservacao( dto.getObservacao() );
        menbro.setPessoa( pessoaDTOToPessoa( dto.getPessoa() ) );
        menbro.setProcedencia( dto.getProcedencia() );
        menbro.setStatusMenbroAnterior( dto.getStatusMenbroAnterior() );

        return menbro;
    }

    @Override
    public MenbroDTO toDTO(Menbro dto) {
        if ( dto == null ) {
            return null;
        }

        MenbroDTO menbroDTO = new MenbroDTO();

        menbroDTO.setCargos( dto.getCargos() );
        menbroDTO.setCongregacao( dto.getCongregacao() );
        menbroDTO.setDataAdmissao( dto.getDataAdmissao() );
        menbroDTO.setDataBatismo( dto.getDataBatismo() );
        menbroDTO.setDataSaida( dto.getDataSaida() );
        menbroDTO.setFlagAtivacao( dto.getFlagAtivacao() );
        menbroDTO.setId( dto.getId() );
        menbroDTO.setIgrejaBatismo( dto.getIgrejaBatismo() );
        menbroDTO.setNomeConjuge( dto.getNomeConjuge() );
        menbroDTO.setNumeroMatricula( dto.getNumeroMatricula() );
        menbroDTO.setObservacao( dto.getObservacao() );
        menbroDTO.setPessoa( pessoaToPessoaDTO( dto.getPessoa() ) );
        menbroDTO.setProcedencia( dto.getProcedencia() );
        menbroDTO.setStatusMenbroAnterior( dto.getStatusMenbroAnterior() );

        return menbroDTO;
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

    protected Pessoa pessoaDTOToPessoa(PessoaDTO pessoaDTO) {
        if ( pessoaDTO == null ) {
            return null;
        }

        Pessoa pessoa = new Pessoa();

        pessoa.setCelular( pessoaDTO.getCelular() );
        pessoa.setCpf( pessoaDTO.getCpf() );
        pessoa.setDataNascimento( pessoaDTO.getDataNascimento() );
        pessoa.setEmail( pessoaDTO.getEmail() );
        pessoa.setEndereco( enderecoDTOToEndereco( pessoaDTO.getEndereco() ) );
        pessoa.setEscolaridade( pessoaDTO.getEscolaridade() );
        pessoa.setEstado( pessoaDTO.getEstado() );
        pessoa.setEstadoCivil( pessoaDTO.getEstadoCivil() );
        pessoa.setId( pessoaDTO.getId() );
        pessoa.setNacionalidade( pessoaDTO.getNacionalidade() );
        pessoa.setNaturalDe( pessoaDTO.getNaturalDe() );
        pessoa.setNome( pessoaDTO.getNome() );
        pessoa.setNomeMae( pessoaDTO.getNomeMae() );
        pessoa.setNomePai( pessoaDTO.getNomePai() );
        pessoa.setNumeroDocumento( pessoaDTO.getNumeroDocumento() );
        pessoa.setProfissao( pessoaDTO.getProfissao() );
        pessoa.setRg( pessoaDTO.getRg() );
        pessoa.setTipoDocumento( pessoaDTO.getTipoDocumento() );
        pessoa.setTituloEleitor( pessoaDTO.getTituloEleitor() );

        return pessoa;
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

    protected PessoaDTO pessoaToPessoaDTO(Pessoa pessoa) {
        if ( pessoa == null ) {
            return null;
        }

        PessoaDTO pessoaDTO = new PessoaDTO();

        pessoaDTO.setCelular( pessoa.getCelular() );
        pessoaDTO.setCpf( pessoa.getCpf() );
        pessoaDTO.setDataNascimento( pessoa.getDataNascimento() );
        pessoaDTO.setEmail( pessoa.getEmail() );
        pessoaDTO.setEndereco( enderecoToEnderecoDTO( pessoa.getEndereco() ) );
        pessoaDTO.setEscolaridade( pessoa.getEscolaridade() );
        pessoaDTO.setEstado( pessoa.getEstado() );
        pessoaDTO.setEstadoCivil( pessoa.getEstadoCivil() );
        pessoaDTO.setId( pessoa.getId() );
        pessoaDTO.setNacionalidade( pessoa.getNacionalidade() );
        pessoaDTO.setNaturalDe( pessoa.getNaturalDe() );
        pessoaDTO.setNome( pessoa.getNome() );
        pessoaDTO.setNomeMae( pessoa.getNomeMae() );
        pessoaDTO.setNomePai( pessoa.getNomePai() );
        pessoaDTO.setNumeroDocumento( pessoa.getNumeroDocumento() );
        pessoaDTO.setProfissao( pessoa.getProfissao() );
        pessoaDTO.setRg( pessoa.getRg() );
        pessoaDTO.setTipoDocumento( pessoa.getTipoDocumento() );
        pessoaDTO.setTituloEleitor( pessoa.getTituloEleitor() );

        return pessoaDTO;
    }
}
