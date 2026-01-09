package Raza;

import java.util.Arrays;
import java.util.List;

public class Raza {

    private String nombre;
    private int fuerza, inteligencia, destreza, vida;
    private String especialidad;

    //CONSTRUCTOR
    public Raza(String nombre, int fuerza, int inteligencia, int destreza, int vida, String especialidad) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.destreza = destreza;
        this.vida = vida;
        this.especialidad = especialidad;
    }

    // Getters
    public String getNombre() { return nombre; }
    public int getFuerza() { return fuerza; }
    public int getInteligencia() { return inteligencia; }
    public int getDestreza() { return destreza; }
    public int getVida() { return vida; }
    public String getEspecialidad() { return especialidad; }

    // Razas predefinidas para el juego
    public static final Raza HUMANO = new Raza("Humano", 5, 5, 5, 100, "Equilibrado");
    public static final Raza ELFO = new Raza("Elfo", 4, 6, 7, 90, "Agilidad");
    public static final Raza ENANO = new Raza("Enano", 7, 4, 4, 110, "Resistencia");

    // Usa la lista de los tipos de las Razas para poder crear el personaje
    public static final List<Raza> RAZAS = Arrays.asList(HUMANO, ELFO, ENANO);
}
