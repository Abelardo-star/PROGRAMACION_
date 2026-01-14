package com.juego.clases;

import com.juego.habilidades.*;

// Clase que representa la clase Guerrero
public class Guerrero implements Clase {

    // Devuelve el nombre de la clase
    public String getNombre() {
        return "Guerrero";
    }

    // Bonus de fuerza que otorga la clase
    public int f() {
        return 3;
    }

    // Bonus de inteligencia que otorga la clase
    public int i() {
        return 0;
    }

    // Bonus de destreza que otorga la clase
    public int d() {
        return 0;
    }

    // Vida base que otorga la clase
    public int vida() {
        return 120;
    }

    // Devuelve las habilidades que posee la clase Guerrero
    public Habilidad[] getHabilidades() {
        return new Habilidad[]{
                new DanioCuerpo("Embate del Coloso", 25),       // Daño cuerpo a cuerpo
                new CuraCuerpo("Grito de Guerra", 5),      // Habilidad de curación pequeña
                new DanioDistancia("Rompefilas", 10) // Daño a distancia
        };
    }
}
