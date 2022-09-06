/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dm.crud.service;


import com.dm.crud.model.Producto;
import com.dm.crud.repository.IProductoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class ProductoServiceImp extends GenericServiceImpl<Producto,String>implements ProductoService{

    @Autowired
    IProductoDao repository;
    
    @Override
    public CrudRepository<Producto, String> getDao() {
        return repository;
    }

    
    
}
