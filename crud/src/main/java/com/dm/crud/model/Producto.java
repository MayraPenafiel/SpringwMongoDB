/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dm.crud.model;

import java.time.LocalDate;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Usuario
 */
@Document(collection="products")
public class Producto {
    
    //Atributos
    @Id
    private String _id;
    private String nombre;
    private Double precio;
    private LocalDate fecha_expira;

    //Constructores
    public Producto() {
    }

    public Producto(String _id, String nombre, Double precio, LocalDate fecha_expira) {
        this._id = _id;
        this.nombre = nombre;
        this.precio = precio;
        this.fecha_expira = fecha_expira;
    }

    //Metodos getter y setter
    public String getId() { return _id; }
    
    public void setId(String _id) { this._id = _id;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) { this.nombre = nombre; }

    public Double getPrecio() { return precio; }

    public void setPrecio(Double precio) { this.precio = precio; }

    public LocalDate getFecha_expira() { return fecha_expira; }

    public void setFecha_expira(LocalDate fecha_expira) { this.fecha_expira = fecha_expira; }

    //Metodo toString
    @Override
    public String toString() {
        return "Producto{" + "_id=" + _id + ", nombre=" + nombre + ", precio=" + precio + ", fecha_expira=" + fecha_expira + '}';
    }
    
}
