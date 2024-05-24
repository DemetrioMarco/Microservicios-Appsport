package mx.appsport.categorias.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.appsport.categorias.models.entity.Categoria;

@Repository
public interface CategoriaDao extends JpaRepository<Categoria, Long> {
	
	@Query(value="{ call SP_CATEGORIA_POR_DEPORTE(:idDeporte) }", nativeQuery = true)
	public List<Categoria> getCategorias(Long idDeporte);

}
