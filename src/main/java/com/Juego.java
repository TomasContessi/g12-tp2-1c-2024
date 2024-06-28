package com;

import java.util.ArrayList;
import java.util.Random;

//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Juego extends Application {
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private String preguntasPath;
    private DiccionarioPreguntas diccionarioPreguntas;
    private String ultimaTematica;

    public boolean cargarSiguientePregunta(){
        ArrayList<String> temasRestantes;
        ArrayList<String> temasPosibles;
        boolean aunQuedanPreguntas = true;
        Random rand = new Random();
        int numeroDeTemas;
        int numeroRandom;

        temasRestantes = this.diccionarioPreguntas.obtenerTemas();
        if (temasRestantes.size() == 0) {
            aunQuedanPreguntas = false;
            return aunQuedanPreguntas;
        }

        temasPosibles = this.diccionarioPreguntas.obtenerTemas();
        temasPosibles.remove(this.ultimaTematica);
        numeroDeTemas = temasPosibles.size();
        if (numeroDeTemas == 0) {
            this.preguntaTurno = this.diccionarioPreguntas.obtenerPregunta(ultimaTematica);
        }else{
            numeroRandom = rand.nextInt(numeroDeTemas);
            this.preguntaTurno = this.diccionarioPreguntas.obtenerPregunta(temasPosibles.get(numeroRandom));
        }

        this.ultimaTematica = this.preguntaTurno.getTema();
        return aunQuedanPreguntas;
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

    public void cargarDiccionarioPreguntas(DiccionarioPreguntas diccionarioPreguntas){
        this.diccionarioPreguntas = diccionarioPreguntas;
        this.diccionarioPreguntas.asignarPreguntasPorTema(this.preguntasPath);
        this.ultimaTematica = this.diccionarioPreguntas.obtenerTemas().getLast();
    }

//----------------------------------------------------------------------------------------------------------------------------------------------

    public boolean siguienteTurno(){
        boolean quedanTurnos = true;
        quedanTurnos = this.cargarSiguientePregunta();
        if (quedanTurnos) {
            for(int i = 0; i < this.jugadores.size(); i++){
                this.jugadores.get(i).responderPregunta(preguntaTurno);
            }
        }
        return quedanTurnos;
    }
}
