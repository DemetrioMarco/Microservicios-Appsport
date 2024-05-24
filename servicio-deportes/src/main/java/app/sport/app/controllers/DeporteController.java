package app.sport.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import app.sport.app.models.entity.Deporte;
import app.sport.app.models.service.IDeporteService;

@RestController
public class DeporteController {

	@Autowired
	private IDeporteService deporteService;
	
	@GetMapping("/listar")
	public List<Deporte> listar(){
		return deporteService.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Deporte detalle(@PathVariable Long id) {
		return deporteService.findById(id);
	}
	
}
