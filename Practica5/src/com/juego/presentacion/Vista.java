package com.juego.presentacion;

import java.util.*;
import com.juego.modelo.Personaje;

public class Vista {

    private Scanner sc = new Scanner(System.in);

    public void menu(){
        System.out.println("\n1. Combatir");
        System.out.println("2. Crear personaje");
        System.out.println("3. Salir");
    }

    public int leer(){
        return sc.nextInt();
    }

    public String leerTexto(){
        return sc.next();
    }

    public void listar(List<Personaje> lista){
        int i=1;
        for(Personaje p:lista)
            System.out.println(i+++". "+p);
    }

    public int pedir(String msg){
        System.out.print(msg);
        return sc.nextInt()-1;
    }

    public void mensaje(String m){
        System.out.println(m);
    }
}
