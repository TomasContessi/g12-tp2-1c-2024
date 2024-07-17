package comTP;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;

import comTP.model.loader.JsonLoader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

        Assertions.assertEquals(cantidadDeOpcionesEsperadas, cantidadDeOpcionesObtenidas);
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

        Assertions.assertEquals(enunciadoEsperadoOpcion, enunciadoObtenido);
    }


}