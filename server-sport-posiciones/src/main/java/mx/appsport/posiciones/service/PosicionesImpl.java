package mx.appsport.posiciones.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.appsport.posiciones.dao.PosicionesDao;
import mx.appsport.posiciones.entity.Posiciones;

@Service
public class PosicionesImpl implements IPosicionesService {
	
	@Autowired
	private PosicionesDao posicionesDao;

	@Override
	public List<Posiciones> findByPosiciones(Long idCategoria) {
		return posicionesDao.getPosiciones(idCategoria);
	}

}
