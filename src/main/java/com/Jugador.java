package com;

import java.util.ArrayList;

public class Jugador {
    private String name;
    private int puntos;
    private ArrayList<Multiplicador> multiplicadores;
    //private Anulador anulador;
    //private Exclusividad exclusividad;

    Jugador(String nombre){
        this.name = nombre;
    }

    public ArrayList<Opcion> responderPregunta(Pregunta pregunta){
        ArrayList<Opcion> respuesta = new ArrayList<Opcion>();
        pregunta.setMultiplicador(multiplicadores.get(0));
        return respuesta;
    }

    public void asignarPuntos(int puntos){
        this.puntos += puntos;
    }

    public int getPuntos(){
        return this.puntos;
    }

    public String getNombre(){
        return this.name;
    }
}
