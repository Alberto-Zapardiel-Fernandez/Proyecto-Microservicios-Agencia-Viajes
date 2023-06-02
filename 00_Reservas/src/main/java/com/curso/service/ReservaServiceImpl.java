package com.curso.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.entity.Reserva;
import com.curso.model.HotelEspejo;
import com.curso.model.ReservaConPlazas;
import com.curso.model.VueloEspejo;
import com.curso.repository.ReservaRepository;

@Service
public class ReservaServiceImpl implements ReservaService{
	
	@Autowired
	ReservaRepository repository;
	
	@Autowired
	RestTemplate template;
	
	//Nuestra raiz es http://localhost:9002/
	
	private final String RAIZ= "http://localhost:";
	private final String PUERTO_VUELOS = "9003/";
	private final String PUERTO_HOTELES = "9001/";
	private String urlVuelos=RAIZ+PUERTO_VUELOS;
	private String urlHoteles=RAIZ+PUERTO_HOTELES;

	@Override
	public void altaReserva(ReservaConPlazas reserva) {
		//Obtengo la lista de vuelos disponibles,llamando a vuelos
		ResponseEntity<List<VueloEspejo>> response = template.exchange(urlVuelos+"vuelos/"+reserva.getPlazas(), HttpMethod.GET,null,
				new ParameterizedTypeReference<List<VueloEspejo>>() {});
		List<VueloEspejo> vuelos = response.getBody();
		for (VueloEspejo vueloEspejo : vuelos) {
			if (reserva.getIdVuelo()==vueloEspejo.getIdVuelo()) {
				template.postForLocation(urlVuelos+"vuelo/"+vueloEspejo.getIdVuelo()+"/"+reserva.getPlazas(), null);
				
				Reserva r = new Reserva();
				r.setIdHotel(reserva.getIdHotel());
				r.setIdVuelo(reserva.getIdVuelo());
				r.setDni(reserva.getDni());
				r.setNombreCliente(reserva.getNombreCliente());
				repository.save(r);
				return;
			}
		}
		
	}
	//Entrada: http://localhost:9002/reserva/Ibis
	@Override
	public List<Reserva> verReservas(String nombreHotel) {
		//Tengo las reservas
		List<Reserva> reservas = repository.findAll();
		List<Reserva> reservaDeHotel = new ArrayList<>();
		//Tengo todos los hoteles
		HotelEspejo hotel =  template.getForObject(urlHoteles+"hotel/"+nombreHotel, HotelEspejo.class);
		if (!reservas.isEmpty()) {
			for (Reserva reserva : reservas) {
				if ( reserva.getIdHotel()==hotel.getIdHotel()) {
					reservaDeHotel.add(reserva);
				}
			}
		}else {
			System.err.println("No hay reservas para "+nombreHotel);
		}
		return reservaDeHotel;
	}

}
