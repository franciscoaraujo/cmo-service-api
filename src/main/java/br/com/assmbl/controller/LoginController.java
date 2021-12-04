package br.com.assmbl.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.assmbl.domain.model.Usuario;
import br.com.assmbl.service.LoginService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/CMO/login")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	@PostMapping
	@ResponseStatus(HttpStatus.ACCEPTED)
	public ResponseEntity<Usuario> create(@RequestBody @Valid Usuario usuario) {
		Usuario user = service.fazLogin(usuario);
		return ResponseEntity.ok().body(user);
	}
}
