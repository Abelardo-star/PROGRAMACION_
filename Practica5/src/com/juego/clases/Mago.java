package com.juego.clases;

import com.juego.habilidades.*;

// Clase que representa la clase Mago
public class Mago implements Clase {

    // Devuelve el nombre de la clase
    public String getNombre(){
        return "Mago";
    }

    // Bonus de fuerza que otorga la clase
    public int f(){
        return 0;
    }

    // Bonus de inteligencia que otorga la clase
    public int i(){
        return 3;
    }

    // Bonus de destreza que otorga la clase
    public int d(){
        return 0;
    }

    // Vida base que otorga la clase
    public int vida(){
        return 90;
    }

    // Devuelve las habilidades que posee la clase Mago
    public Habilidad[] getHabilidades(){
        return new Habilidad[]{
                new DanioCuerpo("Filo espiritual", 5),     // Daño cuerpo a cuerpo bajo
                new CuraCuerpo("Reescritura Vital", 5),      // Curación pequeña
                new DanioDistancia("Lanza de Hielo", 40)       // Daño a distancia alto
        };
    }
}
