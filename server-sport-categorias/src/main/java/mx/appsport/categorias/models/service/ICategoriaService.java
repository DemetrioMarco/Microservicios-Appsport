package mx.appsport.categorias.models.service;

import java.util.List;

import mx.appsport.categorias.models.entity.Categoria;

public interface ICategoriaService {
	
	public List<Categoria> findByDeporte(Long idDeporte);

}
