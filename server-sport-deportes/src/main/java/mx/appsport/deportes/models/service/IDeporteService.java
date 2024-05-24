package mx.appsport.deportes.models.service;

import java.util.List;

import mx.appsport.deportes.models.entity.Deporte;

public interface IDeporteService {
	
	public List<Deporte> findAll();

}
