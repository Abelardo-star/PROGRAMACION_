package com.juego.habilidades;

public abstract class HabilidadBase implements Habilidad {

    protected String nombre;
    protected int valor;
    protected int usos;

    public HabilidadBase(String n,int v,int u){
        nombre=n; valor=v; usos=u;
    }

    public String getNombre(){
        return nombre+" ("+usos+" usos)";
    }

    public int usar(){
        if(usos>0){
            usos--;
            return valor;
        }
        return 0;
    }

    public boolean tieneUsos(){
        return usos>0;
    }
}
