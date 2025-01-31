package mx.appsport.partidos.models.entity;

import java.io.Serializable;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Partido implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_PARTIDO")
	private Long id;
	
	@Column(name="DESCRIPCION_JORNADA")
	private String jornada;
	
	@Column(name="FECHA")
	private String fecha;
	
	@Column(name="HORA")
	private String hora;
	
	@Column(name="CAMPO")
	private String campo;
	
	@Column(name="EQUIPO_LOCAL")
	private String local;
	
	@Column(name="EQUIPO_VISITA")
	private String visita;
	
	@Column(name="GOL_LOCAL")
	private String golLocal;
	
	@Column(name="GOL_VISITA")
	private String golVisita;
	
	@Column(name="PRIMER_SET")
	private String set1;
	
	@Column(name="SEGUNDO_SET")
	private String set2;
	
	@Column(name="TERCER_SET")
	private String set3;
	
	@Column(name="PARTIDO_JUGADO")
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

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
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
