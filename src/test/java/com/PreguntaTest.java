package com;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PreguntaTest {
    @Test
    public void test01PreguntaVerdaderoFalso() {

        // arrange
        ArrayList<String> respuestas = new ArrayList<String>();
        ArrayList<String> respuestasCorrectas = new ArrayList<String>();

        respuestas.add("V");

        respuestasCorrectas.add("V");

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
        ArrayList<String> respuestas = new ArrayList<String>();

        ArrayList<String> respuestasCorrectas = new ArrayList<String>();

        respuestas.add("F");

        respuestasCorrectas.add("V");

        int resultadoObtenido;
        int resultadoEsperado = 0;

        Pregunta preguntaVerdaderoFalso = new Pregunta(respuestasCorrectas);

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

        Pregunta preguntaVerdaderoFalso = new Pregunta(respuestasCorrectas);

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

        Pregunta preguntaVerdaderoFalso = new Pregunta(respuestasCorrectas);

        // act
        resultadoObtenido = preguntaVerdaderoFalso.verificarRespuesta(respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);

    }
}
