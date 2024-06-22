package com;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------


public class DiccionarioPreguntasTest {
    //----------------------------------------------------------------------------------------------------------------------------------------------
    @Test
    public void test01DiccionarioPreguntaObtieneLaCantidadDePreguntasPorTema(){
        // El enunciado correcto para la pregunta con ID 1 basado en tu JSON de ejemplo

        int cantidadDePreguntasPorTemaEsparada = 6;

        int ID = 0; // Los índices en los arrays empiezan desde 0
        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";

        DiccionarioPreguntas diccionarioPreguntas = new DiccionarioPreguntas();

        diccionarioPreguntas.asignarPreguntasPorTema(filePath);

        ArrayList<Pregunta> listaAsociadaCiencias = diccionarioPreguntas.obtenerTema("CIENCIAS");

        int cantidadDePreguntasPorTemaObtenida = listaAsociadaCiencias.size();

        assertEquals(cantidadDePreguntasPorTemaEsparada, cantidadDePreguntasPorTemaObtenida);
    }

    @Test
    public void test02DiccionarioPreguntaObtieneLaPreguntaIndicada(){
        // El enunciado correcto para la pregunta con ID 1 basado en tu JSON de ejemplo

        String PreguntasEsperadaEnunciado = "Ordene de MAYOR A MENOR los siguientes objetos hogareños según su nivel de radiación electromagnética emitido (el máximo recomendado es 100 microTeslas)";

        int ID = 0; // Los índices en los arrays empiezan desde 0
        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";

        DiccionarioPreguntas diccionarioPreguntas = new DiccionarioPreguntas();

        diccionarioPreguntas.asignarPreguntasPorTema(filePath);

        Pregunta preguntaObtenida = diccionarioPreguntas.obtenerPregunta("CIENCIAS", 0);

        String preguntaObtenidaEnunciado = preguntaObtenida.getEnunciado();

        assertEquals(PreguntasEsperadaEnunciado, preguntaObtenidaEnunciado);
    }

    @Test
    void test03ObtenerPreguntaYEliminar() {

        String PreguntasEsperadaEnunciado = "Ordene de MAYOR A MENOR los siguientes objetos hogareños según su nivel de radiación electromagnética emitido (el máximo recomendado es 100 microTeslas)";
        String PreguntasEsperadaRestante = "El punto de ebullición del agua a 3300m del mar es 100 grados centígrados";
        int PreguntasRestantesEsperadas = 5;

        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";

        DiccionarioPreguntas diccionarioPreguntas = new DiccionarioPreguntas();

        diccionarioPreguntas.asignarPreguntasPorTema(filePath);

        Pregunta preguntaObtenida = diccionarioPreguntas.obtenerPregunta("CIENCIAS", 0);

        assertNotNull(preguntaObtenida);
        assertEquals(PreguntasEsperadaEnunciado, preguntaObtenida.getEnunciado());

        ArrayList<Pregunta> preguntasRestantes = diccionarioPreguntas.obtenerTema("CIENCIAS");

        assertNotNull(preguntasRestantes);
        assertEquals(PreguntasRestantesEsperadas, preguntasRestantes.size());
        assertEquals(PreguntasEsperadaRestante, preguntasRestantes.getFirst().getEnunciado());
    }

}
