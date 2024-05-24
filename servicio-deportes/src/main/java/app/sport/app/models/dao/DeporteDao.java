package app.sport.app.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import app.sport.app.models.entity.Deporte;

public interface DeporteDao extends CrudRepository<Deporte, Long> {

	List<Deporte> findByEstatus(int i);

}
