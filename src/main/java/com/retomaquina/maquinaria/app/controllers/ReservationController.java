/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retomaquina.maquinaria.app.controllers;


import com.rentamaquina.maquinaria.app.entities.custom.CountClient;
import com.rentamaquina.maquinaria.app.entities.custom.DescriptionAmount;
import com.retomaquina.maquinaria.app.entities.Reservation;
import com.retomaquina.maquinaria.app.services.ReservationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins = "*")
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
     *  
     */
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Reservation reservation) {
       service.save(reservation);
     }
     /**
     * UPDATE
     * @param reservation
     * 
     */
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public void update(@RequestBody Reservation reservation) {
      service.update(reservation);
    }
	 
     /**
     * DELETE
    * @param reservationId
    * 
     */
    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") int reservationId) {
         service.deleteReservation(reservationId);
    }
    @GetMapping("/report-status")
    public DescriptionAmount getReservationStatus(){
	return service.getStatusReport();
    } 
    
    
    @GetMapping("report-clients")
    public List<CountClient> getCountClient(){
	return service.getTopClient();
    } 
    
    
    @GetMapping("/report-dates/{dateOne}/{dateTwo}")
    public List<Reservation> getDatesReport(
    @PathVariable("dateOne") String d1,@PathVariable("dateTwo") String d2){
	return service.getReservationPeriod(d1,d2);
    }
    
}
