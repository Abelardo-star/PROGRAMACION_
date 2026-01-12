package com.juego.modelo;

import java.util.*;

public class GestorPersonajes {

    private List<Personaje> lista=new ArrayList<>();

    public void add(Personaje p){
        lista.add(p);
    }

    public List<Personaje> get(){
        return lista;
    }
}
