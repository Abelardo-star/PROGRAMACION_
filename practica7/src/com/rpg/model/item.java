package com.rpg.model;

import java.util.ArrayList;
import java.util.List;

public class item {
    private String id;
    private String nombre;
    private String tipo;
    private Integer valor;
    private List<item> equipo;
    private int peso;

    public item(String id , String nombre , String tipo ,Integer valor,int peso){
        this.id=id;
        this.nombre=nombre;
        this.tipo=tipo;
        this.valor=valor;
        this.peso=peso;
    }
    //GET

    public String getNombre() {
        return nombre;
    }

    public Integer getValor() {
        return valor;
    }

    public String getId() {
        return id;
    }

    public int getPeso() {
        return peso;
    }

    public String getTipo() {
        return tipo;
    }

    //por si el objeto no existe
    public List<item> getEquipo(){
        if (equipo == null) {
            equipo = new ArrayList<>();
        }
        return equipo;
    }
    //SET

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setEquipo(List<item> equipo) {
        this.equipo = equipo;
    }

}
