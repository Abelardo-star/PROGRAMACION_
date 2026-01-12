package com.juego.razas;
import com.juego.modelo.Stats;

public class Humano implements Raza{
    public String getNombre(){
        return "Humano";
    }
    public Stats getStatsBase(){
        return new Stats(5,5,5,100);
    }
}
