package com.rpg.model;

import java.util.ArrayList;
import java.util.List;

public class personaje {
    private String nombre;
    private String raza;
    private Integer nivel;
    private List<item> equipo;

    public personaje(String nombre, String raza, Integer nivel){
        this.nombre=nombre;
        this.nivel=nivel;
        this.raza=raza;
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
}
