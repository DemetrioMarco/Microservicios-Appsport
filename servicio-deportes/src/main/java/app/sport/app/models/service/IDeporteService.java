package app.sport.app.models.service;

import java.util.List;

import app.sport.app.models.entity.Deporte;

public interface IDeporteService {
	
	public List<Deporte> findAll();
	public Deporte findById(Long id);

}
