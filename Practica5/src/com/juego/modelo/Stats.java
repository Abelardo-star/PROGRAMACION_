package com.juego.modelo;

public class Stats {
    public int f,i,d,vidaMax;

    public Stats(int f,int i,int d,int v){
        this.f=f; this.i=i; this.d=d; vidaMax=v;
    }

    public void sumar(int f,int i,int d){
        this.f+=f; this.i+=i; this.d+=d;
    }
}
