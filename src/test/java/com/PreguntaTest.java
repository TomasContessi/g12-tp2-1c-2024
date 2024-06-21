package com;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
public class PreguntaTest {

    
    @Test
    public void test01PreguntaMultipleChoiceSimpleMultiplicadorX1AciertaTodas(){
        // arrange
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();

        ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();

        ArrayList<Opcion> opciones = new ArrayList<Opcion>();

        String enunciado = "pregunta uno";

        String tema = "matematica";

        respuestas.add(new OpcionString("uno"));
        respuestas.add(new OpcionString("dos"));
        respuestas.add(new OpcionString("tres"));
        respuestas.add(new OpcionString("cuatro"));

        respuestasCorrectas.add(new OpcionString("uno"));
        respuestasCorrectas.add(new OpcionString("dos"));
        respuestasCorrectas.add(new OpcionString("tres"));
        respuestasCorrectas.add(new OpcionString("cuatro"));

        opciones.add(new OpcionString("uno"));
        opciones.add(new OpcionString("dos"));
        opciones.add(new OpcionString("tres"));
        opciones.add(new OpcionString("cuatro"));

        int resultadoObtenido;
        int resultadoEsperado = 4;
        
        Tipo preguntaMultipleChoiceConPenalidad = new MultipleChoiceConPenalidad();
        Pregunta pregunta = new Pregunta(preguntaMultipleChoiceConPenalidad, respuestasCorrectas, enunciado, opciones, tema);

        // act
        resultadoObtenido = pregunta.verificarRespuesta(respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void test02PreguntaMultipleChoiceSimpleMultiplicadorX2AciertaTodas(){
        // arrange
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();

        ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();
        ArrayList<Opcion> opciones = new ArrayList<Opcion>();

        String enunciado = "pregunta uno";

        String tema = "matematica";
        respuestas.add(new OpcionString("uno"));
        respuestas.add(new OpcionString("dos"));
        respuestas.add(new OpcionString("tres"));
        respuestas.add(new OpcionString("cuatro"));

        respuestasCorrectas.add(new OpcionString("uno"));
        respuestasCorrectas.add(new OpcionString("dos"));
        respuestasCorrectas.add(new OpcionString("tres"));
        respuestasCorrectas.add(new OpcionString("cuatro"));

        opciones.add(new OpcionString("uno"));
        opciones.add(new OpcionString("dos"));
        opciones.add(new OpcionString("tres"));
        opciones.add(new OpcionString("cuatro"));

        int resultadoObtenido;
        int resultadoEsperado = 4*2;
        
        Tipo preguntaMultipleChoiceConPenalidad = new MultipleChoiceConPenalidad();
        Multiplicador multiplicador = new MultiplicadorX2();
        Pregunta pregunta = new Pregunta(preguntaMultipleChoiceConPenalidad, respuestasCorrectas, enunciado, opciones, tema);
        pregunta.setMultiplicador(multiplicador);

        // act
        resultadoObtenido = pregunta.verificarRespuesta(respuestas);
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
    
}
