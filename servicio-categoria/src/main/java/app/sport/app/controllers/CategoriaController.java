package app.sport.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import app.sport.app.models.entity.Categoria;
import app.sport.app.models.service.ICategoriaService;

@RestController
public class CategoriaController {
	
	@Autowired
	private ICategoriaService categoriaService;
	
	@GetMapping("/listar/{id}")
	public List<Categoria> listar(@PathVariable Integer id){
		return categoriaService.getCategoria(id);
	}
	
	

}
