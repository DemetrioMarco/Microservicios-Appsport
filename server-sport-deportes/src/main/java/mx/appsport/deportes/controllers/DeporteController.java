package mx.appsport.deportes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.appsport.deportes.models.entity.Deporte;
import mx.appsport.deportes.models.service.IDeporteService;

@RestController
public class DeporteController {
	
	@Autowired
	private IDeporteService deporteService;
	
	@GetMapping("/listar")
	public List<Deporte> listar(){
		return deporteService.findAll();
	}
}
