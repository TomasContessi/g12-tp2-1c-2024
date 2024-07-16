package com;

import com.model.modificador.Puntaje;
import org.junit.jupiter.api.Test;

import com.model.opcion.Opcion;
import com.model.opcion.OpcionString;
import com.model.pregunta.PreguntaSimple;
import com.model.tipo.OrderedChoice;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------

public class OrderedChoiceTest {
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

        Puntaje resultadoObtenido;
        Puntaje resultadoEsperado = new Puntaje(1);

        OrderedChoice tipoPregunta = new OrderedChoice();
        PreguntaSimple preguntaOrderedChoice = new PreguntaSimple(tipoPregunta, respuestasCorrectas);

        // act
        resultadoObtenido = preguntaOrderedChoice.verificarRespuesta(respuestas);

        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

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

        Puntaje resultadoObtenido;
        Puntaje resultadoEsperado = new Puntaje(0);

        OrderedChoice tipoPregunta = new OrderedChoice();
        PreguntaSimple preguntaOrderedChoice = new PreguntaSimple(tipoPregunta, respuestasCorrectas);

        // act
        resultadoObtenido = preguntaOrderedChoice.verificarRespuesta(respuestas);
        
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

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

        Puntaje resultadoObtenido;
        Puntaje resultadoEsperado = new Puntaje(0);

        OrderedChoice tipoPregunta = new OrderedChoice();
        PreguntaSimple preguntaOrderedChoice = new PreguntaSimple(tipoPregunta, respuestasCorrectas);

        // act
        resultadoObtenido = preguntaOrderedChoice.verificarRespuesta(respuestas);
        
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

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

        Puntaje resultadoObtenido;
        Puntaje resultadoEsperado = new Puntaje(0);

        OrderedChoice tipoPregunta = new OrderedChoice();
        PreguntaSimple preguntaOrderedChoice = new PreguntaSimple(tipoPregunta, respuestasCorrectas);

        // act
        resultadoObtenido = preguntaOrderedChoice.verificarRespuesta(respuestas);
        
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}
