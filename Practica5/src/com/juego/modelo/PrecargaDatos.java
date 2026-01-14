package com.juego.modelo;

import com.juego.razas.*;
import com.juego.clases.*;

public class PrecargaDatos {

    public static void cargar(GestorPersonajes g){

        g.add(new Personaje("Arthas",new Humano(),new Guerrero()));
        g.add(new Personaje("Uther",new Enano(),new Paladin()));
        g.add(new Personaje("Li",new Humano(),new Monje()));
        g.add(new Personaje("Shade",new Elfo(),new Picaro()));
        g.add(new Personaje("Oak",new Elfo(),new Druida()));
        g.add(new Personaje("Faith",new Humano(),new Sacerdote()));
        g.add(new Personaje("Merlin",new Elfo(),new Mago()));
        g.add(new Personaje("Lyra",new Humano(),new Bardo()));
    }
}
