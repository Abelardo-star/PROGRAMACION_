package com.juego.modelo;

import java.util.*;
import com.juego.razas.*;
import com.juego.clases.*;
import com.juego.habilidades.*;

public class Personaje {

    private String nombre;
    private Stats stats;
    private int vida;
    private List<Habilidad> habilidades;

    public Personaje(String n,Raza r,Clase c){

        nombre=n;
        stats=r.getStatsBase();
        stats.sumar(c.f(),c.i(),c.d());
        stats.vidaMax=c.vida();
        vida=stats.vidaMax;

        habilidades=List.of(c.getHabilidades());
    }

    public void danio(int d){
        vida-=d; if(vida<0) vida=0;
    }

    public void curar(int c){
        vida+=c;
        if(vida>stats.vidaMax) vida=stats.vidaMax;
    }

    public int getVida(){
        return vida;
    }
    public String getNombre(){
        return nombre;
    }

    public List<Habilidad> getHabilidades(){
        return habilidades;
    }

    public String toString(){
        return nombre+" F:"+stats.f+ " I:"+stats.i+" D:"+stats.d+ " HP:"+vida+"/"+stats.vidaMax;
    }
}
