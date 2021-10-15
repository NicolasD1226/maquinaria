/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retomaquina.maquinaria.app.controllers;

import com.retomaquina.maquinaria.app.entities.Category;
import com.retomaquina.maquinaria.app.entities.Client;
import com.retomaquina.maquinaria.app.services.CategoryService;
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
@RequestMapping("Category")
public class CategoryController {
    
    @Autowired
    private CategoryService service;
    
    @GetMapping("/all")
    public  List<Category> findAllCategory(){
       return service.getCategory();
    }
    
    @PostMapping("/save")
    public ResponseEntity addCategoryEntity (@RequestBody Category category){
        service.saveCategory(category);
        return ResponseEntity.status(201).build();
    } 
    
    @PutMapping("/upload")
    public ResponseEntity  uploadCategoryEntity(@RequestBody Category category){
        service.updateCategory(category);
        return ResponseEntity.status(201).build();
    }
    
    @DeleteMapping("/delete")
    public ResponseEntity deleteCategoryEntity(@RequestBody Category category){
        service.deleteClient(category.getId());
        return ResponseEntity.status(204).build();
    }
}
