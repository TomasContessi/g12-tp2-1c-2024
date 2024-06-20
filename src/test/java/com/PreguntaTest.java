package com;

import org.junit.jupiter.api.Test;

import com.Modelo.Jugador;
import com.Modelo.Pregunta;
import com.Modelo.PreguntaFactory;
import com.Modelo.PreguntaSimple;
import com.Modelo.PreguntaVerdaderoFalsoFactory;
import com.Modelo.Respuesta;
import com.Modelo.RespuestaMultiple;
import com.Modelo.RespuestaVerdaderoFalso;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
public class PreguntaTest {

    @Test
    public void test01PreguntaVerdaderoFalsoSimpleRespondidaCorrectamente() {
        // ArrayList<Integer> opcionesCorrectas = new ArrayList<>();
        // opcionesCorrectas.add(1);
        Respuesta respuestaCorrecta = new RespuestaVerdaderoFalso(1);

        PreguntaFactory preguntaFactory;
        preguntaFactory = new PreguntaVerdaderoFalsoFactory();
        Pregunta pregunta = preguntaFactory.crearPregunta(respuestaCorrecta);


        // ArrayList<Integer> opcionesElegidas = new ArrayList<>();
        // opcionesElegidas.add(1);
        // Respuesta respuestaMock = mock(Respuesta.class);
        // when(respuestaMock.getOpciones()).thenReturn(opcionesElegidas);

        Respuesta respuestaJugador = new RespuestaVerdaderoFalso(1);

        Jugador jugador = new Jugador("Juan");

        jugador.responderPregunta(pregunta, respuestaJugador);

        assertEquals(1, jugador.getPuntaje());
    }

    // @Test
    // public void test02PreguntaVerdaderoFalsoSimpleRespondidaIncorrectamente() {
    //     Pregunta pregunta = new Pregunta(new RespuestaVerdaderoFalso("V"));
        
    //     Respuesta respuestaMock = mock(Respuesta.class);
    //     when(respuestaMock.getRespuesta()).thenReturn(new RespuestaVerdaderoFalso("F"));

    //     Jugador jugador = new Jugador("Juan");

    //     jugador.responderPregunta(pregunta, respuestaMock);

    //     assertEquals(0, jugador.getPuntaje());
    // }

    @Test
    public void test03PreguntaMultipleChoiseSimpleRespondidaCorrectamente() {
        ArrayList<Integer> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(2);
        opcionesCorrectas.add(5);
        Pregunta pregunta = new PreguntaSimple(new RespuestaMultiple(opcionesCorrectas));
        
        ArrayList<Integer> opcionesJugador = new ArrayList<>();
        //opcionesJugador.add(2);
        opcionesJugador.add(5);
        // Respuesta respuestaMock = mock(Respuesta.class);
        // when(respuestaMock.getRespuesta()).thenReturn(new RespuestaMultipleChoise(opcionesJugador));

       Respuesta respuestaJugador = new RespuestaMultiple(opcionesJugador);

        Jugador jugador = new Jugador("Juan");

        jugador.responderPregunta(pregunta, respuestaJugador);

        assertEquals(0, jugador.getPuntaje());
    }

    // @Test
    // public void test04PreguntaMultipleChoiseSimpleRespondidaIncorrectamente() {
    //     ArrayList<Integer> opcionesCorrectas = new ArrayList<>();
    //     opcionesCorrectas.add(2);
    //     opcionesCorrectas.add(5);
    //     Pregunta pregunta = new Pregunta(new RespuestaMultipleChoise(opcionesCorrectas));
        
    //     ArrayList<Integer> opcionesJugador = new ArrayList<>();
    //     opcionesJugador.add(5);
    //     Respuesta respuestaMock = mock(Respuesta.class);
    //     when(respuestaMock.getRespuesta()).thenReturn(new RespuestaMultipleChoise(opcionesJugador));

    //     Jugador jugador = new Jugador("Juan");

    //     jugador.responderPregunta(pregunta, respuestaMock);

    //     assertEquals(0, jugador.getPuntaje());
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

