package com.juego.clases;

import com.juego.habilidades.*;

public class Druida implements Clase{

    public String getNombre(){return "Druida";}

    public int f(){
        return 2;
    }
    public int i(){
        return 1;
    }
    public int d(){
        return 0;
    }
    public int vida(){
        return 100;
    }

    public Habilidad[] getHabilidades(){
        return new Habilidad[]{
                new DanioCuerpo("Garra Salvaje",10),
                new CuraCuerpo("Recrecimiento",20),
                new DanioDistancia("Raíces Enredadoras",15)
        };
    }
}
