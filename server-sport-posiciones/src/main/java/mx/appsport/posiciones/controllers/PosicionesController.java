package mx.appsport.posiciones.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import mx.appsport.posiciones.entity.Posiciones;
import mx.appsport.posiciones.service.IPosicionesService;

@RestController
public class PosicionesController {
	
	@Autowired
	private IPosicionesService posicionesService;
	
	@GetMapping("/listar/{id}")
	public List<Posiciones> listar(@PathVariable  Long id){
		return posicionesService.findByPosiciones(id);
	}

}
