package app.sport.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.sport.app.models.dao.CategoriaDao;
import app.sport.app.models.entity.Categoria;


@Service
public class CategoriaServiceImp implements ICategoriaService {
	
	@Autowired
	private CategoriaDao categoriaDao;

	@Override
	@Transactional
	public List<Categoria> getCategoria(Integer idTorneo) {
		return categoriaDao.getCategorias(idTorneo);
	}

	

	

}
