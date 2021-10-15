/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retomaquina.maquinaria.app.repositories;


import com.retomaquina.maquinaria.app.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ADMIN
 */
public interface ReservationRepository extends JpaRepository<Reservation,Integer> {
    
}
