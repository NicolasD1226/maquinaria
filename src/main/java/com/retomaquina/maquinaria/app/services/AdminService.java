/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retomaquina.maquinaria.app.services;


import com.retomaquina.maquinaria.app.entities.Admin;
import com.retomaquina.maquinaria.app.repositories.AdminRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ADMIN
 */
@Service
public class AdminService {
    
    @Autowired
    private  AdminRepository repository;
    
    /**
     * GET
     * @return 
     */
    public List<Admin> getAll(){
        return  repository.getAll();
    } 
    
    /**
     * Buscar por ID
     * @param adminid
     * @return 
     */
    public Optional<Admin> getAdmin (int adminid){
        return repository.getAdmin(adminid);
    }
    
    /**
     * POST
     * @param admin
     * @return 
     */
    public void save(Admin admin){
        if (admin.getIdAdmin()!= null) {
            Optional<Admin> resultado =repository.getAdmin(admin.getIdAdmin());
            if (resultado.isPresent()){
                
            }else{
                repository.save(admin);
            }  
        }else{
                repository.save(admin);
        }
    }
    
    /**
     * UPDATE
     * @param admin
     * @return 
     */
    
    public Admin update(Admin admin){
        if(admin.getIdAdmin()!= null){
            Optional<Admin> resultado =repository.getAdmin(admin.getIdAdmin());
            if (resultado.isPresent()){
                if (admin.getName()!= null){
                    resultado.get().setName(admin.getName());
                }
                if (admin.getPassword()!= null){
                    resultado.get().setPassword(admin.getPassword());
                }
                if (admin.getEmail()!= null){
                    resultado.get().setEmail(admin.getEmail());}
                repository.save(resultado.get());
                return resultado.get();
            }else{
                return admin;
            }
        }else{
            return admin;
        }
    }
    /**
     * DELETE
     * @param adminId
     * @return 
     */
    public boolean deleteAdmin(int adminId){
        boolean aboolean = getAdmin(adminId).map(admin ->{
            repository.delete(admin);
            return  true;
        }).orElse(false);
        return aboolean;
        }

    
}
