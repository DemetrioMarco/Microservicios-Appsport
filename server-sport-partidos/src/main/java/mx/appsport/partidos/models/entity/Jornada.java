package mx.appsport.partidos.models.entity;

import java.io.Serializable;
import java.util.List;



public class Jornada implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private String fecha;
	private char status;
	private List<Juego> partidos;
	
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public List<Juego> getPartidos() {
		return partidos;
	}
	public void setPartidos(List<Juego> partidos) {
		this.partidos = partidos;
	}

}
