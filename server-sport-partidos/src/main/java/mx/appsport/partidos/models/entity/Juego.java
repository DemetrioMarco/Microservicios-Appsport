package mx.appsport.partidos.models.entity;

import java.io.Serializable;

public class Juego implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	private Long id;
	private String jornada;
	private String hora;
	private String campo;
	private String local;
	private String visita;
	private String golLocal;
	private String golVisita;
	private String set1;
	private String set2;
	private String set3;
	private char estatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJornada() {
		return jornada;
	}

	public void setJornada(String jornada) {
		this.jornada = jornada;
	}


	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getVisita() {
		return visita;
	}

	public void setVisita(String visita) {
		this.visita = visita;
	}

	public String getGolLocal() {
		return golLocal;
	}

	public void setGolLocal(String golLocal) {
		this.golLocal = golLocal;
	}

	public String getGolVisita() {
		return golVisita;
	}

	public void setGolVisita(String golVisita) {
		this.golVisita = golVisita;
	}

	public String getSet1() {
		return set1;
	}

	public void setSet1(String set1) {
		this.set1 = set1;
	}

	public String getSet2() {
		return set2;
	}

	public void setSet2(String set2) {
		this.set2 = set2;
	}

	public String getSet3() {
		return set3;
	}

	public void setSet3(String set3) {
		this.set3 = set3;
	}

	public char getEstatus() {
		return estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}
	

}
