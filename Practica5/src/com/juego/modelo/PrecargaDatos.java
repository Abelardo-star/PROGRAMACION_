
package com.juego.modelo;

import com.juego.razas.*;
import com.juego.clases.*;

// Clase para crear datos precargados de razas, clases y personajes
public class PrecargaDatos {

    // Carga inicial de personajes al juego
    public static void cargar(GestorPersonajes g) {

        g.add(new Personaje("Lulu", crearHumano(), crearGuerrero()));
        g.add(new Personaje("Vargan", crearEnano(), crearPaladin()));
        g.add(new Personaje("Merlin", crearElfo(), crearMago()));
    }

    // Métodos para crear razas con atributos iniciales
    public static Raza crearHumano() {
        return new Humano("Humano", 5, 5, 5, 100);
    }

    public static Raza crearElfo() {
        return new Elfo("Elfo", 4, 6, 7, 90);
    }

    public static Raza crearEnano() {
        return new Enano("Enano", 7, 4, 4, 110);
    }

    // Métodos para crear clases y asignar habilidades
    public static Clase crearGuerrero() {
        return new Guerrero("Corte Brutal", 25,
                "Grito de Guerra", 5,
                "Lanzamiento de hacha", 10);
    }

    public static Clase crearPaladin() {
        return new Paladin("Espada Sagrada", 18,
                "Luz Divina", 15,
                "Juicio Celestial", 10);
    }

    public static Clase crearMonje() {
        return new Monje("Puño del Dragón", 17,
                "Meditación", 8,
                "Onda Chi", 18);
    }

    public static Clase crearPicaro() {
        return new Picaro("Puñalada", 22,
                "Vendaje Rápido", 6,
                "Daga Arrojadiza", 20);
    }

    public static Clase crearDruida() {
        return new Druida("Garra Salvaje", 10,
                "Recrecimiento", 20,
                "Raíces Enredadoras", 15);
    }

    public static Clase crearSacerdote() {
        return new Sacerdote("Golpe Bendito", 8,
                "Sanación Mayor", 25,
                "Luz Castigadora", 12);
    }

    public static Clase crearMago() {
        return new Mago("Bastón Arcano", 5,
                "Escudo Mágico", 5,
                "Bola de Fuego", 40);
    }

    public static Clase crearBardo() {
        return new Bardo("Golpe Rítmico", 10,
                "Canción Curativa", 14,
                "Nota Letal", 18);
    }
}
