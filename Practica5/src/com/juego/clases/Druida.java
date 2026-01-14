package com.juego.clases;

import com.juego.habilidades.*;

// Clase que representa la clase Druida
public class Druida implements Clase {

    // Devuelve el nombre de la clase
    public String getNombre() {
        return "Druida";
    }

    // Bonus de fuerza que otorga la clase
    public int f() {
        return 2;
    }

    // Bonus de inteligencia que otorga la clase
    public int i() {
        return 1;
    }

    // Bonus de destreza que otorga la clase
    public int d() {
        return 0;
    }

    // Vida base que otorga la clase
    public int vida() {
        return 100;
    }

    // Devuelve las habilidades que posee la clase Druida
    public Habilidad[] getHabilidades() {
        return new Habilidad[]{
                new DanioCuerpo("Ira del Bosque", 10),       // Daño cuerpo a cuerpo
                new CuraCuerpo("Recrecimiento", 20),        // Habilidad de curación
                new DanioDistancia("Ráfaga de Espinas", 15) // Daño a distancia
        };
    }
}
