package com;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class PreguntaConPenalidadTest {
    @Test
    public void test05PreguntaVerdaderoFalsoConPenalidadRespondeCorrectamente() {

        // arrange
        ArrayList<String> respuestas = new ArrayList<String>();

        ArrayList<String> respuestasCorrectas = new ArrayList<String>();

        respuestas.add("V");

        respuestasCorrectas.add("V");

        int resultadoObtenido;
        int resultadoEsperado = 1;

        Pregunta preguntaVerdaderoFalso = new PreguntaConPenalidad(respuestasCorrectas);

        // act
        resultadoObtenido = preguntaVerdaderoFalso.verificarRespuesta(respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    public void test06PreguntaVerdaderoFalsoConPenalidadRespondeInconrrectamente() {

        // arrange
        ArrayList<String> respuestas = new ArrayList<String>();

        ArrayList<String> respuestasCorrectas = new ArrayList<String>();

        respuestas.add("F");

        respuestasCorrectas.add("V");

        int resultadoObtenido;
        int resultadoEsperado = -1;

        Pregunta preguntaVerdaderoFalso = new PreguntaConPenalidad(respuestasCorrectas);

        // act
        resultadoObtenido = preguntaVerdaderoFalso.verificarRespuesta(respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    public void test07PreguntaMultipleChoiceAsignaPuntosCorrectamenteRespondeTodasBienConPenanilidad() {

        // arrange
        ArrayList<String> respuestas = new ArrayList<String>();

        ArrayList<String> respuestasCorrectas = new ArrayList<String>();

        respuestas.add("V");
        respuestas.add("V");
        respuestas.add("V");
        respuestas.add("V");

        respuestasCorrectas.add("V");
        respuestasCorrectas.add("V");
        respuestasCorrectas.add("V");
        respuestasCorrectas.add("V");

        int resultadoObtenido;
        int resultadoEsperado = 4;

        Pregunta preguntaVerdaderoFalso = new PreguntaConPenalidad(respuestasCorrectas);

        // act
        resultadoObtenido = preguntaVerdaderoFalso.verificarRespuesta(respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);

    }
    public void test08PreguntaMultipleChoiceAsignaPuntosCorrectamenteRespondeTodasMalConPenanilidad() {

        // arrange
        ArrayList<String> respuestas = new ArrayList<String>();

        ArrayList<String> respuestasCorrectas = new ArrayList<String>();

        respuestas.add("V");
        respuestas.add("V");
        respuestas.add("V");
        respuestas.add("V");

        respuestasCorrectas.add("F");
        respuestasCorrectas.add("F");
        respuestasCorrectas.add("F");
        respuestasCorrectas.add("F");

        int resultadoObtenido;
        int resultadoEsperado = -4;

        Pregunta preguntaVerdaderoFalso = new PreguntaConPenalidad(respuestasCorrectas);

        // act
        resultadoObtenido = preguntaVerdaderoFalso.verificarRespuesta(respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);

    }
}


