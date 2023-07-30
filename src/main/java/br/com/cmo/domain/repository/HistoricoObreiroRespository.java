package br.com.cmo.domain.repository;

import br.com.cmo.domain.model.HistoricoObreiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoricoObreiroRespository extends JpaRepository<HistoricoObreiro, Long> {
	
}
