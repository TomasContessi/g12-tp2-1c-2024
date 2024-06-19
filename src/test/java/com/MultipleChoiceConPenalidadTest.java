package com;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------


public class MultipleChoiceConPenalidadTest {
//----------------------------------------------------------------------------------------------------------------------------------------------
    @Test
    public void test05PreguntaMultipleChoiceConPenalidadConPenalidadRespondeCorrectamente() {

        // arrange
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();

        ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();

        respuestas.add(new OpcionString("uno"));

        respuestasCorrectas.add(new OpcionString("uno"));

        int resultadoObtenido;
        int resultadoEsperado = 1;

        Pregunta preguntaMultipleChoiceConPenalidad = new MultipleChoiceConPenalidad(respuestasCorrectas);

        // act
        resultadoObtenido = preguntaMultipleChoiceConPenalidad.verificarRespuesta(respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

//----------------------------------------------------------------------------------------------------------------------------------------------

    @Test
    public void test06PreguntaMultipleChoiceConPenalidadConPenalidadRespondeInconrrectamente() {

        // arrange
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();

        ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();

        respuestas.add(new OpcionString("dos"));

        respuestasCorrectas.add(new OpcionString("uno"));

        int resultadoObtenido;
        int resultadoEsperado = -1;

        Pregunta preguntaMultipleChoiceConPenalidad = new MultipleChoiceConPenalidad(respuestasCorrectas);

        // act
        resultadoObtenido = preguntaMultipleChoiceConPenalidad.verificarRespuesta(respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

//----------------------------------------------------------------------------------------------------------------------------------------------

    @Test
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

        Pregunta preguntaMultipleChoiceConPenalidad = new MultipleChoiceConPenalidad(respuestasCorrectas);

        // act
        resultadoObtenido = preguntaMultipleChoiceConPenalidad.verificarRespuesta(respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

//----------------------------------------------------------------------------------------------------------------------------------------------

    @Test
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

        Pregunta preguntaMultipleChoiceConPenalidad = new MultipleChoiceConPenalidad(respuestasCorrectas);

        // act
        resultadoObtenido = preguntaMultipleChoiceConPenalidad.verificarRespuesta(respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

//----------------------------------------------------------------------------------------------------------------------------------------------

    @Test
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

        Pregunta preguntaMultipleChoiceConPenalidad = new MultipleChoiceConPenalidad(respuestasCorrectas);

        // act
        resultadoObtenido = preguntaMultipleChoiceConPenalidad.verificarRespuesta(respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);

    }
}


