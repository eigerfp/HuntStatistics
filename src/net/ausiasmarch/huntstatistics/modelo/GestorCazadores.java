/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ausiasmarch.huntstatistics.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Ariadna
 */
public class GestorCazadores {

    private List<Cazador> cazador;
    
    public GestorCazadores(){
        cazador = new ArrayList();
    }
    
    public List<Cazador> getCazador(){
        return cazador;
    }
    
    public void setCazador (List<Cazador> cazador) {
        this.cazador = cazador;
    }
    
    public Cazador buscarCazador(String nombre){
        //Collections.sort(cazador, new NombreCazadorComparator());
        //int index = Collections.binarySearch(cazador, new Cazador(nombre, animal, 0),)
        return null;
    }
}
