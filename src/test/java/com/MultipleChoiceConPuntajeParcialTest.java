package com;

import org.junit.jupiter.api.Test;

import com.model.opcion.Opcion;
import com.model.opcion.OpcionString;
import com.model.pregunta.PreguntaParcial;
import com.model.tipo.MultipleChoice;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------

public class MultipleChoiceConPuntajeParcialTest {
    @Test
    public void test01MultipleChoiceConPuntajeParcialAciertaTodas(){
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

        MultipleChoice tipoPregunta = new MultipleChoice();
        PreguntaParcial preguntaMultipleChoiceConPuntajeParcial = new PreguntaParcial(tipoPregunta, respuestasCorrectas);

        // act
        resultadoObtenido = preguntaMultipleChoiceConPuntajeParcial.verificarRespuesta(respuestas);

        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void test02MultipleChoiceConPuntajeParcialAciertaAlgunas() {
        // arrange
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();
        ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();

        respuestas.add(new OpcionString("uno"));
        respuestas.add(new OpcionString("cuatro"));

        respuestasCorrectas.add(new OpcionString("uno"));
        respuestasCorrectas.add(new OpcionString("dos"));
        respuestasCorrectas.add(new OpcionString("tres"));
        respuestasCorrectas.add(new OpcionString("cuatro"));

        int resultadoObtenido;
        int resultadoEsperado = 2;

        MultipleChoice tipoPregunta = new MultipleChoice();
        PreguntaParcial preguntaMultipleChoiceConPuntajeParcial = new PreguntaParcial(tipoPregunta, respuestasCorrectas);

        // act
        resultadoObtenido = preguntaMultipleChoiceConPuntajeParcial.verificarRespuesta(respuestas);

        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void test03MultipleChoiceConPuntajeParcialAciertaErraUna(){
        // arrange
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();
        ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();

        respuestasCorrectas.add(new OpcionString("uno"));
        respuestasCorrectas.add(new OpcionString("dos"));
        respuestasCorrectas.add(new OpcionString("tres"));
        respuestasCorrectas.add(new OpcionString("cuatro"));

        respuestas.add(new OpcionString("uno"));
        respuestas.add(new OpcionString("zapallo"));
        respuestas.add(new OpcionString("tres"));
        respuestas.add(new OpcionString("cuatro"));

        int resultadoObtenido;
        int resultadoEsperado = 0;

        MultipleChoice tipoPregunta = new MultipleChoice();
        PreguntaParcial preguntaMultipleChoiceConPuntajeParcial = new PreguntaParcial(tipoPregunta, respuestasCorrectas);

        // act
        resultadoObtenido = preguntaMultipleChoiceConPuntajeParcial.verificarRespuesta(respuestas);

        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}
