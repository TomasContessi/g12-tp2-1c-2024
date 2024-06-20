package com.Modelo;

public class AumentarPuntajeSimple implements CalculoPuntaje { 
    @Override
    public void calcularPuntaje(Jugador jugador) {
        jugador.setPuntaje(jugador.getPuntaje() + 1);
    }
}
