package com.model.modificador;

public class MultiplicadorX1 implements Multiplicador{
    @Override
    public int multiplicar(int puntaje){
        return puntaje;
    }
}
