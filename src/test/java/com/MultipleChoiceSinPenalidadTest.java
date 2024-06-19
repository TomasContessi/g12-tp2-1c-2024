package com;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultipleChoiceSinPenalidadTest {
    @Test
    public void test01PreguntaVerdaderoFalso() {

        // arrange
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();
        ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();

        respuestas.add(new OpcionString("uno"));

        respuestasCorrectas.add(new OpcionString("uno"));

        int resultadoObtenido;
        int resultadoEsperado = 1;

        MultipleChoiceSinPenalidad preguntaVerdaderoFalso = new MultipleChoiceSinPenalidad(respuestasCorrectas);

        // act
        resultadoObtenido = preguntaVerdaderoFalso.verificarRespuesta(respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void test02PreguntaVerdaderoFalso() {

        // arrange
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();

        ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();

        respuestas.add(new OpcionString("dos"));

        respuestasCorrectas.add(new OpcionString("uno"));

        int resultadoObtenido;
        int resultadoEsperado = 0;

        MultipleChoiceSinPenalidad preguntaVerdaderoFalso = new MultipleChoiceSinPenalidad(respuestasCorrectas);

        // act
        resultadoObtenido = preguntaVerdaderoFalso.verificarRespuesta(respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void test03PreguntaMultipleChoiceAsignaPuntosCorrectamente() {

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

        MultipleChoiceSinPenalidad preguntaVerdaderoFalso = new MultipleChoiceSinPenalidad(respuestasCorrectas);

        // act
        resultadoObtenido = preguntaVerdaderoFalso.verificarRespuesta(respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

    @Test
    public void test04PreguntaMultipleChoiceAsignaPuntosCorrectamenteNoRespondeTodasBien() {

        // arrange
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();

        ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();

        respuestas.add(new OpcionString("uno"));
        respuestas.add(new OpcionString("dos"));
        respuestas.add(new OpcionString("dos"));
        respuestas.add(new OpcionString("uno"));

        respuestasCorrectas.add(new OpcionString("uno"));
        respuestasCorrectas.add(new OpcionString("uno"));
        respuestasCorrectas.add(new OpcionString("uno"));
        respuestasCorrectas.add(new OpcionString("uno"));

        int resultadoObtenido;
        int resultadoEsperado = 2;

        MultipleChoiceSinPenalidad preguntaVerdaderoFalso = new MultipleChoiceSinPenalidad(respuestasCorrectas);

        // act
        resultadoObtenido = preguntaVerdaderoFalso.verificarRespuesta(respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);

    }
}

