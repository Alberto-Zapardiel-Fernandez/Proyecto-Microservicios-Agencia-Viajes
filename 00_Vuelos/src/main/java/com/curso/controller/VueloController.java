package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.entity.Vuelo;
import com.curso.service.VueloService;

import io.swagger.annotations.ApiOperation;

/**
 * 
 * @author Alberto Zapardiel Fernández
 *
 */
@RestController
public class VueloController {

	@Autowired
	VueloService service;

	/**
	 * 
	 * @param plazas es el número de plazas disponibles para ese vuelo
	 * @return la lista de vuelos disponibles con esas plazas
	 */
	@ApiOperation(value = "Devuelve una lista de vuelos según las plazas disponibles")
	@GetMapping(value = "vuelos/{plazas}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Vuelo> verVuelosDisponibles(@PathVariable(name = "plazas") int plazas) {
		return service.verVuelosDisponibles(plazas);
	}

	/**
	 * 
	 * @param idVuelo es el identificador del vuelo para actualizarlo con las plazas
	 * @param plazas  es el valor que debemos usar para actualizar
	 */
	@ApiOperation(value = "Actualiza el vuelo según su id, con las plazas pasadas por parámetro")
	@PostMapping(value = "vuelo/{idVuelo}/{plazas}")
	public void actualizarVuelo(@PathVariable(name = "idVuelo") int idVuelo,
			@PathVariable(name = "plazas") int plazas) {
		service.actualizarVuelo(idVuelo, plazas);
	}
}
