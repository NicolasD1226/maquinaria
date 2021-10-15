/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retomaquina.maquinaria.app.services;

import com.retomaquina.maquinaria.app.entities.Client;
import com.retomaquina.maquinaria.app.repositories.ClientRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ADMIN
 */
@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;
    /**
     *  GET
     * @return 
     */
    
    public List<Client> getClient(){
        return repository.findAll();
    }
    /**
     * POST
     * @param client
     * @return 
     */
    
    public Client saveClient(Client client){
    return repository.save(client);
    }
    /**
     * PUT
     * @param client
     * @return 
     */
    
    public Client updateClient(Client client){
        Client existingClient = repository.findById(client.getId()).orElse(null);
        existingClient.setName(client.getName());
        existingClient.setEmail(client.getEmail());
        existingClient.setAge(client.getAge());
        return  repository.save(existingClient);
    }
    /**
     * DELETE
     * @param id
     * @return 
     */
    
    public String deleteClient(int id){
        
        repository.deleteById(id);
        return "Cliente "+ id +" eliminado";
    }
    
}
