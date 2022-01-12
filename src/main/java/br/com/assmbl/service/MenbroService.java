package br.com.assmbl.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.assmbl.domain.dto.mapper.MenbroMapper;
import br.com.assmbl.domain.dto.request.MenbroDTO;
import br.com.assmbl.domain.dto.response.MessageResponseDTO;
import br.com.assmbl.domain.enums.Ativo;
import br.com.assmbl.domain.model.Menbro;
import br.com.assmbl.domain.repository.MenbroRespository;
import br.com.assmbl.exception.MenbroNotFoundException;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class MenbroService {

	private MenbroRespository menbroRepository;
	private final MenbroMapper menbroMapper;

	public MessageResponseDTO cadastra(MenbroDTO menbroDTO) {
		Menbro menbro = menbroMapper.toModel(menbroDTO);
		Menbro menbroSaved = menbroRepository.save(menbro);
		MessageResponseDTO messageResponse = createMessageResponse("Menbro cadastrado com sucesso ID ",
				menbroSaved.getId());
		return messageResponse;

	}

	public MenbroDTO buscarPorId(Long id) throws MenbroNotFoundException {
		Menbro menbro = menbroRepository.findByIdActives(id).orElseThrow(() -> new MenbroNotFoundException(id));
		return menbroMapper.toDTO(menbro);
	}

	public MenbroDTO buscaPorNome(String nome) throws MenbroNotFoundException {
		Menbro menbro = menbroRepository.findByName(nome).orElseThrow(() -> new MenbroNotFoundException(nome));
		return menbroMapper.toDTO(menbro);
	}

	public List<MenbroDTO> buscaPorDataDeAdmissao(String dataInicial, String dataFinal) {
		List<Menbro> listMenbro = menbroRepository.findByDataRangePesquisa(dataInicial, dataFinal);
		return listMenbro.stream().map(menbroMapper::toDTO).collect(Collectors.toList());
	}

	public List<MenbroDTO> buscaTodos() {
		List<Menbro> listMenbro = menbroRepository.findByAllActives();
		return listMenbro.stream().map(menbroMapper::toDTO).collect(Collectors.toList());
	}

	/*Esse metodo nao está fazendo update, ele está criando sempre um novo registro --- tenho que encontrar uma solucao!!*/
	public MessageResponseDTO atualizar(Long id, MenbroDTO menbroDTO) throws MenbroNotFoundException {
		
		Menbro findMenbro =	menbroRepository.findById(id).orElseThrow(() -> new MenbroNotFoundException(id));
		Menbro menbro = menbroMapper.toModel(menbroDTO);
		
		findMenbro.setCargos(menbro.getCargos());
		findMenbro.setCongrecacao(menbro.getCongrecacao());
		findMenbro.setDataAdmissao(menbro.getDataAdmissao());
		findMenbro.setDataBatismo(menbro.getDataBatismo());
		findMenbro.setDataSaida(menbro.getDataSaida());
		findMenbro.setFlagAtivacao(menbro.getFlagAtivacao());
		findMenbro.setId(menbro.getId());
		findMenbro.setIgrejaBatismo(menbro.getIgrejaBatismo());
		findMenbro.setNomeConjuge(menbro.getNomeConjuge());
		findMenbro.setNumeroMatricula(menbro.getNumeroMatricula());
		findMenbro.setObservacao(menbro.getObservacao());
		findMenbro.setPessoa(menbro.getPessoa());
		findMenbro.setProcedencia(menbro.getProcedencia());
		findMenbro.setStatusMenbroAnterior(menbro.getStatusMenbroAnterior());;
		
		Menbro updatedMenbro = menbroRepository.save(findMenbro);
		
		MessageResponseDTO messageResponse = createMessageResponse("Menbro atualizado com sucesso ID ",
				updatedMenbro.getId());

		return messageResponse;
	}

	public MessageResponseDTO excluir(Long id) throws MenbroNotFoundException {
		
		Menbro menbroLogicalDelete = menbroRepository.findById(id).orElseThrow(() -> new MenbroNotFoundException(id));
		menbroLogicalDelete.setFlagAtivacao(Ativo.NAO_ATIVO);
		menbroRepository.save(menbroLogicalDelete);
		MessageResponseDTO messageResponse = createMessageResponse("Menbro desetivado com sucesso ID ",
				menbroLogicalDelete.getId());

		return messageResponse;
	}

	private MessageResponseDTO createMessageResponse(String s, Long id2) {
		return MessageResponseDTO.builder().message(s + id2).build();
	}

	/*public Page<MenbroDTO> search(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		Page<Menbro> listPageMenbro = menbroRepository.findMenbroPageable(pageRequest);
		
		return menbroMapper.toDTOPAGE(listPageMenbro);
	}*/

}
