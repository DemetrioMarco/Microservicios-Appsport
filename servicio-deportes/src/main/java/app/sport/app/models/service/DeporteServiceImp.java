package app.sport.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.sport.app.models.dao.DeporteDao;
import app.sport.app.models.entity.Deporte;

@Service
public class DeporteServiceImp implements IDeporteService {
	
	@Autowired
	private DeporteDao deporteDao;

	@Override
	@Transactional(readOnly = true)
	public List<Deporte> findAll() {
		return (List<Deporte>) deporteDao.findByEstatus(1);
	}

	@Override
	@Transactional(readOnly = true)
	public Deporte findById(Long id) {
		return deporteDao.findById(id).orElse(null);
	}


}
