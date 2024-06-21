package com;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PreguntaFactoryTest {

    @Test
    public void test01ObtenerCorrectamenteElEnunciadoAUnaPregunta() {
        // El enunciado correcto para la pregunta con ID 1 basado en tu JSON de ejemplo
        String enunciadoEsperado = "Ordene de MAYOR A MENOR los siguientes objetos hogareños según su nivel de radiación electromagnética emitido (el máximo recomendado es 100 microTeslas)";

        int ID = 0; // Los índices en los arrays empiezan desde 0
        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";

        JsonLoader lector = new JsonLoader();
        lector.leerAtributos(ID, filePath);

        Pregunta pregunta = lector.loadPregunta(new PreguntaFactory());

        assertEquals(enunciadoEsperado, pregunta.getEnunciado());
    }

    @Test
    public void test02ObtenerCorrectamenteElEnunciadoAUnaPregunta() {

        // El enunciado correcto para la pregunta con ID 1 basado en tu JSON de ejemplo

        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(new OpcionString("Televisor de tubo CRT"));
        opcionesCorrectas.add(new OpcionString("Microondas"));
        opcionesCorrectas.add(new OpcionString("Imanes del delivery"));
        opcionesCorrectas.add(new OpcionString("Heladera"));

        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(new OpcionString("2"));
        opciones.add(new OpcionString("1"));
        opciones.add(new OpcionString("4"));
        opciones.add(new OpcionString("3"));


        String temaEsperado = "CIENCIAS";

        PreguntaFactory nuevaPregunta = new PreguntaFactory();
        Pregunta pregunta = nuevaPregunta.crearPregunta("Ordered Choice", "CIENCIAS", "Ordene de MAYOR A MENOR los siguientes objetos hogareños según su nivel de radiación electromagnética emitido (el máximo recomendado es 100 microTeslas)",  opcionesCorrectas, opciones);

        assertEquals(temaEsperado, pregunta.getTema());
    }



}
