/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retomaquina.maquinaria.app.services;


import com.retomaquina.maquinaria.app.entities.Machine;
import com.retomaquina.maquinaria.app.repositories.MachineRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ADMIN
 */
@Service
public class MachineService {

         @Autowired
    private  MachineRepository repository;
    
    /**
     * GET
     * @return 
     */
    public List<Machine> getAll(){
        return  repository.getAll();
    } 
    
    /**
     * Buscar por ID
     * @param machineid
     * @return 
     */
    public Optional<Machine> getMachine (int machineid){
        return repository.getMachine(machineid);
    }
    
    /**
     * POST
     * @param machine
     * @return 
     */
    public void save(Machine machine){
        if (machine.getId()!= null) {
            Optional<Machine> resultado =repository.getMachine(machine.getId());
            if (resultado.isPresent()){
                
            }else{
                 repository.save(machine);
            }  
        }else{
                 repository.save(machine);
        }
    }
    
    /**
     * UPDATE
     * @param machine
     * @return 
     */
    
    public Machine update(Machine machine){
        if(machine.getId()!= null){
            Optional<Machine> resultado =repository.getMachine(machine.getId());
            if (resultado.isPresent()){
                if (machine.getName()!= null){
                    resultado.get().setName(machine.getName());
                }
                if (machine.getYear()!= null){
                    resultado.get().setYear(machine.getYear());
                }
                if (machine.getBrand()!= null){
                    resultado.get().setBrand(machine.getBrand());}
                
                if (machine.getDescription()!= null){
                    resultado.get().setDescription(machine.getDescription());}
           
                repository.save(resultado.get());
                return resultado.get();
            }else{
                return machine;
            }
        }else{
            return machine;
        }
    }
    /**
     * DELETE
     * @param machineId
     * @return 
     */
    public boolean deleteMachine(int machineId){
        boolean aboolean = getMachine(machineId).map(machine ->{
            repository.delete(machine);
            return  true;
        }).orElse(false);
        return aboolean;
        }

    
}
