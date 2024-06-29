package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.model.loader.JsonLoader;

public class JsonLoaderTest {

    @Test
    public void test01ObtenerCorrectamenteCanitdadDeOpcionesDePregunta() {
        // El enunciado correcto para la pregunta con ID 1 basado en tu JSON de ejemplo
        int cantidadDeOpcionesEsperadas = 4;

        int ID = 0; // Los índices en los arrays empiezan desde 0
        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";

        JsonLoader lector = new JsonLoader(filePath);
        lector.leerAtributos(ID, filePath);

        int cantidadDeOpcionesObtenidas = lector.opcionesCorrectas().size();

        assertEquals(cantidadDeOpcionesEsperadas, cantidadDeOpcionesObtenidas);
    }

    @Test
    public void test02ObtenerCorrectamenteUnaOpcionDePregunta() {
        // El enunciado correcto para la pregunta con ID 1 basado en tu JSON de ejemplo
        String enunciadoEsperadoOpcion = "Televisor de tubo CRT";
        String enunciadoObtenido;

        int ID = 0; // Los índices en los arrays empiezan desde 0
        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";

        JsonLoader lector = new JsonLoader(filePath);
        lector.leerAtributos(ID, filePath);

        enunciadoObtenido = lector.opciones().get(0).obtenerRespuesta();

        assertEquals(enunciadoEsperadoOpcion, enunciadoObtenido);
    }


}