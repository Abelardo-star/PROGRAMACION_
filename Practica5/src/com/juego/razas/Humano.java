package com.juego.razas;

// Clase que representa la raza Humano e implementa la interfaz Raza
public class Humano implements Raza{

    // Devuelve el nombre de la raza
    public String getNombre(){
        return "Humano";
    }
    // Retorna el valor de fuerza base de la raza
    public int f(){
        return 5;
    }
    // Retorna el valor de la inteligencia base de la raza
    public int i(){
        return 5;
    }
    // Retorna el valor de la destreza base de la raza
    public int d(){
        return 5;
    }
    // Retorna la vida base de la raza
    public int vida(){
        return 100;
    }
}
