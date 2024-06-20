package com;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------

public class OrderedChoiceTest {
//----------------------------------------------------------------------------------------------------------------------------------------------
    @Test
    public void test01OrderedChoiceAciertaTodas(){
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
        int resultadoEsperado = 1;

        Tipo preguntaOrderedChoice = new OrderedChoice();

        // act
        resultadoObtenido = preguntaOrderedChoice.verificarRespuesta(respuestasCorrectas, respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

//----------------------------------------------------------------------------------------------------------------------------------------------

    @Test
    public void test02OrderedChoiceAciertaAlgunas(){
        // arrange
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();

        ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();

        respuestasCorrectas.add(new OpcionString("uno"));
        respuestasCorrectas.add(new OpcionString("dos"));
        respuestasCorrectas.add(new OpcionString("tres"));
        respuestasCorrectas.add(new OpcionString("cuatro"));

        respuestas.add(new OpcionString("uno"));
        respuestas.add(new OpcionString("dos"));
        respuestas.add(new OpcionString("cuatro"));
        respuestas.add(new OpcionString("tres"));


        int resultadoObtenido;
        int resultadoEsperado = 0;

        Tipo preguntaOrderedChoice = new OrderedChoice();

        // act
        resultadoObtenido = preguntaOrderedChoice.verificarRespuesta(respuestasCorrectas, respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

//----------------------------------------------------------------------------------------------------------------------------------------------

    @Test
    public void test03OrderedChoicePifiaTodas(){
        // arrange
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();

        ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();

        respuestasCorrectas.add(new OpcionString("uno"));
        respuestasCorrectas.add(new OpcionString("dos"));
        respuestasCorrectas.add(new OpcionString("tres"));
        respuestasCorrectas.add(new OpcionString("cuatro"));

        respuestas.add(new OpcionString("cuatro"));
        respuestas.add(new OpcionString("tres"));
        respuestas.add(new OpcionString("uno"));
        respuestas.add(new OpcionString("dos"));

        int resultadoObtenido;
        int resultadoEsperado = 0;

        Tipo preguntaOrderedChoice = new OrderedChoice();

        // act
        resultadoObtenido = preguntaOrderedChoice.verificarRespuesta(respuestasCorrectas, respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

//----------------------------------------------------------------------------------------------------------------------------------------------

@Test
public void test04OrderedChoiceNoCompleta(){
    // arrange
    ArrayList<Opcion> respuestas = new ArrayList<Opcion>();

    ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();

    respuestasCorrectas.add(new OpcionString("uno"));
    respuestasCorrectas.add(new OpcionString("dos"));
    respuestasCorrectas.add(new OpcionString("tres"));
    respuestasCorrectas.add(new OpcionString("cuatro"));

    respuestas.add(new OpcionString("uno"));
    respuestas.add(new OpcionString("dos"));

    int resultadoObtenido;
    int resultadoEsperado = 0;

    Tipo preguntaOrderedChoice = new OrderedChoice();

    // act
    resultadoObtenido = preguntaOrderedChoice.verificarRespuesta(respuestasCorrectas, respuestas);
    //assert
    assertEquals(resultadoEsperado, resultadoObtenido);
}
}
