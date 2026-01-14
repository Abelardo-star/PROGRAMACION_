package com.juego.clases;

import com.juego.habilidades.*;

public class Mago implements Clase{

    public String getNombre(){
        return "Mago";
    }

    public int f(){
        return 0;
    }
    public int i(){
        return 3;
    }
    public int d(){
        return 0;
    }
    public int vida(){
        return 90;
    }

    public Habilidad[] getHabilidades(){
        return new Habilidad[]{
                new DanioCuerpo("Bastón Arcano",5),
                new CuraCuerpo("Escudo Mágico",5),
                new DanioDistancia("Fireball",40)
        };
    }
}
