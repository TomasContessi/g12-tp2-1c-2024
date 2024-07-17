package comTP;

import comTP.model.modificador.Puntaje;
import comTP.model.opcion.Opcion;
import comTP.model.opcion.OpcionString;
import comTP.model.pregunta.PreguntaSimple;
import comTP.model.tipo.MultipleChoice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------

public class MultipleChoiceSimpleTest {
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
        comTP.model.pregunta.PreguntaSimple preguntaMultipleChoiseSimple = new comTP.model.pregunta.PreguntaSimple(tipoPregunta, respuestasCorrectas);

        // act
        resultadoObtenido = preguntaMultipleChoiseSimple.verificarRespuesta(respuestas);
        
        //assert
        Assertions.assertEquals(resultadoEsperado, resultadoObtenido);
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
        comTP.model.pregunta.PreguntaSimple preguntaMultipleChoiseSimple = new comTP.model.pregunta.PreguntaSimple(tipoPregunta, respuestasCorrectas);

        // act
        resultadoObtenido = preguntaMultipleChoiseSimple.verificarRespuesta(respuestas);
        
        //assert
        Assertions.assertEquals(resultadoEsperado, resultadoObtenido);
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
        comTP.model.pregunta.PreguntaSimple preguntaMultipleChoiseSimple = new comTP.model.pregunta.PreguntaSimple(tipoPregunta, respuestasCorrectas);

        // act
        resultadoObtenido = preguntaMultipleChoiseSimple.verificarRespuesta(respuestas);
        
        //assert
        Assertions.assertEquals(resultadoEsperado, resultadoObtenido);
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
        comTP.model.pregunta.PreguntaSimple preguntaMultipleChoiseSimple = new PreguntaSimple(tipoPregunta, respuestasCorrectas);

        // act
        resultadoObtenido = preguntaMultipleChoiseSimple.verificarRespuesta(respuestas);
        
        //assert
        Assertions.assertEquals(resultadoEsperado, resultadoObtenido);
    }
}

