package com.Modelo;

public class MantenerPuntaje implements CalculoPuntaje { 
    @Override
    public void calcularPuntaje(Jugador jugador) {
        jugador.setPuntaje(jugador.getPuntaje());
    }
}
