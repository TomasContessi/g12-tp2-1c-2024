package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Test;

public class JsonLoaderTest {

    @Test
    public void test01ObtenerCorrectamenteElEnunciadoAUnaPregunta() {
        // El enunciado correcto para la pregunta con ID 1 basado en tu JSON de ejemplo
        String enunciadoEsperado = "Ordene de MAYOR A MENOR los siguientes objetos hogareños según su nivel de radiación electromagnética emitido (el máximo recomendado es 100 microTeslas)";

        int ID = 0; // Los índices en los arrays empiezan desde 0
        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";

        JsonLoader lector = new JsonLoader(filePath);
        lector.leerAtributos(ID, filePath);

        assertEquals(enunciadoEsperado, lector.enunciadoPregunta());
    }

    @Test
    public void test02ObtenerCorrectamenteTipoPreguntaAUnaPregunta() {
        // El enunciado correcto para la pregunta con ID 1 basado en tu JSON de ejemplo
        String tipoPreguntaEsperado = "Ordered Choice";

        int ID = 0; // Los índices en los arrays empiezan desde 0
        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";

        JsonLoader lector = new JsonLoader(filePath);
        lector.leerAtributos(ID, filePath);

        assertEquals(tipoPreguntaEsperado, lector.tipoPregunta());
    }

    @Test
    public void test03ObtenerCorrectamenteCanitdadDeOpcionesDePregunta() {
        // El enunciado correcto para la pregunta con ID 1 basado en tu JSON de ejemplo
        int cantidadDeOpcionesEsperadas = 4;

        int ID = 0; // Los índices en los arrays empiezan desde 0
        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";

        JsonLoader lector = new JsonLoader(filePath);
        lector.leerAtributos(ID, filePath);

        assertEquals(cantidadDeOpcionesEsperadas, lector.opcionesCorrectas().size());
    }

    @Test
    public void test04ObtenerCorrectamenteUnaOpcionDePregunta() {
        // El enunciado correcto para la pregunta con ID 1 basado en tu JSON de ejemplo
        String enunciadoEsperadoOpcion = "Televisor de tubo CRT";

        int ID = 0; // Los índices en los arrays empiezan desde 0
        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";

        JsonLoader lector = new JsonLoader(filePath);
        lector.leerAtributos(ID, filePath);

        assertEquals(enunciadoEsperadoOpcion, lector.opciones().getFirst().obtenerRespuesta());
    }


}