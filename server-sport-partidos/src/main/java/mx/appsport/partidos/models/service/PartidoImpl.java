package mx.appsport.partidos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.appsport.partidos.models.dao.PartidoDao;
import mx.appsport.partidos.models.entity.Partido;

@Service
public class PartidoImpl implements IPartidoService {
	
	@Autowired
	private PartidoDao partidoDao;

	@Override
	public List<Partido> findByDeporte(Long idCategoriaDeporte) {
		return partidoDao.getPartidos(idCategoriaDeporte);
	}

}
