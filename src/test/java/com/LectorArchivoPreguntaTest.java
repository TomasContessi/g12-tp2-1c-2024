package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.Modelo.LectorArchivoPregunta;
import com.Modelo.Pregunta;
import com.Modelo.PreguntaFactory;
import com.Modelo.PreguntaVerdaderoFalsoFactory;
import com.Modelo.Respuesta;

public class LectorArchivoPreguntaTest {

    @Test
    public void test01SetearCorrectamenteElEnunciadoAUnaPregunta() {
        // int ID = 2;
        // String filePath = System.getProperty("user.dir") + File.separator + "preguntas.json";

        // LectorArchivoPregunta lector = new LectorArchivoPregunta();
        // lector.leerAtributos(ID, filePath);

        // Respuesta respuestaCorrecta = new Respuesta(lector.opcionesCorrectas());

        // PreguntaFactory preguntaFactory;
        // if(lector.tipoPregunta().equals("Verdadero Falso Simple")) {
        //     preguntaFactory = new PreguntaVerdaderoFalsoFactory();
        // }
        // else preguntaFactory = null;
        // Pregunta pregunta = preguntaFactory.crearPregunta(respuestaCorrecta);

        // // Pregunta pregunta = new Pregunta();
        // pregunta.setEnunciado(lector.enunciadoPregunta());

        // assertEquals(lector.enunciadoPregunta(), pregunta.getEnunciado());
    }

    // @Test
    // public void test02SetearCorrectamenteLaRespuestaCorrecta() {
    //     int ID = 3;
    //     String filePath = System.getProperty("user.dir") + File.separator + "preguntas.json";

    //     LectorArchivoPregunta lector = new LectorArchivoPregunta();
    //     lector.leerAtributos(ID, filePath);

    //     ArrayList<Integer> opcionesRespondidas;
    //     Respuesta respuestaCorrecta = new RespuestaMultipleChoise(opcionesRespondidas);
    // }
}
