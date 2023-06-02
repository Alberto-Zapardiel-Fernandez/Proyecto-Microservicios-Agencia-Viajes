package com.curso.entity;

import java.io.Serializable;
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
@Table(name = "reserva")
public class Reserva implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4029617309349081020L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_reserva")
	private int idReserva;
	@Column(name = "nombre_cliente")
	private String nombreCliente;
	@Column(name = "dni")
	private String dni;
	@Column(name = "id_hotel")
	private int idHotel;
	@Column(name = "id_vuelo")
	private int idVuelo;

	public Reserva(int idReserva, String nombreCliente, String dni, int idHotel, int idVuelo) {
		super();
		this.idReserva = idReserva;
		this.nombreCliente = nombreCliente;
		this.dni = dni;
		this.idHotel = idHotel;
		this.idVuelo = idVuelo;
	}

	public Reserva() {
		super();
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
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

	@Override
	public int hashCode() {
		return Objects.hash(dni, idHotel, idReserva, idVuelo, nombreCliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		return Objects.equals(dni, other.dni) && idHotel == other.idHotel && idReserva == other.idReserva
				&& idVuelo == other.idVuelo && Objects.equals(nombreCliente, other.nombreCliente);
	}

	@Override
	public String toString() {
		return "Reserva [idReserva=" + idReserva + ", nombreCliente=" + nombreCliente + ", dni=" + dni + ", idHotel="
				+ idHotel + ", idVuelo=" + idVuelo + "]";
	}

}
