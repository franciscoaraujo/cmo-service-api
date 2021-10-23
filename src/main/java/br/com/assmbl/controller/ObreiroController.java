package br.com.assmbl.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.assmbl.domain.dto.request.ObreiroDTO;
import br.com.assmbl.domain.dto.response.MessageResponseDTO;
import br.com.assmbl.exception.MenbroNotFoundException;
import br.com.assmbl.exception.ObreiroNotFoundException;
import br.com.assmbl.service.ObreiroService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/CMO/obreiro")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ObreiroController {

	private ObreiroService service;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public MessageResponseDTO create(@RequestBody @Valid ObreiroDTO obreiroDTO) throws MenbroNotFoundException {
		return service.cadastra(obreiroDTO);
	}

	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ObreiroDTO findById(@PathVariable Long id) throws ObreiroNotFoundException {
		return service.buscarPorId(id);
	}

	@GetMapping
	public List<ObreiroDTO> listAll() {
		return service.buscaTodos();
	}

	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public MessageResponseDTO update(@PathVariable Long id, @RequestBody @Valid ObreiroDTO obreiroDTO)
			throws ObreiroNotFoundException {
		return service.atualizar(id, obreiroDTO);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public MessageResponseDTO delete(@PathVariable Long id) throws ObreiroNotFoundException {
		return service.excluir(id);
	}

}
