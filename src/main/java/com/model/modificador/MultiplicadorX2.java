package com.model.modificador;

public class MultiplicadorX2 implements Multiplicador{
    @Override
    public Puntaje multiplicar(Puntaje puntaje){
            return puntaje.multiplicarseCon(new Puntaje(2));
        }
    }
