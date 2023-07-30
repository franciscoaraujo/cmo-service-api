package br.com.cmo.domain.repository;

import br.com.cmo.domain.enums.Ativo;
import br.com.cmo.domain.model.Obreiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ObreiroReposistory extends JpaRepository<Obreiro, Long> {
	
	@Query("select o from Obreiro o where o.menbro.pessoa.nome like :nome")
	Optional<Obreiro> findByNome(String nome);
	
	@Query("select o from Obreiro o where o.flagAtivacao = :flag")
	List<Obreiro> findByAllAtivos(Ativo flag);
	
	@Query("select o from Obreiro o where o.dataReconhecimentoGargo between :dataInicial and :dataFinal")
	List<Obreiro> findByDataRangePesquisa(String dataInicial, String dataFinal);
}
