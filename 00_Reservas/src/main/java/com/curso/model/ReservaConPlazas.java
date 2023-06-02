package com.curso.model;

/**
 * 
 * @author Alberto Zapardiel Fernández
 *
 */
public class ReservaConPlazas {
	/**
	 * Clase para obtener las reservas, añadiendo las plazas del vuelo
	 */
	private String nombreCliente;
	private String dni;
	private int idHotel;
	private int idVuelo;
	private int plazas;

	public ReservaConPlazas(String nombreCliente, String dni, int idHotel, int idVuelo, int plazas) {
		super();
		this.nombreCliente = nombreCliente;
		this.dni = dni;
		this.idHotel = idHotel;
		this.idVuelo = idVuelo;
		this.plazas = plazas;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	@Override
	public String toString() {
		return "ReservaConPlazas [nombreCliente=" + nombreCliente + ", dni=" + dni + ", idHotel=" + idHotel
				+ ", idVuelo=" + idVuelo + ", plazas=" + plazas + "]";
	}

}
