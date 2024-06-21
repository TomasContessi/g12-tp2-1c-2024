package com;

import java.util.ArrayList;
import java.util.Random;
public class Juego {
    private ArrayList<Jugador> jugadores;
    private String preguntasPath;
    private DiccionarioPreguntas diccionarioPreguntas;
    private String ultimaTematica;

    public void cargarPregunta(){
        Random random = new Random();
        int id = random.nextInt(24);
    }
}
