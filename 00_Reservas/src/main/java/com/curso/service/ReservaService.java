package com.curso.service;

import java.util.List;

import com.curso.entity.Reserva;
import com.curso.model.ReservaConPlazas;

/**
 * 
 * @author Alberto Zapardiel Fernández
 *
 */
public interface ReservaService {

	/**
	 * 
	 * @param reserva es la reserva con las plazas añadidas, para buscar un vuelo
	 *                disponible
	 */
	public void altaReserva(ReservaConPlazas reserva);

	/**
	 * 
	 * @param nombreHotel es el nombre del hotel sobre el que buscar
	 * @return la lista de reservas que tenga dicho hotel
	 */
	public List<Reserva> verReservas(String nombreHotel);
}
