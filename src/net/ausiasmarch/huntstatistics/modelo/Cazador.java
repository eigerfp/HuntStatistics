/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ausiasmarch.huntstatistics.modelo;

import java.util.List;

/**
 *
 * @author Ariadna
 */
public class Cazador {

    private String nombre;
    private List<PiezaAbatida> animales;

    public Cazador(String nombre, List<PiezaAbatida> animales) {
        this.nombre = nombre;
        this.animales = animales;
    }

    public Cazador() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<PiezaAbatida> getAnimales() {
        return animales;
    }

    public void setAnimales(List<PiezaAbatida> animales) {
        this.animales = animales;
    }
    
}
