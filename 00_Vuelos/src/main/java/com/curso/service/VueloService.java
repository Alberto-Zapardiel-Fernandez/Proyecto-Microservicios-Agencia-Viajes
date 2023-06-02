package com.curso.service;

import java.util.List;

import com.curso.entity.Vuelo;

/**
 * 
 * @author Alberto Zapardiel Fernández
 *
 */
public interface VueloService {

	/**
	 * 
	 * @param plazas para ver qué vuelos hay disponibles según las plazas enviadas
	 * @return la lista de vuelos disponibles
	 */
	public List<Vuelo> verVuelosDisponibles(int plazas);

	/**
	 * 
	 * @param idVuelo el identificador del vuelo para buscarlo y actualizar sus
	 *                plazas
	 * @param plazas  obtenidas para actualizar el valor del vuelo
	 */
	public void actualizarVuelo(int idVuelo, int plazas);
}
