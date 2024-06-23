package com;

public class Exclusividad {

    public Exclusividad(){}

    int calcularExclusividad(int vecesActivadasEnEstaRonda,int jugadoresContestaronBien){
        if(jugadoresContestaronBien > 1){
            return 0;
        }

        return 2*vecesActivadasEnEstaRonda;
    }
}
