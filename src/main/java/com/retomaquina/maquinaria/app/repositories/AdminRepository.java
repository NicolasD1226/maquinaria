/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retomaquina.maquinaria.app.repositories;


import com.retomaquina.maquinaria.app.entities.Admin;
import com.retomaquina.maquinaria.app.entities.Admin;
import com.retomaquina.maquinaria.app.repositories.crud.AdminCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ADMIN
 */
@Repository
public class AdminRepository  {
    
    @Autowired
    private AdminCrudRepository adminCrudRepository;
    
    /**
    *SELECT
    *@return
    */
    
    public List<Admin> getAll(){
        return (List<Admin>) adminCrudRepository.findAll();
    }
    
    /**
     * Insert
     * @param admin
     * @return 
     */
    
    public Admin save(Admin admin ){
        return adminCrudRepository.save(admin);
    }
    
    /**
     * Buscar-registro
     * @param adminId
     * @return 
     */
    
    public Optional<Admin> getAdmin(int adminId){
        return adminCrudRepository.findById(adminId);
    }
    /**
     * Delete
     * @param admin 
     */
    
    public void delete(Admin admin){
         adminCrudRepository.delete(admin);
    }
    
}
