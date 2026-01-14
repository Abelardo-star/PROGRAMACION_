package com.juego.clases;
import com.juego.habilidades.*;

public class Monje implements Clase{

    public String getNombre(){return "Monje";}

    public int f(){
        return 2;
    }
    public int i(){
        return 0;
    }
    public int d(){
        return 1;
    }
    public int vida(){
        return 110;
    }

    public Habilidad[] getHabilidades(){
        return new Habilidad[]{
                new DanioCuerpo("Puño del Dragón",17),
                new CuraCuerpo("Meditación",8),
                new DanioDistancia("Onda de Chi",18)
        };
    }
}
