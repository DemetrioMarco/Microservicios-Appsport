package mx.appsport.categorias.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import mx.appsport.categorias.models.entity.Categoria;
import mx.appsport.categorias.models.service.ICategoriaService;

@RestController
public class CategoriaController {
	
	@Autowired
	private ICategoriaService categoriaService;
	
	@GetMapping("/listar/{id}")
	public List<Categoria> listar(@PathVariable  Long id){
		return categoriaService.findByDeporte(id);
	}
	

}
