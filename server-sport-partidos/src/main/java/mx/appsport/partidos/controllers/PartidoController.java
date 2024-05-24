package mx.appsport.partidos.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import mx.appsport.partidos.models.entity.Jornada;
import mx.appsport.partidos.models.entity.Juego;
import mx.appsport.partidos.models.entity.Partido;
import mx.appsport.partidos.models.service.IPartidoService;

@RestController
public class PartidoController {
	
	@Autowired
	private IPartidoService partidoService;
	
	@GetMapping("/jornadas/{id}")
	public List<Jornada> listar(@PathVariable Long id){
		List<Partido> partidos = partidoService.findByDeporte(id);
		
		return listarJuegos(partidos);
	}
	
	@GetMapping("/listar/{id}")
	public List<Partido> listarPartidos(@PathVariable Long id){
		 
		return partidoService.findByDeporte(id);
	}
	
	
	private List<Jornada> listarJuegos(List<Partido> partidos){
		List<Jornada> jornadas = new ArrayList<>();
		Jornada jornada = new Jornada();
		jornada.setFecha(partidos.get(0).getFecha());
		jornada.setStatus(partidos.get(0).getEstatus());
		jornada.setPartidos( llenarJuegos( partidos, jornada.getFecha()));
		jornadas.add(jornada);
		
		
		for(int i = 0; i < partidos.size(); i++) {
			
			if( !jornada.getFecha().equals(partidos.get(i).getFecha())) {
				jornada = new Jornada();
				jornada.setFecha(partidos.get(i).getFecha());
				jornada.setStatus(partidos.get(i).getEstatus());
				jornada.setPartidos( llenarJuegos( partidos, jornada.getFecha()));
				jornadas.add(jornada);
			
			}
			
		}
		
		
		return jornadas;
	}
	
	private List<Juego> llenarJuegos(List<Partido> partidos, String fecha){
		
		List<Juego> juegos = new ArrayList<>();
		Juego juego;
		
		
		for(int i = 0; i < partidos.size(); i++) {
			
			 
			if(partidos.get(i).getFecha().equals(fecha)) {
				juego = new Juego();
				juego.setCampo(partidos.get(i).getCampo());
				juego.setHora(partidos.get(i).getHora());
				juego.setId(partidos.get(i).getId());
				juego.setLocal(partidos.get(i).getLocal());
				juego.setVisita(partidos.get(i).getVisita());
				juego.setJornada(partidos.get(i).getJornada());
				juego.setGolLocal(partidos.get(i).getGolLocal());
				juego.setGolVisita(partidos.get(i).getGolVisita());
				juego.setSet1(partidos.get(i).getSet1());
				juego.setSet2(partidos.get(i).getSet2());
				juego.setSet3(partidos.get(i).getSet3());
				juego.setEstatus(partidos.get(i).getEstatus());
				
				
				juegos.add(juego);
				
			}
			
		}
		
		
		return juegos;
		
	}
}
