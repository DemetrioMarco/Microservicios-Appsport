package app.sport.app.models.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CAT_DEPORTES")
public class Deporte implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_DEPORTE")
	private int id;
	
	@Column(name="DESCRIPCION_DEPORTE")
	private String descripcion;
	
	@Column(name="ESTATUS_DEPORTE")
	private int estatus;
	
	public int getId() {
		return id;
	}
	public void setIdDeporte(int idDeporte) {
		this.id = idDeporte;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getEstatus() {
		return estatus;
	}
	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}
	
	private static final long serialVersionUID = 6843139214075576489L;

}
