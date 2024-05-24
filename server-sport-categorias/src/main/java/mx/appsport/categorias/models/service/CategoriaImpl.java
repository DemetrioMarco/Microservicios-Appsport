package mx.appsport.categorias.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.appsport.categorias.models.dao.CategoriaDao;
import mx.appsport.categorias.models.entity.Categoria;

@Service
public class CategoriaImpl implements ICategoriaService {
	
	@Autowired
	private CategoriaDao categoriaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Categoria> findByDeporte(Long idDeporte) {
		return categoriaDao.getCategorias(idDeporte);
	}

}
