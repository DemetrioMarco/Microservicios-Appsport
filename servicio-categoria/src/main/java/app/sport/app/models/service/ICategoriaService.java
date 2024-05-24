package app.sport.app.models.service;

import java.util.List;

import app.sport.app.models.entity.Categoria;

public interface ICategoriaService {
	
	public List<Categoria> getCategoria(Integer idTorneo);
	

}
