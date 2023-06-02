package com.curso.service;

import java.util.List;

import com.curso.entity.Hotel;

/**
 * 
 * @author Alberto Zapardiel Fernández
 *
 */
public interface HotelService {

	/**
	 * 
	 * @return de la lista de hoteles
	 */
	public List<Hotel> verHoteles();

	/**
	 * 
	 * @param nombre para buscar entre los hoteles con ese nombre
	 * @return el hotel encontrado
	 */
	public Hotel verHotel(String nombre);
}
