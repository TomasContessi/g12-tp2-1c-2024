package com;

public class MultiplicadorX2 implements Multiplicador{
    @Override
    public int multiplicar(int puntaje){
        return puntaje * 2;
    }
}