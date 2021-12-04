package br.com.assmbl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.assmbl.domain.dto.response.MessageResponseDTO;
import br.com.assmbl.domain.model.Usuario;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class LoginService {

	public Usuario fazLogin(Usuario usuario) {
		MessageResponseDTO messageResponse = null;
		if (usuario.getUsername().equals("francisco") && usuario.getPassword().equals("123456")) {
			messageResponse = createMessageResponse("Login efetuado com sucesso ");
			System.out.println(messageResponse);
			return usuario;
		} else {
			messageResponse = createMessageResponse("Usuario ou Senha nao confere");
			System.out.println(messageResponse);
			return usuario;
		}
	}
	
	private MessageResponseDTO createMessageResponse(String s) {
		return MessageResponseDTO.builder().message(s).build();
	}
}
