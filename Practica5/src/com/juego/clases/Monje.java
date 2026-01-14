package com.juego.clases;

import com.juego.habilidades.*;

// Clase que representa la clase Monje
public class Monje implements Clase {

    // Devuelve el nombre de la clase
    public String getNombre(){
        return "Monje";
    }

    // Bonus de fuerza que otorga la clase
    public int f(){
        return 2;
    }

    // Bonus de inteligencia que otorga la clase
    public int i(){
        return 0;
    }

    // Bonus de destreza que otorga la clase
    public int d(){
        return 1;
    }

    // Vida base que otorga la clase
    public int vida(){
        return 110;
    }

    // Devuelve las habilidades que posee la clase Monje
    public Habilidad[] getHabilidades(){
        return new Habilidad[]{
                new DanioCuerpo("Puño del Dragón", 17),   // Daño cuerpo a cuerpo
                new CuraCuerpo("Karma inverso", 8),           // Habilidad de curación
                new DanioDistancia("Onda de Chi", 18)      // Daño a distancia
        };
    }
}
