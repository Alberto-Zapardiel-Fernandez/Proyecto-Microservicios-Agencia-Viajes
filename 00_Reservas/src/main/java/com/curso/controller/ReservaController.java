package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.entity.Reserva;
import com.curso.model.ReservaConPlazas;
import com.curso.service.ReservaService;

import io.swagger.annotations.ApiOperation;

/**
 * 
 * @author Alberto Zapardiel Fernández
 *
 */
@RestController
public class ReservaController {

	@Autowired
	ReservaService service;

	// URL: http://localhost:9002/
	/**
	 * 
	 * @param reserva es la reserva pero con el número de plazas, ya que se recibe
	 *                por el Body en formato JSON
	 */
	@ApiOperation(value = "Realiza el alta de la reserva")
	@PostMapping(value = "reserva", produces = MediaType.APPLICATION_JSON_VALUE)
	public void altaReserva(@RequestBody ReservaConPlazas reserva) {
		service.altaReserva(reserva);

	}

	/**
	 * 
	 * @param nombreHotel recibido para buscar sobre los hoteles y ver si
	 *                    corresponde a la reserva
	 * @return la lista de reserva que tenga dicho hotel
	 */
	@ApiOperation(value = "Devuelve una lista de reservas según el nombre del hotel")
	@GetMapping(value = "reserva/{nombreHotel}")
	public List<Reserva> verReservas(@PathVariable(name = "nombreHotel") String nombreHotel) {
		return service.verReservas(nombreHotel);
	}
}
