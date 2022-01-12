//package br.com.assmbl.controller;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.DisabledException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestController;
//
//import br.com.assmbl.config.JwtTokenUtil;
//import br.com.assmbl.domain.dto.request.UsuarioDTO;
//import br.com.assmbl.domain.model.JwtResponse;
//import br.com.assmbl.service.JwtUserDetailsService;
//import br.com.assmbl.service.UsuarioService;
//import lombok.AllArgsConstructor;
//
//@RestController
//@RequestMapping("/api/v1/CMO/login")
//@AllArgsConstructor(onConstructor = @__(@Autowired))
//public class UsuarioController {
//
//	@Autowired
//	private AuthenticationManager authenticationManager;
//
//	@Autowired
//	private JwtTokenUtil jwtTokenUtil;
//
//	@Autowired
//	private JwtUserDetailsService userDetailsService;
//
//	@Autowired
//	private UsuarioService service;
//	
//
//	@Autowired
//	private BCryptPasswordEncoder pe;
//	
//	
//	@PostMapping
//	@ResponseStatus(HttpStatus.ACCEPTED)
//	public ResponseEntity<JwtResponse> create(@RequestBody @Valid UsuarioDTO usuarioDTO) throws Exception {
//
//		authenticate(usuarioDTO.getUsername(), usuarioDTO.getPassword());
//		
//		System.out.println(usuarioDTO.getPassword());
//		
//		UserDetails userDetails = userDetailsService.loadUserByUsername(usuarioDTO.getUsername());
//		if (pe.matches(usuarioDTO.getPassword(), userDetails.getPassword())) {
//			final String token = jwtTokenUtil.generateToken(userDetails);
//			return ResponseEntity.ok(new JwtResponse(token));
//		}
//		return ResponseEntity.ok(new JwtResponse(null));
//	}
//
//	private void authenticate(String username, String password) throws Exception {
//		try {	
//			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
//		} catch (DisabledException e) {
//			throw new Exception("USER_DISABLED", e);
//		} catch (BadCredentialsException e) {
//			throw new Exception("INVALID_CREDENTIALS", e);
//		}
//	}
//}
