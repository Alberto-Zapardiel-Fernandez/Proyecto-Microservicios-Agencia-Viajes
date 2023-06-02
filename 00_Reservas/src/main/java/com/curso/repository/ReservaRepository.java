package com.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.entity.Reserva;

/**
 * 
 * @author Alberto Zapardiel Fernández
 *
 */
@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

}
