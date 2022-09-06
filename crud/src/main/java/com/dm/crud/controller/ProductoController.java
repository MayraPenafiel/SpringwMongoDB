/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dm.crud.controller;

import com.dm.crud.model.Producto;
import com.dm.crud.repository.IProductoDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Usuario
 */
@RestController
@CrossOrigin(origins ="*" ,methods = {RequestMethod.POST, RequestMethod.GET,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/api/productos")
public class ProductoController {
    @Autowired 
    private IProductoDao repository;
    
    @PostMapping("/crear")
    public Producto create(@Validated @RequestBody Producto p){
        return repository.insert(p);
    }
    
    @GetMapping("/Listar")
    public List<Producto> readAll(){
        return repository.findAll();
    }
    
    @PutMapping("/Actualizar por codigo/{id}")
    public Producto update(@PathVariable String id, @Validated @RequestBody Producto p){
        p.setId(id);
        return repository.save(p);
    }
    
    @DeleteMapping("/Eliminar/{id}")
    public void delete(@PathVariable String id){
        repository.deleteById(id);
    }
}
