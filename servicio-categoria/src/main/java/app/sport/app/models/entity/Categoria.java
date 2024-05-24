package app.sport.app.models.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Categoria implements Serializable {

	@Id
	@Column(name = "id_categoria")
	private Integer idCategoria;

	@Column(name = "descripcion_categoria")
	private String categoria;

	@Column(name = "id_torneos")
	private Integer idTorneo;

	@Column(name = "descripcion_torneo")
	private String torneo;

	public Integer getId() {
		return idCategoria;
	}

	public void setId(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getIdTorneo() {
		return idTorneo;
	}

	public void setIdTorneo(Integer idTorneo) {
		this.idTorneo = idTorneo;
	}

	public String getTorneo() {
		return torneo;
	}

	public void setTorneo(String torneo) {
		this.torneo = torneo;
	}

	private static final long serialVersionUID = -7940825367816215374L;

}
