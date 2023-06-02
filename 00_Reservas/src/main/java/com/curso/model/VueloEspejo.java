package com.curso.model;

import java.sql.Date;

public class VueloEspejo {

	/**
	 * Clase para obtener los datos de los vuelos
	 */
	private int idVuelo;
	private String compania;
	private Date fechaVuelo;
	private Double precio;
	private int plazas;

	public VueloEspejo(int idVuelo, String compania, Date fechaVuelo, Double precio, int plazas) {
		super();
		this.idVuelo = idVuelo;
		this.compania = compania;
		this.fechaVuelo = fechaVuelo;
		this.precio = precio;
		this.plazas = plazas;
	}

	public VueloEspejo() {
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
	public String toString() {
		return "VueloEspejo [idVuelo=" + idVuelo + ", compania=" + compania + ", fechaVuelo=" + fechaVuelo + ", precio="
				+ precio + ", plazas=" + plazas + "]";
	}

}
