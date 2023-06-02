package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.curso.entity.Hotel;
import com.curso.service.HotelService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * 
 * @author Alberto Zapardiel Fernández
 *
 */

@RestController
public class HotelController {

	@Autowired
	HotelService service;

	/**
	 * 
	 * @return devuelve la lista de hoteles existentes
	 */
	@ApiOperation(value = "Devuelve una lista de hoteles")
	@ApiResponses(value = {
		       @ApiResponse(
		         code = 200, message = "OK. El recurso se obtiene correctamente" ),
		       @ApiResponse(code = 404, message = "Método no permitido."),
		       @ApiResponse(code = 500, message = "Error inesperado del sistema")
		       })
	
	@GetMapping(value = "hoteles", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Hotel> verHoteles() {
		return service.verHoteles();
	}

	/**
	 * 
	 * @param nombre es el nombre del hotel para buscarlo
	 * @return el hotel que haya encontrado
	 */
	@ApiOperation(value = "Devuelve un hotel buscanso por su nombre")
	@GetMapping(value = "hotel/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Hotel verHotel(@ApiParam(value = "nombre del hotel")  @PathVariable(name = "nombre") String nombre) {
		return service.verHotel(nombre);
	}
}
