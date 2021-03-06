/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retomaquina.maquinaria.app.controllers;

import com.retomaquina.maquinaria.app.entities.Admin;
import com.retomaquina.maquinaria.app.services.AdminService;
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
@RequestMapping("Admin")
@CrossOrigin(origins = "*")
public class AdminController {
    @Autowired
    private AdminService service;
    
    /**
     * SELECT
     * @return 
     */
    @GetMapping("/all")
    public List<Admin> getAdmin(){
        return service.getAll();
    }
    /**
     * POST
     * @param admin
     * @return 
     */
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Admin admin) {
        service.save(admin);
     }
    /**
     * UPDATE
     * @param admin
     * @return 
     */
     @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public void update(@RequestBody Admin admin) {
      service.update(admin);
    }
	    
     /**
     * DELETE
    * @param adminId
    * @return 
     */
    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") int adminId) {
         service.deleteAdmin(adminId);
    }
 
    
}
