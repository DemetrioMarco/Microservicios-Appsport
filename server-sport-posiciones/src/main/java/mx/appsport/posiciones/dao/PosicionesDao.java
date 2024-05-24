package mx.appsport.posiciones.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.appsport.posiciones.entity.Posiciones;

@Repository
public interface PosicionesDao extends JpaRepository<Posiciones, Long> {
	
	@Query(value="{ CALL SP_POSICIONES(:idCategoria) }", nativeQuery = true)
	public List<Posiciones> getPosiciones(Long idCategoria);

}
