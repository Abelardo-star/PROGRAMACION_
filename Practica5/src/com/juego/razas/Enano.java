package com.juego.razas;
import com.juego.modelo.Stats;

public class Enano implements Raza{
    public String getNombre(){
        return "Enano";
    }
    public Stats getStatsBase(){
        return new Stats(7,4,4,110);
    }
}
