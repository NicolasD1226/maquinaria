/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retomaquina.maquinaria.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



/**
 *
 * @author ADMIN
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="reservation")
public class Reservation implements Serializable { 
    
    @Id
    @GeneratedValue 
    private int idReservation;
    private Date startDate;
    private Calendar devolutionDate;
    private String status;
    
    @ManyToOne()
    @JoinColumn(name = "id")
    @JsonIgnoreProperties("reservations")
    private Machine machine;
    
    @ManyToOne()
    @JoinColumn(name = "idClient")
    @JsonIgnoreProperties({"messages","reservations"})
    private Client client;
    
    @OneToOne(cascade = {CascadeType.REMOVE},mappedBy ="reservation")
    @JsonIgnoreProperties("reservation")
    private Score Score;

}
