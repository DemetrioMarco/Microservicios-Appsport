package mx.appsport.posiciones.service;

import java.util.List;

import mx.appsport.posiciones.entity.Posiciones;

public interface IPosicionesService {
	
	public List<Posiciones> findByPosiciones(Long idCategoria);

}
