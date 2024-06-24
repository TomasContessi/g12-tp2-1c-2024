package com;

import java.util.ArrayList;
import java.util.Random;

//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
public class Juego {
    private ArrayList<Jugador> jugadores;
    private String preguntasPath;
    private DiccionarioPreguntas diccionarioPreguntas;
    private String ultimaTematica;
    private Pregunta preguntaTurno;

//----------------------------------------------------------------------------------------------------------------------------------------------

    public void cargarPregunta(){
    }

//----------------------------------------------------------------------------------------------------------------------------------------------

    public void agregarJugador(Jugador jugador){
        this.jugadores.add(jugador);
    }

//----------------------------------------------------------------------------------------------------------------------------------------------

    public void setPath(String preguntasPath){
    this.preguntasPath = preguntasPath;
}    
//----------------------------------------------------------------------------------------------------------------------------------------------

    public void cargarPreguntas(DiccionarioPreguntas diccionarioPreguntas){
        this.diccionarioPreguntas = diccionarioPreguntas;
        this.diccionarioPreguntas.asignarPreguntasPorTema(this.preguntasPath);
    }
}
