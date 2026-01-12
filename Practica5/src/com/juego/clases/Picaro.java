package com.juego.clases;
import com.juego.habilidades.*;

public class Picaro implements Clase{

    public String getNombre(){return "Picaro";}

    public int f(){
        return 0;
    }
    public int i(){
        return 0;
    }
    public int d(){
        return 3;
    }
    public int vida(){
        return 105;
    }

    public Habilidad[] getHabilidades(){
        return new Habilidad[]{
                new DanioCuerpo(22),   // Puñalada
                new CuraCuerpo(6),    // Vendaje rápido
                new DanioDistancia(20) // Cuchillo arrojadizo
        };
    }
}
