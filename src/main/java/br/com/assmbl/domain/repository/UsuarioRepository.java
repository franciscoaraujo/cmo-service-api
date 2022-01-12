package br.com.assmbl.domain.repository;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import br.com.assmbl.domain.model.Usuario;

@Repository
@Component
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	@Query("select u from Usuario u where u.username=?1")
	Optional<Usuario> findByUsuario(@Param("username")String username) throws NoSuchElementException;
	
}
