package mx.appsport.deportes.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.appsport.deportes.models.entity.Deporte;

@Repository
public interface DeporteDao extends CrudRepository<Deporte, Long> {
	
	@Query(value="{ call SP_DEPORTES() }", nativeQuery = true)
	public List<Deporte> findAll();

}
