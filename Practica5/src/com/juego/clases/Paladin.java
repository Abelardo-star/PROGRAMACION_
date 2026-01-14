package com.juego.clases;

import com.juego.habilidades.*;

// Clase que representa la clase Paladín
public class Paladin implements Clase {

    // Devuelve el nombre de la clase
    public String getNombre(){
        return "Paladin";
    }

    // Bonus de fuerza que otorga la clase
    public int f(){
        return 2;
    }

    // Bonus de inteligencia que otorga la clase
    public int i(){
        return 1;
    }

    // Bonus de destreza que otorga la clase
    public int d(){
        return 0;
    }

    // Vida base que otorga la clase
    public int vida(){
        return 115;
    }

    // Devuelve las habilidades que posee la clase Paladín
    public Habilidad[] getHabilidades(){
        return new Habilidad[]{
                new DanioCuerpo("Excalibur", 18),   // Daño cuerpo a cuerpo
                new CuraCuerpo("Luz Divina", 15),        // Habilidad de curación
                new DanioDistancia("Juicio Celestial", 10) // Daño a distancia
        };
    }
}
