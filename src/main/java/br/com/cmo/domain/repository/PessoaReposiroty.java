package br.com.cmo.domain.repository;


import br.com.cmo.domain.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.NoSuchElementException;

@Repository
public interface PessoaReposiroty extends JpaRepository<Pessoa, Long> {
	
	public List<Pessoa> findByNome(String nome) throws NoSuchElementException;
	
}
