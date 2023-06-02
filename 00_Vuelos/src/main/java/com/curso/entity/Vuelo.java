package com.curso.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Alberto Zapardiel Fernández
 *
 */
@Entity
@Table(name = "vuelos")
public class Vuelo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5845421792026743416L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_vuelo")
	private int idVuelo;
	@Column(name = "compania")
	private String compania;
	@Column(name = "fecha_vuelo")
	private Date fechaVuelo;
	@Column(name = "precio")
	private Double precio;
	@Column(name = "plazas")
	private int plazas;

	public Vuelo(int idVuelo, String compania, Date fechaVuelo, Double precio, int plazas) {
		super();
		this.idVuelo = idVuelo;
		this.compania = compania;
		this.fechaVuelo = fechaVuelo;
		this.precio = precio;
		this.plazas = plazas;
	}

	public Vuelo() {
		super();
	}

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public Date getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(Date fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(compania, fechaVuelo, idVuelo, plazas, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vuelo other = (Vuelo) obj;
		return Objects.equals(compania, other.compania) && Objects.equals(fechaVuelo, other.fechaVuelo)
				&& idVuelo == other.idVuelo && plazas == other.plazas && Objects.equals(precio, other.precio);
	}

	@Override
	public String toString() {
		return "Vuelo [idVuelo=" + idVuelo + ", compania=" + compania + ", fechaVuelo=" + fechaVuelo + ", precio="
				+ precio + ", plazas=" + plazas + "]";
	}

}
