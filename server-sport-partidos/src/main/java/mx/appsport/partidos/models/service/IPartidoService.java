package mx.appsport.partidos.models.service;

import java.util.List;

import mx.appsport.partidos.models.entity.Partido;

public interface IPartidoService {
	
	public List<Partido> findByDeporte(Long idCategoriaDeporte);

}
