package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DiccionarioPreguntas {
    Map<String, ArrayList<Pregunta>> preguntasGuardadas = new HashMap<>();

    public void asignarPreguntasPorTema(String filePath) {
        JsonLoader nuevoLector = new JsonLoader(filePath);

        for (int i = 0; i < nuevoLector.totalPreguntas(); i++) {

            Pregunta pregunta = nuevoLector.loadPregunta(i, filePath);
            String temaPregunta = pregunta.getTema();

            preguntasGuardadas.putIfAbsent(temaPregunta, new ArrayList<>());
            preguntasGuardadas.get(temaPregunta).add(pregunta);
        }
    }

    public ArrayList<Pregunta> obtenerTema(String tema) {
        return preguntasGuardadas.get(tema);
    }

    public Pregunta obtenerPregunta(String tema, int numeroDePregunta) {

        ArrayList<Pregunta> preguntasDelTema = this.obtenerTema(tema);

        Pregunta pregunta = preguntasDelTema.get(numeroDePregunta);
        preguntasDelTema.remove(numeroDePregunta);

        return pregunta;
    }

    public Pregunta obtenerPregunta(String tema) {
        Random rand = new Random();
        int numeroDePreguntas = this.obtenerTema(tema).size();
        int numeroRandom = rand.nextInt(numeroDePreguntas) + 1;
        Pregunta pregunta = this.obtenerPregunta(tema, numeroRandom);

        return pregunta;
    }
}


