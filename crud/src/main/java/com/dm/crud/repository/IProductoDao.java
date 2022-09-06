/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dm.crud.repository;

import com.dm.crud.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Usuario
 */
public interface IProductoDao extends MongoRepository<Producto,String>{
    
}
