package com.juego.razas;

// Clase que representa la raza Elfo e implementa la interfaz Raza
public class Elfo implements Raza {

    // Devuelve el nombre de la raza
    public String getNombre(){
        return "Elfo";
    }

    // Retorna el valor de fuerza base de la raza
    public int f(){
        return 4;
    }

    // Retorna el valor de inteligencia base de la raza
    public int i(){
        return 6;
    }

    // Retorna el valor de destreza base de la raza
    public int d(){
        return 7;
    }

    // Retorna la vida base de la raza
    public int vida(){
        return 90;
    }
}
