package com.Modelo;

public interface IJugador {
    public void responderPregunta(Pregunta pregunta, Respuesta respuesta);

    int getPuntaje();

    void calcularPuntaje(CalculoPuntaje puntaje);
}
