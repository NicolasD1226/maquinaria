/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retomaquina.maquinaria.app.controllers;


import com.retomaquina.maquinaria.app.entities.Reservation;
import com.retomaquina.maquinaria.app.services.ReservationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ADMIN
 */
@RestController
@RequestMapping("Reservation")
public class ReservationController {
   
    @Autowired
    private ReservationService service;
    
    /**
     * SELECT
     * @return 
     */
    @GetMapping("/all")
    public List<Reservation> getReservation(){
        return service.getAll();
    }
    /**
     * POST
     * @param reservation
     * @return 
     */
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save(@RequestBody Reservation reservation) {
      return service.save(reservation);
     }
    /**
     * UPDATE
     * @param reservation
     * @return 
     */
  
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation update(@RequestBody Reservation reservation) {
     return service.update(reservation);
    }
	    
     /**
     * DELETE
    * @param reservationId
    * @return 
     */
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") int reservationId) {
    return service.deleteReservation(reservationId);
    }
    
    
}
