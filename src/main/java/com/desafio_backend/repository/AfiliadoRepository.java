package com.desafio_backend.repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.desafio_backend.entity.Afiliado;


public interface AfiliadoRepository extends JpaRepository<Afiliado, Long>{
	
	@Query("SELECT * FROM desafio.afiliados")
	public List<Afiliado> findAllDb();

	//@Query("select * from Afiliados where UPPER(parentesco) = 'HIJO' and edad > 18")
	//public List<Afiliado> findByBeneficiarioHijo(String term);
	
	/*@Query("select ps from Afiliados ps where upper(ps.nombres) like upper(concat('%', ?1, '%')) or apellidos like upper(concat('%', ?1, '%'))")  
	public Page<Afiliado> findByNombre(String term , Pageable pageable);
	
	*/
	
}
