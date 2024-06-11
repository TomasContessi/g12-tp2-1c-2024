package com;

import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
public class PreguntaTest {

    @Test
    public void test01PreguntaVerdaderoFalso() {
        Pregunta pregunta = new Pregunta(new Respuesta("v"));
        //CalculoPuntaje calculoPuntaje = new AumentarPuntajeSimple();
        ArrayList<String> respuestas = new ArrayList<String>();
        respuestas.add("v");

        IRespuesta respuestaMock = mock(IRespuesta.class);
        when(respuestaMock.getValor()).thenReturn("v");

        Jugador jugador = new Jugador("Juan");

        jugador.responderPregunta(pregunta, respuestaMock);

        assertEquals(1, jugador.getPuntaje());
    }

    // public void test02PreguntaVerdaderoFalso() {

    //     // arrange
    //     ArrayList<String> respuestas = new ArrayList<String>();

    //     ArrayList<String> respuestasCorrectas = new ArrayList<String>();

    //     respuestas.add("F");

    //     respuestasCorrectas.add("V");

    //     int resultadoObtenido;
    //     int resultadoEsperado = 0;

    //     Pregunta preguntaVerdaderoFalso = new Pregunta(respuestasCorrectas);

    //     // act
    //     resultadoObtenido = preguntaVerdaderoFalso.verificarRespuesta(respuestas);
    //     //assert
    //     assertEquals(resultadoEsperado, resultadoObtenido);
    // }

    // public void test03PreguntaMultipleChoiceAsignaPuntosCorrectamente() {

    //     // arrange
    //     ArrayList<String> respuestas = new ArrayList<String>();

    //     ArrayList<String> respuestasCorrectas = new ArrayList<String>();

    //     respuestas.add("V");
    //     respuestas.add("V");
    //     respuestas.add("V");
    //     respuestas.add("V");

    //     respuestasCorrectas.add("V");
    //     respuestasCorrectas.add("V");
    //     respuestasCorrectas.add("V");
    //     respuestasCorrectas.add("V");

    //     int resultadoObtenido;
    //     int resultadoEsperado = 4;

    //     Pregunta preguntaVerdaderoFalso = new Pregunta(respuestasCorrectas);

    //     // act
    //     resultadoObtenido = preguntaVerdaderoFalso.verificarRespuesta(respuestas);
    //     //assert
    //     assertEquals(resultadoEsperado, resultadoObtenido);

    // }

    // public void test04PreguntaMultipleChoiceAsignaPuntosCorrectamenteNoRespondeTodasBien() {

    //     // arrange
    //     ArrayList<String> respuestas = new ArrayList<String>();

    //     ArrayList<String> respuestasCorrectas = new ArrayList<String>();

    //     respuestas.add("V");
    //     respuestas.add("F");
    //     respuestas.add("F");
    //     respuestas.add("V");

    //     respuestasCorrectas.add("V");
    //     respuestasCorrectas.add("V");
    //     respuestasCorrectas.add("V");
    //     respuestasCorrectas.add("V");

    //     int resultadoObtenido;
    //     int resultadoEsperado = 2;

    //     Pregunta preguntaVerdaderoFalso = new Pregunta(respuestasCorrectas);

    //     // act
    //     resultadoObtenido = preguntaVerdaderoFalso.verificarRespuesta(respuestas);
    //     //assert
    //     assertEquals(resultadoEsperado, resultadoObtenido);

    // }
}

