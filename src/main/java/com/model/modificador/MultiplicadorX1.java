package com.model.modificador;

public class MultiplicadorX1 implements Multiplicador{
    @Override
    public Puntaje multiplicar(Puntaje puntaje){
        return puntaje;
    }
}
