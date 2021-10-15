/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retomaquina.maquinaria.app.entities;

import java.io.Serializable;
//import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
@Table(name="machine")
public class Machine implements Serializable{
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String brand;
    private int year;
    private String description;
    //private Category category;
    //private List<Message> messages;
    //private List<Reservation> reservations;
    
}
