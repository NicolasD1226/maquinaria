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
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
    
    @GetMapping("/all")
    public  List<Reservation> findAllReservation(){
       return service.getReservation();
    }
    
    @PostMapping("/save")
    public ResponseEntity addMessageEntity (@RequestBody Reservation reservation){
        service.saveReservation(reservation);
        return ResponseEntity.status(201).build();
    } 
    
    @PutMapping("/upload")
    public ResponseEntity  uploadMessageEntity(@RequestBody Reservation reservation){
        service.updateReservation(reservation);
        return ResponseEntity.status(201).build();
    }
    
    @DeleteMapping("/delete")
    public ResponseEntity deleteMessageEntity(@RequestBody Reservation reservation){
        service.deleteMessages(reservation.getIdReservation());
        return ResponseEntity.status(204).build();
    }
    
    
}
