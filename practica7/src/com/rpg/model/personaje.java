package com.rpg.model;

import java.util.ArrayList;
import java.util.List;

public class personaje {
    private String nombre;
    private String raza;
    private Integer nivel;
    private List<item> equipo;
    private int peso;
    private int fuerza;

    public personaje(String nombre, String raza, Integer nivel, int fuerza){
        this.nombre=nombre;
        this.nivel=nivel;
        this.raza=raza;
        this.fuerza=fuerza;
        this.equipo = new ArrayList<>();
    }
    //GET

    public String getNombre() {
        return nombre;
    }

    public Integer getNivel() {
        return nivel;
    }

    public String getRaza() {
        return raza;
    }

    public List<item> getEquipo() {
        return equipo;
    }

    public int getPeso() {
        return peso;
    }

    public int getFuerza() {
        return fuerza ;
    }
    //SET

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEquipo(List<item> equipo) {
        this.equipo = equipo;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
