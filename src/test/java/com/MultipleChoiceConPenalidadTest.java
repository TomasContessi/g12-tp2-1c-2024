package com;

import org.junit.jupiter.api.Test;

import com.model.opcion.Opcion;
import com.model.opcion.OpcionString;
import com.model.tipo.MultipleChoiceConPenalidad;
import com.model.tipo.Tipo;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------


public class MultipleChoiceConPenalidadTest {
//----------------------------------------------------------------------------------------------------------------------------------------------
    @Test
    public void test01PreguntaMultipleChoiceConPenalidadConPenalidadRespondeCorrectamente() {

        // arrange
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();

        ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();

        respuestas.add(new OpcionString("uno"));

        respuestasCorrectas.add(new OpcionString("uno"));

        int resultadoObtenido;
        int resultadoEsperado = 1;

        Tipo preguntaMultipleChoiceConPenalidad = new MultipleChoiceConPenalidad();

        // act
        resultadoObtenido = preguntaMultipleChoiceConPenalidad.verificarRespuesta(respuestasCorrectas, respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

//----------------------------------------------------------------------------------------------------------------------------------------------

    @Test
    public void test02PreguntaMultipleChoiceConPenalidadConPenalidadRespondeInconrrectamente() {

        // arrange
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();

        ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();

        respuestas.add(new OpcionString("dos"));

        respuestasCorrectas.add(new OpcionString("uno"));

        int resultadoObtenido;
        int resultadoEsperado = -1;

        Tipo preguntaMultipleChoiceConPenalidad = new MultipleChoiceConPenalidad();

        // act
        resultadoObtenido = preguntaMultipleChoiceConPenalidad.verificarRespuesta(respuestasCorrectas, respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

//----------------------------------------------------------------------------------------------------------------------------------------------

    @Test
    public void test03PreguntaMultipleChoiceAsignaPuntosCorrectamenteRespondeTodasBienConPenanilidad() {

        // arrange
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();

        ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();

        respuestas.add(new OpcionString("uno"));
        respuestas.add(new OpcionString("dos"));
        respuestas.add(new OpcionString("tres"));
        respuestas.add(new OpcionString("cuatro"));

        respuestasCorrectas.add(new OpcionString("uno"));
        respuestasCorrectas.add(new OpcionString("dos"));
        respuestasCorrectas.add(new OpcionString("tres"));
        respuestasCorrectas.add(new OpcionString("cuatro"));

        int resultadoObtenido;
        int resultadoEsperado = 4;
        
        Tipo preguntaMultipleChoiceConPenalidad = new MultipleChoiceConPenalidad();

        // act
        resultadoObtenido = preguntaMultipleChoiceConPenalidad.verificarRespuesta(respuestasCorrectas, respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

//----------------------------------------------------------------------------------------------------------------------------------------------

    @Test
    public void test04PreguntaMultipleChoiceAsignaPuntosCorrectamenteRespondeTodasMalConPenanilidad() {

        // arrange
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();

        ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();

        respuestas.add(new OpcionString("uno"));
        respuestas.add(new OpcionString("dos"));
        respuestas.add(new OpcionString("tres"));
        respuestas.add(new OpcionString("cuatro"));

        respuestasCorrectas.add(new OpcionString("cinco"));
        respuestasCorrectas.add(new OpcionString("as"));
        respuestasCorrectas.add(new OpcionString("ddad"));
        respuestasCorrectas.add(new OpcionString("asas"));

        int resultadoObtenido;
        int resultadoEsperado = -4;

        Tipo preguntaMultipleChoiceConPenalidad = new MultipleChoiceConPenalidad();

        // act
        resultadoObtenido = preguntaMultipleChoiceConPenalidad.verificarRespuesta(respuestasCorrectas, respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

//----------------------------------------------------------------------------------------------------------------------------------------------

    @Test
    public void test05PreguntaMultipleChoiceAsignaPuntosCorrectamenteRespondeAlgunasMalConPenanilidad() {

        // arrange
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();

        ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();

        respuestas.add(new OpcionString("uno"));
        respuestas.add(new OpcionString("dos"));
        respuestas.add(new OpcionString("tres"));
        respuestas.add(new OpcionString("cuatro"));

        respuestasCorrectas.add(new OpcionString("uno"));
        respuestasCorrectas.add(new OpcionString("dos"));
        respuestasCorrectas.add(new OpcionString("sas"));
        respuestasCorrectas.add(new OpcionString("dsda"));

        int resultadoObtenido;
        int resultadoEsperado = 0;

        Tipo preguntaMultipleChoiceConPenalidad = new MultipleChoiceConPenalidad();

        // act
        resultadoObtenido = preguntaMultipleChoiceConPenalidad.verificarRespuesta(respuestasCorrectas, respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

    //----------------------------------------------------------------------------------------------------------------------------------------------

    @Test
    public void test06PreguntaMultipleChoiceAsignaPuntosCorrectamenteRespondeAlgunasConPenalidad() {

        // arrange
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();

        ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();

        respuestas.add(new OpcionString("uno"));
        respuestas.add(new OpcionString("dos"));
        respuestas.add(new OpcionString("tres"));
        respuestas.add(new OpcionString("cuatro"));

        respuestasCorrectas.add(new OpcionString("uno"));
        respuestasCorrectas.add(new OpcionString("dos"));

        int resultadoObtenido;
        int resultadoEsperado = 2;

        Tipo preguntaMultipleChoiceConPenalidad = new MultipleChoiceConPenalidad();

        // act
        resultadoObtenido = preguntaMultipleChoiceConPenalidad.verificarRespuesta(respuestasCorrectas, respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);

    }
}


