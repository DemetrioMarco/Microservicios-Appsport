package mx.appsport.deportes.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.appsport.deportes.models.dao.DeporteDao;
import mx.appsport.deportes.models.entity.Deporte;

@Service
public class DeporteImpl implements IDeporteService {

	@Autowired
	private DeporteDao deporteDao;

	@Override
	@Transactional(readOnly = true)
	public List<Deporte> findAll() {
		return deporteDao.findAll();
	}
	
	
	
}
