package mx.appsport.partidos.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.appsport.partidos.models.entity.Partido;

@Repository
public interface PartidoDao extends JpaRepository<Partido, Long> {

	@Query(value="{call SP_PARTIDOS(:idCategoriaDeporte) }", nativeQuery = true)
	public List<Partido> getPartidos(Long idCategoriaDeporte);
}
