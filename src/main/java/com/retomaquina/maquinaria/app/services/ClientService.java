/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retomaquina.maquinaria.app.services;


import com.retomaquina.maquinaria.app.entities.Client;
import com.retomaquina.maquinaria.app.repositories.ClientRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ADMIN
 */
@Service
public class ClientService {
   
    @Autowired
    private  ClientRepository repository;
    
    /**
     * GET
     * @return 
     */
    public List<Client> getAll(){
        return  repository.getAll();
    } 
    
    /**
     * Buscar por ID
     * @param clientid
     * @return 
     */
    public Optional<Client> getClient (int clientid){
        return repository.getClient(clientid);
    }
    
    /**
     * POST
     * @param client
     * @return 
     */
    public void save(Client client){
        if (client.getIdClient()!= null) {
            Optional<Client> resultado =repository.getClient(client.getIdClient());
            if (resultado.isPresent()){
                
            }else{
                 repository.save(client);
            }  
        }else{
                 repository.save(client);
        }
    }
    
    /**
     * UPDATE
     * @param client
     * @return 
     */
    
    public Client update(Client client){
        if(client.getIdClient()!= null){
            Optional<Client> resultado =repository.getClient(client.getIdClient());
            if (resultado.isPresent()){
                if (client.getName()!= null){
                    resultado.get().setName(client.getName());
                }
                if (client.getAge() != 0){
                    resultado.get().setAge(client.getAge());
                }
                if (client.getEmail()!= null){
                    resultado.get().setEmail(client.getEmail());}
                
                if (client.getPassword() != null){
                    resultado.get().setPassword(client.getPassword());
                }
                repository.save(resultado.get());
                return resultado.get();
            }else{
                return client;
            }
        }else{
            return client;
        }
    }
    /**
     * DELETE
     * @param clientId
     * @return 
     */
    public boolean deleteClient(int clientId){
        boolean aboolean = getClient(clientId).map(client ->{
            repository.delete(client);
            return  true;
        }).orElse(false);
        return aboolean;
        }
    }
