package com.juego.habilidades;

public class CuraCuerpo implements Habilidad {

    private int usos = 3;
    private int valor;

    public CuraCuerpo(int valor){
        this.valor = valor;
    }

    public String getNombre(){
        return "Cura cuerpo a cuerpo ("+usos+" usos)";
    }

    public int usar(){
        usos--;
        return valor;
    }

    public boolean tieneUsos(){
        return usos > 0;
    }
}
