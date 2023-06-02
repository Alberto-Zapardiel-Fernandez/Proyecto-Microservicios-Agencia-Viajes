package com.curso.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.entity.Vuelo;
import com.curso.repository.VueloRepository;

/**
 * 
 * @author Alberto Zapardiel Fernández
 *
 */
@Service
public class VueloServiceImpl implements VueloService {

	@Autowired
	VueloRepository repository;

	/**
	 * @param plazas son las plazas obtenidas para ver los vuelos disponibles
	 */
	@Override
	public List<Vuelo> verVuelosDisponibles(int plazas) {
		List<Vuelo> vuelos = repository.findAll();
		List<Vuelo> vuelosDisponibles = new ArrayList<>();

		for (Vuelo vuelo : vuelos) {
			if (vuelo.getPlazas() > plazas) {
				vuelosDisponibles.add(vuelo);
			}
		}
		return vuelosDisponibles;
	}

	/**
	 * @param idVuelo es el id del vuelo a buscar para actualizar sus plazas
	 * @param plazas  son las obtenidas para modificar el vuelo
	 */
	@Override
	public void actualizarVuelo(int idVuelo, int plazas) {
		Vuelo vuelo = repository.findById(idVuelo).orElse(null);
		Vuelo v = new Vuelo();
		System.err.println(
				vuelo.getPlazas() + " plazas tiene, llegan " + plazas + " y la resta " + (vuelo.getPlazas() - plazas));
		v.setIdVuelo(vuelo.getIdVuelo());
		v.setCompania(vuelo.getCompania());
		v.setFechaVuelo(vuelo.getFechaVuelo());
		v.setPrecio(vuelo.getPrecio());
		v.setPlazas(vuelo.getPlazas() - plazas);
		System.err.println(v);
		repository.save(v);
	}

}
