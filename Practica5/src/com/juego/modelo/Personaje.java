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
        stats=new Stats(r.f(),r.i(),r.d(),r.vida());
        stats.bonus(c.f(),c.i(),c.d());

        vida=c.vida();
        habilidades=List.of(c.getHabilidades());
    }

    public String getNombre(){
        return nombre;
    }
    public int getVida(){
        return vida;
    }

    public List<Habilidad> getHabilidades(){
        return habilidades;
    }

    public void danio(int v){
        vida-=v; if(vida<0) vida=0;
    }
    public void curar(int v){
        vida+=v; if(vida>stats.getVidaMax()) vida=stats.getVidaMax();
    }

    public String toString(){
        return nombre+" HP:"+vida;
    }
}
