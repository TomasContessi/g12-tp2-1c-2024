package com;

import org.junit.jupiter.api.Test;

import com.model.modificador.Multiplicador;
import com.model.modificador.MultiplicadorX2;
import com.model.modificador.MultiplicadorX3;
import com.model.opcion.Opcion;
import com.model.opcion.OpcionString;
import com.model.pregunta.PreguntaConPenalidad;
import com.model.tipo.MultipleChoice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
public class PreguntaTest {
    @Test
    public void test01PreguntaMultipleChoiceConPenalidadMultiplicadorX1AciertaTodas() {
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
        
        MultipleChoice preguntaMultipleChoice = new MultipleChoice();
        PreguntaConPenalidad pregunta = new PreguntaConPenalidad(preguntaMultipleChoice, respuestasCorrectas, enunciado, opciones, tema);

        // act
        resultadoObtenido = pregunta.verificarRespuesta(respuestas);

        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void test02PreguntaMultipleChoiceConPenalidadMultiplicadorX2AciertaTodas() {
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
        
        Multiplicador multiplicador = new MultiplicadorX2();
        MultipleChoice preguntaMultipleChoice = new MultipleChoice();
        PreguntaConPenalidad pregunta = new PreguntaConPenalidad(preguntaMultipleChoice, respuestasCorrectas, enunciado, opciones, tema);
        pregunta.setMultiplicador(multiplicador);

        // act
        resultadoObtenido = pregunta.verificarRespuesta(respuestas);

        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void test03PreguntaMultipleChoiceConPenalidadMultiplicadorX3AciertaTodas(){
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
        int resultadoEsperado = 4*3;
        
        Multiplicador multiplicador = new MultiplicadorX3();
        MultipleChoice preguntaMultipleChoice = new MultipleChoice();
        PreguntaConPenalidad pregunta = new PreguntaConPenalidad(preguntaMultipleChoice, respuestasCorrectas, enunciado, opciones, tema);
        pregunta.setMultiplicador(multiplicador);

        // act
        resultadoObtenido = pregunta.verificarRespuesta(respuestas);

        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}
