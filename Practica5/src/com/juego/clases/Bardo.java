package com.juego.clases;
import com.juego.habilidades.*;

public class Bardo implements Clase{

    public String getNombre(){return "Bardo";}

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
                new DanioCuerpo(10),   // Golpe rítmico
                new CuraCuerpo(14),   // Canción curativa
                new DanioDistancia(18) // Nota estridente
        };
    }
}
