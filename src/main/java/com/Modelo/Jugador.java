package com.Modelo;

public class Jugador implements IJugador{
    private final String nombre;
    private int puntaje;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntaje = 0;
    }

    @Override
    public void responderPregunta(Pregunta pregunta, Respuesta respuesta) {
        pregunta.verificarRespuesta(respuesta, this);
    }

    @Override
    public int getPuntaje() {
        return this.puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public void calcularPuntaje(CalculoPuntaje calculoPuntaje) {
        calculoPuntaje.calcularPuntaje(this);
    }

}
