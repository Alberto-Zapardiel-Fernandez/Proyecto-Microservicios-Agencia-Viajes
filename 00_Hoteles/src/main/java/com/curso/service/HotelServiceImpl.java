package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.entity.Hotel;
import com.curso.repository.HotelRepository;

/**
 * 
 * @author Alberto Zapardiel Fernández
 *
 */
@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	HotelRepository repository;

	@Override
	public List<Hotel> verHoteles() {
		List<Hotel> hoteles = repository.findAll();
		List<Hotel> hotelesDisponibles = new ArrayList<>();
		for (Hotel hotel : hoteles) {
			if (hotel.isDisponible()) {
				hotelesDisponibles.add(hotel);
			}
		}
		return hotelesDisponibles;
	}

	@Override
	public Hotel verHotel(String nombre) {
		List<Hotel> hoteles = repository.findAll();
		for (Hotel hotel : hoteles) {
			if (hotel.getNombre().equalsIgnoreCase(nombre)) {
				return hotel;
			}
		}
		return null;
	}

}
