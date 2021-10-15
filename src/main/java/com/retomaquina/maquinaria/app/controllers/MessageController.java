/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retomaquina.maquinaria.app.controllers;

import com.retomaquina.maquinaria.app.entities.Message;
import com.retomaquina.maquinaria.app.services.MessageService;
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
@RequestMapping("Message")
public class MessageController {
    
    @Autowired
    private MessageService service;
    
    @GetMapping("/all")
    public  List<Message> findAllMessage(){
       return service.getMessages();
    }
    
    @PostMapping("/save")
    public ResponseEntity addMessageEntity (@RequestBody Message message){
        service.saveMessages(message);
        return ResponseEntity.status(201).build();
    } 
    
    @PutMapping("/upload")
    public ResponseEntity  uploadMessageEntity(@RequestBody Message message){
        service.updateMessages(message);
        return ResponseEntity.status(201).build();
    }
    
    @DeleteMapping("/delete")
    public ResponseEntity deleteMessageEntity(@RequestBody Message message){
        service.deleteMessages(message.getId());
        return ResponseEntity.status(204).build();
    }
    
}
