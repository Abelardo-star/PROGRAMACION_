package com.juego.clases;

import com.juego.habilidades.*;

// Clase que representa la clase Sacerdote
public class Sacerdote implements Clase {

    // Devuelve el nombre de la clase
    public String getNombre(){
        return "Sacerdote";
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
    public int vida() {
        return 95;
    }

    // Devuelve las habilidades que posee la clase Sacerdote
    public Habilidad[] getHabilidades(){
        return new Habilidad[]{
                new DanioCuerpo("Golpe Consagrado", 8),       // Daño cuerpo a cuerpo bajo
                new CuraCuerpo("Milagro del Renacer Eterno", 25),      // Curación alta
                new DanioDistancia("Llama Divina", 12)  // Daño a distancia
        };
    }
}
