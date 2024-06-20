package com.Modelo;

import java.io.File;

import com.Vista.VentanaJuego;

public class Juego {
    String filePath = System.getProperty("user.dir") + File.separator + "preguntas.json";

    public void iniciar(String[] args) {
        crearVentanaJuego(args);
    }

    public void crearVentanaJuego(String[] args) {
        VentanaJuego.juego(this);
        VentanaJuego.launch(VentanaJuego.class, args);
    }

    // public Pregunta pregunta() {
    //     LectorArchivoPregunta lector = new LectorArchivoPregunta();
    //     lector.leerAtributos(2, filePath);

    //     Respuesta respuestaCorrecta = new Respuesta(lector.opcionesCorrectas());

    //     PreguntaFactory preguntaFactory;
    //     preguntaFactory = new PreguntaVerdaderoFalsoFactory();
    //     Pregunta pregunta = preguntaFactory.crearPregunta(respuestaCorrecta);

    //     pregunta.setEnunciado(lector.enunciadoPregunta());

    //     return pregunta;
    // }
}
