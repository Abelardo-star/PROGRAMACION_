package com.juego.clases;
import com.juego.habilidades.*;

public class Paladin implements Clase{

    public String getNombre(){return "Paladin";}

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
        return 115;
    }

    public Habilidad[] getHabilidades(){
        return new Habilidad[]{
                new DanioCuerpo("Espada Sagrada",18),
                new CuraCuerpo("Luz Divina",15),
                new DanioDistancia("Juicio Celestial",10)
        };
    }
}
