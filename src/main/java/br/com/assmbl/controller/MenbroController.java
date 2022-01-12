package br.com.assmbl.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.assmbl.domain.dto.request.MenbroDTO;
import br.com.assmbl.domain.dto.response.MessageResponseDTO;
import br.com.assmbl.exception.MenbroNotFoundException;
import br.com.assmbl.service.MenbroService;
import javassist.tools.rmi.ObjectNotFoundException;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/CMO/menbro")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class MenbroController {

	private final MenbroService service;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<MessageResponseDTO> create(@RequestBody @Valid MenbroDTO menbroDTO) {
		MessageResponseDTO messageResponseDTO = service.cadastra(menbroDTO);
		return ResponseEntity.ok().body(messageResponseDTO);

	}

	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<MenbroDTO> findById(@PathVariable Long id) throws MenbroNotFoundException {
		MenbroDTO menbroDTO = service.buscarPorId(id);
		return ResponseEntity.ok().body(menbroDTO);
	}

	@GetMapping
	public ResponseEntity<List<MenbroDTO>> listAll() {
		List<MenbroDTO> retornaTodos = service.buscaTodos();
		return ResponseEntity.ok().body(retornaTodos);
	}

	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public MessageResponseDTO update(@PathVariable Long id, @RequestBody @Valid MenbroDTO menbroDTO)
			throws MenbroNotFoundException {
		return service.atualizar(id, menbroDTO);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public MessageResponseDTO delete(@PathVariable long id) throws MenbroNotFoundException {
		return service.excluir(id);
	}
	
	
}
