package com.juego.presentacion;

import com.juego.modelo.*;
import com.juego.razas.*;
import com.juego.clases.*;

public class Presentador {

    private Vista vista;
    private GestorPersonajes gestor;

    public Presentador(Vista v, GestorPersonajes g){
        vista=v; gestor=g;
    }

    public void iniciar(){

        int op;
        do{
            vista.menu();
            op = vista.leer();

            switch(op){
                case 1 -> jugar();
                case 2 -> crear();
            }

        }while(op != 3);
    }

    private void jugar(){

        vista.listar(gestor.get());

        int a = vista.pedir("Jugador 1: ");
        int b = vista.pedir("Jugador 2: ");

        new Combate().iniciar(
                gestor.get().get(a),
                gestor.get().get(b));
    }

    // ----------- CREAR PERSONAJE ----------
    private void crear(){

        vista.mensaje("\nNombre:");
        String nombre = vista.leerTexto();

        Raza raza = elegirRaza();
        Clase clase = elegirClase();

        gestor.add(new Personaje(nombre,raza,clase));

        vista.mensaje("✔ Personaje creado");
    }

    private Raza elegirRaza(){

        vista.mensaje("\nRazas:");
        vista.mensaje("1.Humano\n2.Elfo\n3.Enano");

        return switch(vista.leer()){
            case 1 -> new Humano();
            case 2 -> new Elfo();
            default -> new Enano();
        };
    }

    private Clase elegirClase(){

        vista.mensaje("\nClases:");
        vista.mensaje("""
        1.Guerrero
        2.Paladin
        3.Monje
        4.Picaro
        5.Druida
        6.Sacerdote
        7.Mago
        8.Bardo""");

        return switch(vista.leer()){
            case 1 -> new Guerrero();
            case 2 -> new Paladin();
            case 3 -> new Monje();
            case 4 -> new Picaro();
            case 5 -> new Druida();
            case 6 -> new Sacerdote();
            case 7 -> new Mago();
            default -> new Bardo();
        };
    }
}
