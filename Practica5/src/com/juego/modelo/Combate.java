package com.juego.modelo;

import java.util.*;
import com.juego.habilidades.*;

public class Combate {

    private Scanner sc = new Scanner(System.in);

    public void iniciar(Personaje a, Personaje b) {

        Personaje t = a;
        Personaje r = b;

        while (a.getVida() > 0 && b.getVida() > 0) {

            System.out.println("\nTurno: " + t.getNombre());

            // Mostrar habilidades
            int i = 1;
            for (Habilidad h : t.getHabilidades()) {
                System.out.println(i++ + ". " + h.getNombre());
            }

            int op = sc.nextInt() - 1;
            if (op < 0 || op >= t.getHabilidades().size()) {
                System.out.println("Opción inválida, elige otra habilidad.");
                continue;
            }

            Habilidad h = t.getHabilidades().get(op);

            if (!h.tieneUsos()) {
                System.out.println("Sin usos! Elige otra habilidad.");
                continue; // Mantiene el turno hasta que elija una habilidad válida
            }

            int v = h.usar();

            // Aplicar efecto según el tipo de habilidad
            if (h instanceof CuraCuerpo) {
                t.curar(v);
                System.out.println(t.getNombre() + " se cura " + v + " HP");
            } else {
                r.danio(v);
                System.out.println(t.getNombre() + " hace " + v + " de daño a " + r.getNombre());
            }

            // Mostrar estado de ambos personajes
            System.out.println(a.getNombre() + ": " + a.getVida() + " HP");
            System.out.println(b.getNombre() + ": " + b.getVida() + " HP");

            // Cambiar turno
            Personaje aux = t;
            t = r;
            r = aux;
        }

        System.out.println("\nGANADOR: " + (a.getVida() > 0 ? a.getNombre() : b.getNombre()));
    }
}
