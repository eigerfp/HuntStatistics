/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ausiasmarch.huntstatistics.modelo;

//import java.util.List;

/**
 *
 * @author Ariadna Igual
 */
public class Cazador {

    private String nombre, animal, localizacion, fecha, arma, municion, jornada;
    private int peso, distancia;
    private boolean rehala;
    //private List<PiezaAbatida> animales;

    public Cazador(String nombre, String animal, String localizacion, String fecha, String arma, String municion, String jornada, int peso, int distancia, boolean rehala) {
        this.nombre = nombre;
        this.animal = animal;
        this.localizacion = localizacion;
        this.fecha = fecha;
        this.arma = arma;
        this.municion = municion;
        this.jornada = jornada;
        this.peso = peso;
        this.distancia = distancia;
        this.rehala = rehala;
    }

    public Cazador(String nombre, String animal, String localizacion, String fecha, String arma, String jornada, int peso, int distancia, boolean rehala) {
        this.nombre = nombre;
        this.animal = animal;
        this.localizacion = localizacion;
        this.fecha = fecha;
        this.arma = arma;
        this.jornada = jornada;
        this.peso = peso;
        this.distancia = distancia;
        this.rehala = rehala;
    }

    public Cazador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getMunicion() {
        return municion;
    }

    public void setMunicion(String municion) {
        this.municion = municion;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public boolean isRehala() {
        return rehala;
    }

    public void setRehala(boolean rehala) {
        this.rehala = rehala;
    }
    
}
