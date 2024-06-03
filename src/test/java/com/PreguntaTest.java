package com;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static java.lang.Boolean.TRUE;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PreguntaTest {

    @Test
    public void test01PreguntaVerdaderoFalso() {

        // arrange
        ArrayList<String> respuesta = new ArrayList<String>();
        ArrayList<String> respuestasCorrecta = new ArrayList<String>();

        respuesta.add("V");

        respuestasCorrecta.add("V");

        int resultadoObtenido;
        int resultadoEsperado = 1;

        Pregunta preguntaVerdaderoFalso = new Pregunta(respuestasCorrectas);

        // act
        resultadoObtenido = preguntaVerdaderoFalso.verificarRespuesta(respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    public void test02PreguntaVerdaderoFalso() {

        // arrange
        ArrayList<String> respuesta = new ArrayList<String>();

        ArrayList<String> respuestasCorrecta = new ArrayList<String>();

        respuesta.add("F");

        respuestasCorrecta.add("V");

        int resultadoObtenido;
        int resultadoEsperado = 0;

        Pregunta preguntaVerdaderoFalso = new Pregunta();

        // act
        resultadoObtenido = preguntaVerdaderoFalso.verificarRespuesta(respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    public void test03PreguntaMultipleChoiceAsignaPuntosCorrectamente() {

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

        Pregunta preguntaVerdaderoFalso = new Pregunta();

        // act
        resultadoObtenido = preguntaVerdaderoFalso.verificarRespuesta(respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

    public void test04PreguntaMultipleChoiceAsignaPuntosCorrectamenteNoRespondeTodasBien() {

        // arrange
        ArrayList<String> respuestas = new ArrayList<String>();

        ArrayList<String> respuestasCorrectas = new ArrayList<String>();

        respuestas.add("V");
        respuestas.add("F");
        respuestas.add("F");
        respuestas.add("V");

        respuestasCorrectas.add("V");
        respuestasCorrectas.add("V");
        respuestasCorrectas.add("V");
        respuestasCorrectas.add("V");

        int resultadoObtenido;
        int resultadoEsperado = 2;

        Pregunta preguntaVerdaderoFalso = new Pregunta();

        // act
        resultadoObtenido = preguntaVerdaderoFalso.verificarRespuesta(respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

    public void test05PreguntaVerdaderoFalsoConPenalidadRespondeCorrectamente() {

        // arrange
        ArrayList<String> respuesta = new ArrayList<String>();

        ArrayList<String> respuestasCorrecta = new ArrayList<String>();

        respuesta.add("V");

        respuestasCorrecta.add("V");

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
        ArrayList<String> respuesta = new ArrayList<String>();

        ArrayList<String> respuestasCorrecta = new ArrayList<String>();

        respuesta.add("F");

        respuestasCorrecta.add("V");

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
