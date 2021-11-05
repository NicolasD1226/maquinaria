/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retomaquina.maquinaria.app.services;


import com.rentamaquina.maquinaria.app.entities.custom.CountClient;
import com.rentamaquina.maquinaria.app.entities.custom.DescriptionAmount;
import com.retomaquina.maquinaria.app.entities.Reservation;
import com.retomaquina.maquinaria.app.repositories.ReservationRepository;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ADMIN
 */
@Service
public class ReservationService {
    
         @Autowired
    private  ReservationRepository repository;
    
    /**
     * GET
     * @return 
     */
    public List<Reservation> getAll(){
        return  repository.getAll();
    } 
    
    /**
     * Buscar por ID
     * @param reservationid
     * @return 
     */
    public Optional<Reservation> getReservation (int reservationid){
        return repository.getReservation(reservationid);
    }
    
    /**
     * POST
     * @param reservation
     * @return 
     */
    public void save(Reservation reservation){
        if (reservation.getIdReservation()!= null) {
            Optional<Reservation> resultado =repository.getReservation(reservation.getIdReservation());
            if (resultado.isPresent()){
                
            }else{
                 repository.save(reservation);
            }  
        }else{
             repository.save(reservation);
        }
    }
    
    /**
     * UPDATE
     * @param reservation
     * @return 
     */
    
    public Reservation update(Reservation reservation){
        if(reservation.getIdReservation()!= null){
            Optional<Reservation> resultado =repository.getReservation(reservation.getIdReservation());
            if (resultado.isPresent()){
                if (reservation.getStartDate()!= null){
                    resultado.get().setStartDate(reservation.getStartDate());
                }
                if (reservation.getDevolutionDate()!= null){
                    resultado.get().setDevolutionDate(reservation.getDevolutionDate());
                }
                if (reservation.getStatus()!= null){
                    resultado.get().setStatus(reservation.getStatus());}
                
                repository.save(resultado.get());
                return resultado.get();
            }else{
                return reservation;
            }
        }else{
            return reservation;
        }
    }
    /**
     * DELETE
     * @param reservationId
     * @return 
     */
    public boolean deleteReservation(int reservationId){
        boolean aboolean = getReservation(reservationId).map(reservation ->{
            repository.delete(reservation);
            return  true;
        }).orElse(false);
        return aboolean;
        }

    public List<CountClient> getTopClient(){
    return repository.getTopClient();
    }  
 
    public DescriptionAmount getStatusReport(){
    List<Reservation> completed = repository.getReservationByStatus("completed");
    List<Reservation> cancelled = repository.getReservationByStatus("cancelled");   
    
    DescriptionAmount descAmt = new DescriptionAmount(completed.size(),cancelled.size());
    return descAmt;
    
}

     public List<Reservation> getReservationPeriod(String d1, String d2){

        SimpleDateFormat parser=new SimpleDateFormat("yyyy-MM-dd");
        Date dateOne=new Date();
        Date dateTwo=new Date();
        try {
            dateOne=parser.parse(d1);
            dateTwo=parser.parse(d2);
        }catch (ParseException e) {
            e.printStackTrace();
        }
        if(dateOne.before(dateTwo)){
            return repository.getReservationByPeriod(dateOne,dateTwo);
        }else{
            return new ArrayList<>();
        }
    }

}
                