/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retomaquina.maquinaria.app.controllers;


import com.retomaquina.maquinaria.app.entities.Client;
import com.retomaquina.maquinaria.app.services.ClientService;
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
@RequestMapping("Client")
public class ClientController {
    
    @Autowired
    private ClientService service;
    
    @GetMapping("/all")
    public  List<Client> findAllClient(){
       return service.getClient();
    }
    
    @PostMapping("/save")
    public ResponseEntity addClientEntity (@RequestBody Client client){
        service.saveClient(client);
        return ResponseEntity.status(201).build();
    } 
    
    @PutMapping("/upload")
    public ResponseEntity  uploadClientEntity(@RequestBody Client client){
        service.updateClient(client);
        return ResponseEntity.status(201).build();
    }
    
    @DeleteMapping("/delete")
    public ResponseEntity deleteClientEntity(@RequestBody Client client){
        service.deleteClient(client.getId());
        return ResponseEntity.status(204).build();
    }
}