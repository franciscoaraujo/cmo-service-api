package br.com.assmbl.domain.repository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.assmbl.domain.model.Menbro;

@Repository
public interface MenbroRespository extends JpaRepository<Menbro,Long> {
	
	@Transactional
	@Query("select m from Menbro m where m.pessoa.nome = :nome")
	Optional<Menbro> findByName(String nome) throws NoSuchElementException;
	
	@Transactional
	@Query("select m from Menbro m where m.dataAdmissao between :dataInicial and :dataFinal")
	List<Menbro> findByDataRangePesquisa(String dataInicial, String dataFinal) throws NoSuchElementException;
	
	@Transactional
	@Query("select m from Menbro m where m.flagAtivacao  = 'SIM' ")
	List<Menbro> findByAllActives() throws NoSuchElementException;
	
	@Transactional
	@Query(value = "select * from menbros m where m.flag_ativacao = 'ATIVO' and m.id = :id ", nativeQuery = true)
	Optional<Menbro> findByIdActives(Long id);
	
	@Transactional
	@Query("select m from Menbro m")
	Page<Menbro> findMenbroPageable(Pageable pageRequest)throws NoSuchElementException;
	
}
