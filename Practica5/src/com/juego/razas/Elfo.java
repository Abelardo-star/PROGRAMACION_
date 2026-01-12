package com.juego.razas;
import com.juego.modelo.Stats;

public class Elfo implements Raza{
    public String getNombre(){
        return "Elfo";
    }
    public Stats getStatsBase(){
        return new Stats(4,6,7,90);
    }
}
