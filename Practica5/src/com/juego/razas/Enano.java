package com.juego.razas;

// Clase que representa la raza Enano e implementa la interfaz Raza
public class Enano implements Raza{

    // Devuelve el nombre de la raza
    public String getNombre(){
        return "Enano";
    }

    // Retorna el valor de fuerza base de la raza
    public int f(){
        return 7;
    }
    // Retorna el valor de la inteligencia base de la raza
    public int i() {
        return 4;
    }
    // Retorna el valor de la destreza base de la raza
    public int d(){
        return 4;
    }
    // Retorna la vida base de la raza
    public int vida(){
        return 110;
    }
}
