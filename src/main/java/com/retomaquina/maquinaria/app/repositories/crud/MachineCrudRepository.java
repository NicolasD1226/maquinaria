/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retomaquina.maquinaria.app.repositories.crud;

import com.retomaquina.maquinaria.app.entities.Machine;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ADMIN
 */
public interface MachineCrudRepository extends CrudRepository<Machine,Integer>{
    
}
