package com;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------

public class MultipleChoiceSinPenalidadTest {
//----------------------------------------------------------------------------------------------------------------------------------------------
    @Test
    public void test01PreguntaMultipleChoiceSinPenalidad() {

        // arrange
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();
        ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();

        respuestas.add(new OpcionString("uno"));

        respuestasCorrectas.add(new OpcionString("uno"));

        int resultadoObtenido;
        int resultadoEsperado = 1;

        MultipleChoiceSinPenalidad preguntaMultipleChoiceSinPenalidad = new MultipleChoiceSinPenalidad(respuestasCorrectas);

        // act
        resultadoObtenido = preguntaMultipleChoiceSinPenalidad.verificarRespuesta(respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

//----------------------------------------------------------------------------------------------------------------------------------------------

    @Test
    public void test02PreguntaMultipleChoiceSinPenalidad() {

        // arrange
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();

        ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();

        respuestas.add(new OpcionString("dos"));

        respuestasCorrectas.add(new OpcionString("uno"));

        int resultadoObtenido;
        int resultadoEsperado = 0;

        MultipleChoiceSinPenalidad preguntaMultipleChoiceSinPenalidad = new MultipleChoiceSinPenalidad(respuestasCorrectas);

        // act
        resultadoObtenido = preguntaMultipleChoiceSinPenalidad.verificarRespuesta(respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

//----------------------------------------------------------------------------------------------------------------------------------------------

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

        MultipleChoiceSinPenalidad preguntaMultipleChoiceSinPenalidad = new MultipleChoiceSinPenalidad(respuestasCorrectas);

        // act
        resultadoObtenido = preguntaMultipleChoiceSinPenalidad.verificarRespuesta(respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

//----------------------------------------------------------------------------------------------------------------------------------------------

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

        MultipleChoiceSinPenalidad preguntaMultipleChoiceSinPenalidad = new MultipleChoiceSinPenalidad(respuestasCorrectas);

        // act
        resultadoObtenido = preguntaMultipleChoiceSinPenalidad.verificarRespuesta(respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);

    }
}

