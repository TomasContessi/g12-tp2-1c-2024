package comTP;

import comTP.model.modificador.Puntaje;
import comTP.model.opcion.Opcion;
import comTP.model.opcion.OpcionString;
import comTP.model.pregunta.PreguntaConPenalidad;
import comTP.model.tipo.MultipleChoice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import comTP.model.modificador.Multiplicador;
import comTP.model.modificador.MultiplicadorX2;
import comTP.model.modificador.MultiplicadorX3;

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

        Puntaje resultadoObtenido;
        Puntaje resultadoEsperado = new Puntaje(4);
        
        MultipleChoice preguntaMultipleChoice = new MultipleChoice();
        PreguntaConPenalidad pregunta = new PreguntaConPenalidad(preguntaMultipleChoice, respuestasCorrectas, enunciado, opciones, tema);

        // act
        resultadoObtenido = pregunta.verificarRespuesta(respuestas);

        //assert
        Assertions.assertEquals(resultadoEsperado, resultadoObtenido);
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

        Puntaje resultadoObtenido;
        Puntaje resultadoEsperado = new Puntaje(4).multiplicarseCon(new Puntaje(2));
        
        Multiplicador multiplicador = new MultiplicadorX2();
        MultipleChoice preguntaMultipleChoice = new MultipleChoice();
        PreguntaConPenalidad pregunta = new PreguntaConPenalidad(preguntaMultipleChoice, respuestasCorrectas, enunciado, opciones, tema);
        pregunta.setMultiplicador(multiplicador);

        // act
        resultadoObtenido = pregunta.verificarRespuesta(respuestas);

        //assert
        Assertions.assertEquals(resultadoEsperado, resultadoObtenido);
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

        Puntaje resultadoObtenido;
        Puntaje resultadoEsperado = new Puntaje(4).multiplicarseCon(new Puntaje(3));
        
        Multiplicador multiplicador = new MultiplicadorX3();
        MultipleChoice preguntaMultipleChoice = new MultipleChoice();
        PreguntaConPenalidad pregunta = new PreguntaConPenalidad(preguntaMultipleChoice, respuestasCorrectas, enunciado, opciones, tema);
        pregunta.setMultiplicador(multiplicador);

        // act
        resultadoObtenido = pregunta.verificarRespuesta(respuestas);

        //assert
        Assertions.assertEquals(resultadoEsperado, resultadoObtenido);
    }
}
