package com;

public class MultiplicadorX3 implements Multiplicador{
    @Override
    public int multiplicar(int puntaje){
        return puntaje * 3;
    }
}