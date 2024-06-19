package com;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class PreguntaConPenalidadTest {
    @Test
    public void test05PreguntaVerdaderoFalsoConPenalidadRespondeCorrectamente() {

        // arrange
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();

        ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();

        respuestas.add(new OpcionString("uno"));

        respuestasCorrectas.add(new OpcionString("uno"));

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
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();

        ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();

        respuestas.add(new OpcionString("dos"));

        respuestasCorrectas.add(new OpcionString("uno"));

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
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();

        ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();

        respuestas.add(new OpcionString("uno"));
        respuestas.add(new OpcionString("uno"));
        respuestas.add(new OpcionString("uno"));
        respuestas.add(new OpcionString("uno"));

        respuestasCorrectas.add(new OpcionString("uno"));
        respuestasCorrectas.add(new OpcionString("uno"));
        respuestasCorrectas.add(new OpcionString("uno"));
        respuestasCorrectas.add(new OpcionString("uno"));

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
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();

        ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();

        respuestas.add(new OpcionString("uno"));
        respuestas.add(new OpcionString("uno"));
        respuestas.add(new OpcionString("uno"));
        respuestas.add(new OpcionString("uno"));

        respuestasCorrectas.add(new OpcionString("dos"));
        respuestasCorrectas.add(new OpcionString("dos"));
        respuestasCorrectas.add(new OpcionString("dos"));
        respuestasCorrectas.add(new OpcionString("dos"));

        int resultadoObtenido;
        int resultadoEsperado = -4;

        Pregunta preguntaVerdaderoFalso = new PreguntaConPenalidad(respuestasCorrectas);

        // act
        resultadoObtenido = preguntaVerdaderoFalso.verificarRespuesta(respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

    public void test09PreguntaMultipleChoiceAsignaPuntosCorrectamenteRespondeAlgunasMalConPenanilidad() {

        // arrange
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();

        ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();

        respuestas.add(new OpcionString("uno"));
        respuestas.add(new OpcionString("uno"));
        respuestas.add(new OpcionString("dos"));
        respuestas.add(new OpcionString("uno"));

        respuestasCorrectas.add(new OpcionString("uno"));
        respuestasCorrectas.add(new OpcionString("dos"));
        respuestasCorrectas.add(new OpcionString("dos"));
        respuestasCorrectas.add(new OpcionString("dos"));

        int resultadoObtenido;
        int resultadoEsperado = 0;

        Pregunta preguntaVerdaderoFalso = new PreguntaConPenalidad(respuestasCorrectas);

        // act
        resultadoObtenido = preguntaVerdaderoFalso.verificarRespuesta(respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);

    }
}


