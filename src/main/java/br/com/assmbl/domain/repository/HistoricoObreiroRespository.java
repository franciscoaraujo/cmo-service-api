package br.com.assmbl.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.assmbl.domain.model.HistoricoObreiro;

@Repository
public interface HistoricoObreiroRespository extends JpaRepository<HistoricoObreiro, Long> {
	
}
