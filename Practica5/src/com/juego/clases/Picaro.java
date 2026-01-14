package com.juego.clases;

import com.juego.habilidades.*;

// Clase que representa la clase Pícaro
public class Picaro implements Clase {

    // Devuelve el nombre de la clase
    public String getNombre(){
        return "Picaro";
    }

    // Bonus de fuerza que otorga la clase
    public int f(){
        return 0;
    }

    // Bonus de inteligencia que otorga la clase
    public int i(){
        return 0;
    }

    // Bonus de destreza que otorga la clase
    public int d(){
        return 3;
    }

    // Vida base que otorga la clase
    public int vida(){
        return 105;
    }

    // Devuelve las habilidades que posee la clase Pícaro
    public Habilidad[] getHabilidades(){
        return new Habilidad[]{
                new DanioCuerpo("Filo de la Medianoche", 22),       // Daño cuerpo a cuerpo
                new CuraCuerpo("Aliento del Ladrón", 6),   // Habilidad de curación pequeña
                new DanioDistancia("Aguijón Sombrío", 20) // Daño a distancia
        };
    }
}
