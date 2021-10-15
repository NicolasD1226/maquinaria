/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retomaquina.maquinaria.app.services;

import com.retomaquina.maquinaria.app.entities.Machine;
import com.retomaquina.maquinaria.app.repositories.MachineRepository;;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ADMIN
 */
@Service
public class MachineService {
    
    @Autowired
    private MachineRepository repository;
   
    /**
     *  GET
     * @return 
     */
    
    public List<Machine> getMachines(){
        return repository.findAll();
    }
    /**
     * POST
     * @param machine
     * @return 
     */
    
    public Machine saveMachine(Machine machine){
    return repository.save(machine);
    }
    /**
     * PUT
     * @param machine
     * @return 
     */
    
    public Machine updateMachine(Machine machine){
        Machine existingMachine = repository.findById(machine.getId()).orElse(null);
        existingMachine.setBrand(machine.getBrand());
        existingMachine.setName(machine.getName());
        existingMachine.setYear(machine.getYear());
        existingMachine.setDescription(machine.getDescription());
        return  repository.save(existingMachine);
    }
    /**
     * DELETE
     * @param id
     * @return 
     */
    
    public String deleteMachine(int id){
        
        repository.deleteById(id);
        return "Maquina "+ id +" eliminada";
    }
}
