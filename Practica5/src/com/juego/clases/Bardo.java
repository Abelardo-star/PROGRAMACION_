package com.juego.clases;

import com.juego.habilidades.*;

// Clase que representa la clase Bardo
public class Bardo implements Clase {

    // Devuelve el nombre de la clase
    public String getNombre(){
        return "Bardo";
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

    // Devuelve las habilidades que posee la clase
    public Habilidad[] getHabilidades(){
        return new Habilidad[]{
                new DanioCuerpo("Palmada Sonora", 10),   // Daño cuerpo a cuerpo
                new CuraCuerpo("Armonía Restauradora", 14), // Habilidad de curación
                new DanioDistancia("Acorde Penetrante", 18)    // Daño a distancia
        };
    }
}
