package app.sport.app.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;

import app.sport.app.models.entity.Categoria;

public interface CategoriaDao extends CrudRepository<Categoria, Integer> {

	@Procedure(value = "obtenerCategorias")
	public List<Categoria> getCategorias(Integer idTorneo);
}
