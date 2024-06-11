package com;

public class AumentarPuntajeSimple implements CalculoPuntaje{
    @Override
    public int calcularPuntaje(Jugador jugador) {
        int puntaje = jugador.getPuntaje();
        puntaje++;
        return puntaje;
    }
}
