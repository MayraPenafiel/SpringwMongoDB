/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dm.crud.service;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface GenericService <T,ID extends Serializable>{
    
    public T save (T entity);
    public T findById(ID id);
    public List <T> findByAll();
    public void delete(ID id);
    
} 
    

