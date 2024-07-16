package com;

import com.model.modificador.Puntaje;
import org.junit.jupiter.api.Test;

import com.model.opcion.Opcion;
import com.model.opcion.OpcionString;
import com.model.pregunta.PreguntaConPenalidad;
import com.model.tipo.MultipleChoice;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------

public class MultipleChoiceConPenalidadTest {
    @Test
    public void test01PreguntaMultipleChoiceConPenanilidadAsignaPuntosCorrectamenteRespondeTodasBien() {
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
        Puntaje resultadoEsperado = new Puntaje(4);
        
        MultipleChoice tipoPregunta = new MultipleChoice();
        PreguntaConPenalidad preguntaMultipleChoiceConPenalidad = new PreguntaConPenalidad(tipoPregunta, respuestasCorrectas);

        // act
        resultadoObtenido = preguntaMultipleChoiceConPenalidad.verificarRespuesta(respuestas);
        
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void test02PreguntaMultipleChoiceConPenanilidadAsignaPuntosCorrectamenteRespondeTodasMal() {
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

        Puntaje resultadoObtenido;
        Puntaje resultadoEsperado = new Puntaje(-4);

        MultipleChoice tipoPregunta = new MultipleChoice();
        PreguntaConPenalidad preguntaMultipleChoiceConPenalidad = new PreguntaConPenalidad(tipoPregunta, respuestasCorrectas);

        // act
        resultadoObtenido = preguntaMultipleChoiceConPenalidad.verificarRespuesta(respuestas);
        
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void test03PreguntaMultipleChoiceConPenanilidadAsignaPuntosCorrectamenteRespondeAlgunasMal() {
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

        Puntaje resultadoObtenido;
        Puntaje resultadoEsperado = new Puntaje(0);

        MultipleChoice tipoPregunta = new MultipleChoice();
        PreguntaConPenalidad preguntaMultipleChoiceConPenalidad = new PreguntaConPenalidad(tipoPregunta, respuestasCorrectas);

        // act
        resultadoObtenido = preguntaMultipleChoiceConPenalidad.verificarRespuesta(respuestas);
        
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void test04PreguntaMultipleChoiceConPenalidadAsignaPuntosCorrectamenteNoRespondeTodas() {
        // arrange
        ArrayList<Opcion> respuestas = new ArrayList<Opcion>();
        ArrayList<Opcion> respuestasCorrectas = new ArrayList<Opcion>();

        respuestas.add(new OpcionString("uno"));
        respuestas.add(new OpcionString("dos"));

        respuestasCorrectas.add(new OpcionString("uno"));
        respuestasCorrectas.add(new OpcionString("dos"));
        respuestasCorrectas.add(new OpcionString("tres"));
        respuestasCorrectas.add(new OpcionString("cuatro"));

        Puntaje resultadoObtenido;
        Puntaje resultadoEsperado = new Puntaje(2);

        MultipleChoice tipoPregunta = new MultipleChoice();
        PreguntaConPenalidad preguntaMultipleChoiceConPenalidad = new PreguntaConPenalidad(tipoPregunta, respuestasCorrectas);

        // act
        resultadoObtenido = preguntaMultipleChoiceConPenalidad.verificarRespuesta(respuestas);
        
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void test05PreguntaMultipleChoiceConPenalidadAsignaPuntosCorrectamenteRespondeOtrasAdemasDeLasCorrectas() {
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
        PreguntaConPenalidad preguntaMultipleChoiceConPenalidad = new PreguntaConPenalidad(tipoPregunta, respuestasCorrectas);

        // act
        resultadoObtenido = preguntaMultipleChoiceConPenalidad.verificarRespuesta(respuestas);
        
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}


