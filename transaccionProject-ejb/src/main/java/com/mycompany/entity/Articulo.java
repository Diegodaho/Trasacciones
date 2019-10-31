/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author DaveHell
 */
@Entity
@Table(name="articulo")
public class Articulo implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_articulo;
    
    @Column
    private String nombre_articulo;
    
    @Column
    private int costo_articulo;

    public Articulo() {
    }

    public Articulo(String nombre_articulo, int costo_articulo) {
        this.nombre_articulo = nombre_articulo;
        this.costo_articulo = costo_articulo;
    }

    public int getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(int id_articulo) {
        this.id_articulo = id_articulo;
    }

    public String getNombre_articulo() {
        return nombre_articulo;
    }

    public void setNombre_articulo(String nombre_articulo) {
        this.nombre_articulo = nombre_articulo;
    }

    public int getCosto_articulo() {
        return costo_articulo;
    }

    public void setCosto_articulo(int costo_articulo) {
        this.costo_articulo = costo_articulo;
    }
    
    
}
