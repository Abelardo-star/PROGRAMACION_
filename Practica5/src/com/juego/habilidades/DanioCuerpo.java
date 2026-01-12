package com.juego.habilidades;

public class DanioCuerpo implements Habilidad {

    private int usos = 5;
    private int valor;

    public DanioCuerpo(int valor){
        this.valor = valor;
    }

    public String getNombre(){
        return "Daño cuerpo a cuerpo ("+usos+" usos)";
    }

    public int usar(){
        usos--;
        return valor;
    }

    public boolean tieneUsos(){
        return usos > 0;
    }
}
