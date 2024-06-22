package com;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------


public class JugadorTest {
    @Test
    public void test01PreguntaMultipleChoiceConPenalidadRespondeCorrectamente(){

        //Arrange
        Tipo tipo = new MultipleChoiceConPenalidad();
        ArrayList<Opcion> opciones = new ArrayList<>();
        ArrayList<Opcion> respuestaCorrecta = new ArrayList<>();
        ArrayList<Opcion> respuestaObtenida = new ArrayList<>();
        ArrayList<Opcion> respuestaEsperada = new ArrayList<>();
        opciones.add(new OpcionString("Messi"));
        opciones.add(new OpcionString("Maradona"));
        opciones.add(new OpcionString("Cristiano"));
        respuestaCorrecta.add(new OpcionString("1"));
        respuestaEsperada.add(new OpcionString("1"));
        String enunciado = "Jugador con mas balones de oro";
        String tema = "Futbol";

        Jugador jugador = new Jugador("Joel");
        Pregunta pregunta = new Pregunta(tipo,respuestaCorrecta,enunciado,opciones,tema);
        //Act
        respuestaObtenida = jugador.responderPregunta(pregunta);
        //Assert
        assertEquals(respuestaEsperada,respuestaObtenida);
    }
}
