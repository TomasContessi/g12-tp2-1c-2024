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

        int respuestasAcertadas = 0;

        ArrayList<Opcion<String>>opcionesCorrectas = new ArrayList<Opcion<String>>();

        Opcion<String> opcion = new OpcionTipoString("V");

        opcionesCorrectas.add(opcion);

        opcion = new OpcionTipoString("F");

        opcionesCorrectas.add(opcion);

        Respuesta respuesta = new Respuesta(opcionesCorrectas);

        ArrayList<Opcion<String>>opciones = new ArrayList<Opcion<String>>();

        Opcion<String> opcion2 = new OpcionTipoString("V");

        opciones.add(opcion2);

        opcion2 = new OpcionTipoString("F");

        opciones.add(opcion2);

        Respuesta respuesta2 = new Respuesta(opcionesCorrectas);

        respuestasAcertadas = respuesta.aciertosObtenidos(respuesta2);

        /*
        //CalculoPuntaje calculoPuntaje = new AumentarPuntajeSimple();
        ArrayList<String> respuestas = new ArrayList<String>();
        respuestas.add("v");

        IRespuesta respuestaMock = mock(IRespuesta.class);
        when(respuestaMock.getValor()).thenReturn("v");

        Jugador jugador = new Jugador("Juan");

        jugador.responderPregunta(pregunta, respuestaMock);
        */
        assertEquals(2, respuesta.aciertosObtenidos(respuesta2));
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

