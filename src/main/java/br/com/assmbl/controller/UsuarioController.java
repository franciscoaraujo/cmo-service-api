package br.com.assmbl.controller;

import java.util.NoSuchElementException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.assmbl.domain.dto.request.UsuarioDTO;
import br.com.assmbl.domain.model.Usuario;
import br.com.assmbl.exception.UsuarioNotFoundException;
import br.com.assmbl.service.UsuarioService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/CMO/login")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UsuarioController {

	@Autowired
	private UsuarioService service;

	@PostMapping
	@ResponseStatus(HttpStatus.ACCEPTED)
	public ResponseEntity<UsuarioDTO> create(@RequestBody @Valid UsuarioDTO usuarioDTO)
			throws NoSuchElementException, UsuarioNotFoundException {
		UsuarioDTO user = service.fazLogin(usuarioDTO);
		return ResponseEntity.ok().body(user);

	}
}
