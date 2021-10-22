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
@RequestMapping("Client")
@CrossOrigin(origins = "*")
public class ClientController {
    @Autowired
    private ClientService service;
    
    /**
     * SELECT
     * @return 
     */
    @GetMapping("/all")
    public List<Client> getClient(){
        return service.getAll();
    }
    /**
     * POST
     * @param client
     * @return 
     */
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Client client) {
       service.save(client);
     }
       /**
     * UPDATE
     * @param client
     * @return 
     */
  
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public void update(@RequestBody Client client) {
      service.update(client);
    }
	    
     /**
     * DELETE
    * @param clientId
    * @return 
     */
    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") int clientId) {
         service.deleteClient(clientId);
    }
}
