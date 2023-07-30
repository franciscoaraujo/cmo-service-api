package br.com.cmo.domain.dto.mapper;

import br.com.cmo.domain.dto.request.MenbroDTO;
import br.com.cmo.domain.model.Menbro;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MenbroMapper {
	
	@Mapping(target =  "dataBatismo", source = "dataBatismo", dateFormat = "dd-MM-yyyy")
	@Mapping(target =  "dataAdmissao", source = "dataAdmissao", dateFormat = "dd-MM-yyyy")
	@Mapping(target =  "dataSaida", source = "dataSaida", dateFormat = "dd-MM-yyyy")
	@Mapping(target =  "congrecacao", source = "congregacao", dateFormat = "dd-MM-yyyy")
    Menbro toModel(MenbroDTO dto);
	
	@Mapping(target =  "dataNascimento", source = "dataNascimento", dateFormat = "dd-MM-yyyy")
    MenbroDTO toDTO(Menbro dto);

	//Page<MenbroDTO> toDTOPAGE(Page<Menbro> pageMenbro);
	
	
}

