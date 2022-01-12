package br.com.assmbl.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.assmbl.domain.dto.mapper.UsuarioMapper;
import br.com.assmbl.domain.dto.request.UsuarioDTO;
import br.com.assmbl.domain.model.Usuario;
import br.com.assmbl.domain.repository.UsuarioRepository;
import br.com.assmbl.exception.UsuarioNotFoundException;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	
	@Autowired
	private UsuarioMapper userMapper;
	
	
	@Autowired
	private BCryptPasswordEncoder pe;
	
	public UsuarioDTO fazLogin(UsuarioDTO usuarioDTO) throws NoSuchElementException, UsuarioNotFoundException {
		String userName = usuarioDTO.getUsername();
		Usuario user =  repository.findByUsuario(userName).orElseThrow(()-> new UsuarioNotFoundException(usuarioDTO.getUsername()));
		
		if(pe.matches(usuarioDTO.getPassword(), user.getPassword())){
			return userMapper.toUsuarioDTO(user);
		}
		
		return null;
	}
	
}
