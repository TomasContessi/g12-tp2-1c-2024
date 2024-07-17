package com;

import com.model.modificador.Puntaje;
import org.junit.jupiter.api.Test;

import com.model.opcion.Opcion;
import com.model.opcion.OpcionString;
import com.model.pregunta.PreguntaSimple;
import com.model.tipo.MultipleChoice;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------

public class MultipleChoiceTestSimple {
    @Test
    public void test01PreguntaMultipleChoiceSimpleAsignaPuntosCorrectamenteRespondeTodoBien() {
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

        MultipleChoice tipoPregunta = new MultipleChoice();
        PreguntaSimple preguntaMultipleChoiseSimple = new PreguntaSimple(tipoPregunta, respuestasCorrectas);

        // act
        resultadoObtenido = preguntaMultipleChoiseSimple.verificarRespuesta(respuestas);
        
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void test02PreguntaMultipleChoiceSimpleAsignaPuntosCorrectamenteRespondeTodasMal() {
        // arrange
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();
        ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();

        respuestas.add(new OpcionString("fsfs"));
        respuestas.add(new OpcionString("cdfd"));
        respuestas.add(new OpcionString("tres"));
        respuestas.add(new OpcionString("cuatro"));

        respuestasCorrectas.add(new OpcionString("uno"));
        respuestasCorrectas.add(new OpcionString("dos"));
        respuestasCorrectas.add(new OpcionString("dsa"));
        respuestasCorrectas.add(new OpcionString("dads"));

        Puntaje resultadoObtenido;
        Puntaje resultadoEsperado = new Puntaje(0);

        MultipleChoice tipoPregunta = new MultipleChoice();
        PreguntaSimple preguntaMultipleChoiseSimple = new PreguntaSimple(tipoPregunta, respuestasCorrectas);

        // act
        resultadoObtenido = preguntaMultipleChoiseSimple.verificarRespuesta(respuestas);
        
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void test03PreguntaMultipleChoiceSimpleAsignaPuntosCorrectamenteNoRespondeTodasBien() {
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

        Puntaje resultadoObtenido;
        Puntaje resultadoEsperado = new Puntaje(0);

        MultipleChoice tipoPregunta = new MultipleChoice();
        PreguntaSimple preguntaMultipleChoiseSimple = new PreguntaSimple(tipoPregunta, respuestasCorrectas);

        // act
        resultadoObtenido = preguntaMultipleChoiseSimple.verificarRespuesta(respuestas);
        
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    // @Test
    // public void test04PreguntaMultipleChoiceAsignaPuntosCorrectamenteNoRespondeTodas() {
    //     // arrange
    //     ArrayList<Opcion> respuestas = new ArrayList<Opcion>();
    //     ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();

    //     respuestas.add(new OpcionString("uno"));
    //     respuestas.add(new OpcionString("dos"));

    //     respuestasCorrectas.add(new OpcionString("uno"));
    //     respuestasCorrectas.add(new OpcionString("dos"));
    //     respuestasCorrectas.add(new OpcionString("tres"));
    //     respuestasCorrectas.add(new OpcionString("cuatro"));

    //     int resultadoObtenido;
    //     int resultadoEsperado = 0;

    //     MultipleChoice tipoPregunta = new MultipleChoice();
    //     PreguntaSimple preguntaMultipleChoiseSimple = new PreguntaSimple(tipoPregunta, respuestasCorrectas);

    //     // act
    //     resultadoObtenido = preguntaMultipleChoiseSimple.verificarRespuesta(respuestas);
        
    //     //assert
    //     assertEquals(resultadoEsperado, resultadoObtenido);
    // }

    @Test
    public void test05PreguntaMultipleChoiceAsignaPuntosCorrectamenteRespondeOtrasAdemasDeLasCorrectas() {
        // arrange
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();
        ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();

        respuestas.add(new OpcionString("uno"));
        respuestas.add(new OpcionString("dos"));
        respuestas.add(new OpcionString("tres"));
        respuestas.add(new OpcionString("cuatro"));

        respuestasCorrectas.add(new OpcionString("uno"));
        respuestasCorrectas.add(new OpcionString("dos"));

        Puntaje resultadoObtenido;
        Puntaje resultadoEsperado = new Puntaje(0);

        MultipleChoice tipoPregunta = new MultipleChoice();
        PreguntaSimple preguntaMultipleChoiseSimple = new PreguntaSimple(tipoPregunta, respuestasCorrectas);

        // act
        resultadoObtenido = preguntaMultipleChoiseSimple.verificarRespuesta(respuestas);
        
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}

