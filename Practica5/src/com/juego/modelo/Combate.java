package com.juego.modelo;

import java.util.*;
import com.juego.habilidades.*;

public class Combate {

    Scanner sc=new Scanner(System.in);

    public void iniciar(Personaje a,Personaje b){

        Personaje t=a, r=b;

        while(a.getVida()>0 && b.getVida()>0){

            System.out.println("\nTurno: "+t.getNombre());

            int i=1;
            for(Habilidad h:t.getHabilidades())
                System.out.println(i+++". "+h.getNombre());

            int op=sc.nextInt()-1;
            Habilidad h=t.getHabilidades().get(op);

            if(!h.tieneUsos()){
                System.out.println("Sin usos!");
                continue;
            }

            int v=h.usar();

            if(h.getNombre().contains("Cura")){
                t.curar(v);
                System.out.println("Se cura "+v);
            }else{
                r.danio(v);
                System.out.println("Hace "+v+" daño");
            }

            //VIDA FORMATO ACTUAL
            System.out.println(
                    a.getNombre()+": "+
                            a.getVida());

            System.out.println(
                    b.getNombre()+": "+
                            b.getVida());

            Personaje aux=t; t=r; r=aux;
        }

        System.out.println("\nGANADOR: "+
                (a.getVida()>0?a.getNombre():b.getNombre()));
    }
}
