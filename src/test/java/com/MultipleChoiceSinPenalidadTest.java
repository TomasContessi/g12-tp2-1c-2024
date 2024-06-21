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

        Tipo preguntaMultipleChoiceSinPenalidad = new MultipleChoiceSinPenalidad();

        // act
        resultadoObtenido = preguntaMultipleChoiceSinPenalidad.verificarRespuesta(respuestasCorrectas, respuestas);
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

        Tipo preguntaMultipleChoiceSinPenalidad = new MultipleChoiceSinPenalidad();

        // act
        resultadoObtenido = preguntaMultipleChoiceSinPenalidad.verificarRespuesta(respuestasCorrectas, respuestas);
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
        respuestas.add(new OpcionString("dos"));
        respuestas.add(new OpcionString("tres"));
        respuestas.add(new OpcionString("cuatro"));

        respuestasCorrectas.add(new OpcionString("uno"));
        respuestasCorrectas.add(new OpcionString("dos"));
        respuestasCorrectas.add(new OpcionString("tres"));
        respuestasCorrectas.add(new OpcionString("cuatro"));

        int resultadoObtenido;
        int resultadoEsperado = 4;

        Tipo preguntaMultipleChoiceSinPenalidad = new MultipleChoiceSinPenalidad();

        // act
        resultadoObtenido = preguntaMultipleChoiceSinPenalidad.verificarRespuesta(respuestasCorrectas, respuestas);
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
        respuestas.add(new OpcionString("tres"));
        respuestas.add(new OpcionString("cuatro"));

        respuestasCorrectas.add(new OpcionString("uno"));
        respuestasCorrectas.add(new OpcionString("dos"));
        respuestasCorrectas.add(new OpcionString("dsa"));
        respuestasCorrectas.add(new OpcionString("dads"));

        int resultadoObtenido;
        int resultadoEsperado = 2;

        Tipo preguntaMultipleChoiceSinPenalidad = new MultipleChoiceSinPenalidad();

        // act
        resultadoObtenido = preguntaMultipleChoiceSinPenalidad.verificarRespuesta(respuestasCorrectas, respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

//----------------------------------------------------------------------------------------------------------------------------------------------

@Test
public void test05PreguntaMultipleChoiceAsignaPuntosCorrectamenteNoRespondeTodas() {

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

    Tipo preguntaMultipleChoiceSinPenalidad = new MultipleChoiceSinPenalidad();

    // act
    resultadoObtenido = preguntaMultipleChoiceSinPenalidad.verificarRespuesta(respuestasCorrectas, respuestas);
    //assert
    assertEquals(resultadoEsperado, resultadoObtenido);

}
}

