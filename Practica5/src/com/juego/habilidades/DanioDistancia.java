package com.juego.habilidades;

public class DanioDistancia implements Habilidad {

    private int usos = 1;
    private int valor;

    public DanioDistancia(int valor){
        this.valor = valor;
    }

    public String getNombre(){
        return "Daño a distancia ("+usos+" usos)";
    }

    public int usar(){
        usos--;
        return valor;
    }

    public boolean tieneUsos(){
        return usos > 0;
    }
}
