package com.rpg.model;


public class cuidades {
    private String nombre;
    private Integer poblacion;
    private String clima;
    private Integer riesgo;

    public cuidades(String nombre, String clima, Integer poblacion, Integer riesgo){

        this.clima=clima;
        this.nombre=nombre;
        this.poblacion=poblacion;
        this.riesgo=riesgo;
    }
    //GET
    public String getNombre() {
        return nombre;
    }

    public Integer getPoblacion() {
        return poblacion;
    }

    public String getClima() {
        return clima;
    }

    public Integer getRiesgo() {
        return riesgo;
    }

    //SET

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public void setPoblacion(Integer poblacion) {
        this.poblacion = poblacion;
    }

    public void setRiesgo(Integer riesgo) {
        this.riesgo = riesgo;
    }
}
