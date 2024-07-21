package comTP;

import java.io.File;
import java.util.ArrayList;
import comTP.model.loader.JsonLoader;
import comTP.model.opcion.*;
import comTP.model.pregunta.Pregunta;
import comTP.model.pregunta.PreguntaSimple;
import comTP.model.tipo.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonLoaderTest {
    @Test
    public void test01LeeCorrectamenteElArchivoJsonYSeteaCorrectamenteElTema() {
        //Arrange
        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";
        JsonLoader jsonLoader = new JsonLoader(filePath);
        Tipo tipo = new VerdaderoFalso();
        Opcion opcion1 = new Opcion("Verdadero");
        Opcion opcion2 = new Opcion("Falso");
        ArrayList<Opcion> opciones = new ArrayList<Opcion>();
        opciones.add(opcion1);
        opciones.add(opcion2);
        Respuesta respuestaCorrecta = new Respuesta();
        respuestaCorrecta.agregarOpcion(opcion2);
        String enunciado = "El punto de ebullición del agua a 3300m del mar es 100 grados centígrados";
        String tema = "CIENCIAS";
        String textoRespuesta = "En la altura, la temperatura de ebullición es menor por la mayor presión atmosférica";
        Pregunta preguntaEsperada = new PreguntaSimple(tipo, respuestaCorrecta,
                enunciado, opciones, tema, textoRespuesta);

        //Act
        Pregunta preguntaObtenida = jsonLoader.loadPregunta(2);

        //Assert
        assertEquals(preguntaEsperada.getTema(), preguntaObtenida.getTema());
    }

    @Test
    public void test02LeeCorrectamenteElArchivoJsonYSeteaCorrectamenteElEnunciado() {
        //Arrange
        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";
        JsonLoader jsonLoader = new JsonLoader(filePath);
        Tipo tipo = new VerdaderoFalso();
        Opcion opcion1 = new Opcion("Verdadero");
        Opcion opcion2 = new Opcion("Falso");
        ArrayList<Opcion> opciones = new ArrayList<Opcion>();
        opciones.add(opcion1);
        opciones.add(opcion2);
        Respuesta respuestaCorrecta = new Respuesta();
        respuestaCorrecta.agregarOpcion(opcion2);
        String enunciado = "El punto de ebullición del agua a 3300m del mar es 100 grados centígrados";
        String tema = "CIENCIAS";
        String textoRespuesta = "En la altura, la temperatura de ebullición es menor por la mayor presión atmosférica";
        Pregunta preguntaEsperada = new PreguntaSimple(tipo, respuestaCorrecta,
                enunciado, opciones, tema, textoRespuesta);

        //Act
        Pregunta preguntaObtenida = jsonLoader.loadPregunta(2);

        //Assert
        assertEquals(preguntaEsperada.getEnunciado(), preguntaObtenida.getEnunciado());
    }

    @Test
    public void test03LeeCorrectamenteElArchivoJsonYSeteaCorrectamenteLaRespuestaCorrecta() {
        //Arrange
        int cantidadDeOpcionesCorrectasEsperada = 1;
        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";
        JsonLoader jsonLoader = new JsonLoader(filePath);
        Tipo tipo = new VerdaderoFalso();
        Opcion opcion1 = new Opcion("Verdadero");
        Opcion opcion2 = new Opcion("Falso");
        ArrayList<Opcion> opciones = new ArrayList<Opcion>();
        opciones.add(opcion1);
        opciones.add(opcion2);
        Respuesta respuestaCorrecta = new Respuesta();
        respuestaCorrecta.agregarOpcion(opcion2);
        String enunciado = "El punto de ebullición del agua a 3300m del mar es 100 grados centígrados";
        String tema = "CIENCIAS";
        String textoRespuesta = "En la altura, la temperatura de ebullición es menor por la mayor presión atmosférica";
        Pregunta preguntaEsperada = new PreguntaSimple(tipo, respuestaCorrecta,
                enunciado, opciones, tema, textoRespuesta);

        //Act
        Pregunta preguntaObtenida = jsonLoader.loadPregunta(2);
        respuestaCorrecta.corregirRespuestaUnica(preguntaObtenida.getRespuestaCorrecta());
        int cantidadDeOpcionesCorrectasObtenida = respuestaCorrecta.cantidadDeOpcionesCorrectas();

        //Assert
        assertEquals(cantidadDeOpcionesCorrectasEsperada, cantidadDeOpcionesCorrectasObtenida);
    }
}