package com.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.entity.Vuelo;

/**
 * 
 * @author Alberto Zapardiel Fernández
 *
 */
@Repository
public interface VueloRepository extends JpaRepository<Vuelo, Integer> {

}
