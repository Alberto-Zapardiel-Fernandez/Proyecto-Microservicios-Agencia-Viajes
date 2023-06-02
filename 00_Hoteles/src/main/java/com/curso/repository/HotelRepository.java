package com.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.entity.Hotel;

/**
 * 
 * @author Alberto Zapardiel Fernández
 *
 */
@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {

}
