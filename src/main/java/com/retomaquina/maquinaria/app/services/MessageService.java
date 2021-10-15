/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retomaquina.maquinaria.app.services;

import com.retomaquina.maquinaria.app.entities.Message;
import com.retomaquina.maquinaria.app.repositories.MessageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ADMIN
 */
@Service
public class MessageService {
    @Autowired
    private MessageRepository repository;
    /**
     *  GET
     * @return 
     */
    
    public List<Message> getMessages(){
        return repository.findAll();
    }
    /**
     * POST
     * @param message
     * @return 
     */
    
    public Message saveMessages(Message message){
    return repository.save(message);
    }
    /**
     * PUT
     * @param message
     * @return 
     */
    
    public Message updateMessages(Message message){
        Message existingMessage = repository.findById(message.getIdMessage()).orElse(null);
        existingMessage.setMessageText(message.getMessageText());
        
        
        return  repository.save(existingMessage);
    }
    /**
     * DELETE
     * @param id
     * @return 
     */
    
    public String deleteMessages(int id){
        
        repository.deleteById(id);
        return "Mensaje"+ id +" eliminado";
    
    }
}
