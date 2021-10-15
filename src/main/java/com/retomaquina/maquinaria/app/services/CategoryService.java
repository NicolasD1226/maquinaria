/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retomaquina.maquinaria.app.services;

import com.retomaquina.maquinaria.app.entities.Category;
import com.retomaquina.maquinaria.app.repositories.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ADMIN
 */
@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository repository;
    /**
     *  GET
     * @return 
     */
    
    public List<Category> getCategory(){
        return repository.findAll();
    }
    /**
     * POST
     * @param category
     * @return 
     */
    
    public Category saveCategory(Category category){
    return repository.save(category);
    }
    /**
     * PUT
     * @param category
     * @return 
     */
    
    public Category updateCategory(Category category){
        Category existingCategory = repository.findById(category.getId()).orElse(null);
        existingCategory.setName(category.getName());
        existingCategory.setDescription(category.getDescription());
        
        return  repository.save(existingCategory);
    }
    /**
     * DELETE
     * @param id
     * @return 
     */
    
    public String deleteClient(int id){
        
        repository.deleteById(id);
        return "Categoria "+ id +" eliminada";
    }
    
}
