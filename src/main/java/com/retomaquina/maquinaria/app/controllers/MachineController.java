/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retomaquina.maquinaria.app.controllers;


import com.retomaquina.maquinaria.app.entities.Machine;
import com.retomaquina.maquinaria.app.services.MachineService;
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
@RequestMapping("Machine")
public class MachineController {
    
    @Autowired
    private MachineService service;
    
    @GetMapping("/all")
    public  List<Machine> findAllMachine(){
       return service.getMachines();
    }
    
    @PostMapping("/save")
    public ResponseEntity addMachineEntity (@RequestBody Machine machine){
        service.saveMachine(machine);
        return ResponseEntity.status(201).build();
    } 
    
    @PutMapping("/upload")
    public ResponseEntity  uploadMachineEntity(@RequestBody Machine machine){
        service.updateMachine(machine);
        return ResponseEntity.status(201).build();
    }
    
    @DeleteMapping("/delete")
    public ResponseEntity deleteMachineEntity(@RequestBody Machine machine){
        service.deleteMachine(machine.getId());
        return ResponseEntity.status(204).build();
    }
    
    
}