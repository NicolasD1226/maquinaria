/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retomaquina.maquinaria.app.controllers;


import com.retomaquina.maquinaria.app.entities.Category;
import com.retomaquina.maquinaria.app.services.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
@RequestMapping("Category")
public class CategoryController {
   @Autowired
    private CategoryService service;
    
    /**
     * SELECT
     * @return 
     */
    @GetMapping("/all")
    public List<Category> getCategory(){
        return service.getAll();
    }
    /**
     * POST
     * @param category
     * @return 
     */
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Category category) {
       service.save(category);
     }
       /**
     * UPDATE
     * @param category
     * @return 
     */
  
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public void update(@RequestBody Category category) {
      service.update(category);
    }
	    
     /**
     * DELETE
    * @param categoryId
    * @return 
     */
    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") int categoryId) {
         service.deleteCategory(categoryId);
    }
  
}
