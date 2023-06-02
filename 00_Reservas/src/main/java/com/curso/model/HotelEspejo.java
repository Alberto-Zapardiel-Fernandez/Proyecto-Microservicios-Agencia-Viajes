package com.curso.model;

/**
 * 
 * @author Alberto Zapardiel Fernández
 *
 */
public class HotelEspejo {

	/**
	 * Clase para obtener los datos del hotel
	 */
	private int idHotel;
	private String nombre;
	private String categoria;
	private Double precio;
	private boolean disponible;

	public HotelEspejo(int idHotel, String nombre, String categoria, Double precio, boolean disponible) {
		super();
		this.idHotel = idHotel;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.disponible = disponible;
	}

	public HotelEspejo() {
		super();
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "HotelEspejo [idHotel=" + idHotel + ", nombre=" + nombre + ", categoria=" + categoria + ", precio="
				+ precio + ", disponible=" + disponible + "]";
	}

}
