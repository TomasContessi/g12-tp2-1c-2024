package com.model.pregunta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.model.loader.JsonLoader;

public class DiccionarioPreguntas {
    Map<String, ArrayList<Pregunta>> preguntasGuardadas;
    RecorridoPreguntas recorrido;
    JsonLoader jsonLoader;

    public DiccionarioPreguntas(JsonLoader jsonLoader) {
        this.preguntasGuardadas = new HashMap<>();
        this.jsonLoader = jsonLoader;
    }

    public void asignarPreguntasPorTema(String filePath) {
        for (int i = 0; i < jsonLoader.totalPreguntas(); i++) {
            Pregunta pregunta = jsonLoader.loadPregunta(i, filePath);
            String temaPregunta = pregunta.getTema();

            preguntasGuardadas.putIfAbsent(temaPregunta, new ArrayList<>());
            preguntasGuardadas.get(temaPregunta).add(pregunta);
        }
        recorrido = new RecorridoPreguntas(preguntasGuardadas);
    }

    public Pregunta getPregunta() {
        return recorrido.obtenerPregunta();
    }

    public Map<String, ArrayList<Pregunta>> getPreguntasGuardadas() {
        return preguntasGuardadas;
    }

//    public ArrayList<Pregunta> obtenerTema(String tema) {
//        return preguntasGuardadas.get(tema);
//    }
//
//    public Pregunta obtenerPregunta(String tema, int numeroDePregunta) {
//
//        ArrayList<Pregunta> preguntasDelTema = this.obtenerTema(tema);
//
//        Pregunta pregunta = preguntasDelTema.get(numeroDePregunta);
//        preguntasDelTema.remove(numeroDePregunta);
//
//        if (this.obtenerTema(tema).size() == 0){
//            this.preguntasGuardadas.remove(tema);
//        }
//
//        return pregunta;
//    }
//
//    public Pregunta obtenerPregunta(String tema) {
//        Random rand = new Random();
//        int numeroDePreguntas = this.obtenerTema(tema).size();
//        int numeroRandom = rand.nextInt(numeroDePreguntas);
//        Pregunta pregunta = this.obtenerPregunta(tema, numeroRandom);
//
//        return pregunta;
//    }
//
//    public ArrayList<String> obtenerTemas() {
//        ArrayList<String> temas = new ArrayList<String>();
//        temas.addAll(this.preguntasGuardadas.keySet());
//
//        return temas;
//    }
}


