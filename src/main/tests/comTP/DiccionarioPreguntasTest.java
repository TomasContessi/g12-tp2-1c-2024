package comTP;

import comTP.model.pregunta.DiccionarioPreguntas;
import comTP.model.pregunta.Pregunta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
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

        Assertions.assertEquals(cantidadDePreguntasPorTemaEsparada, cantidadDePreguntasPorTemaObtenida);
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

        Assertions.assertEquals(PreguntasEsperadaEnunciado, preguntaObtenidaEnunciado);
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

        Assertions.assertNotNull(preguntaObtenida);
        Assertions.assertEquals(PreguntasEsperadaEnunciado, preguntaObtenida.getEnunciado());

        ArrayList<Pregunta> preguntasRestantes = diccionarioPreguntas.obtenerTema("CIENCIAS");

        Assertions.assertNotNull(preguntasRestantes);
        Assertions.assertEquals(PreguntasRestantesEsperadas, preguntasRestantes.size());
        Assertions.assertEquals(PreguntasEsperadaRestante, preguntasRestantes.get(0).getEnunciado());
    }

    @Test
    void test04ObtenerTemas() {

        ArrayList<String> temasEsperados =  new ArrayList<String>();
        ArrayList<String> temasObtenidos;

        temasEsperados.add("DEPORTES");
        temasEsperados.add("MISCELANEAS");
        temasEsperados.add("CIENCIAS");
        temasEsperados.add("NATURALEZA");
        temasEsperados.add("ARTE");
        temasEsperados.add("COMPUTACION");
        temasEsperados.add("SALUD");
        temasEsperados.add("HISTORIA");

        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";

        DiccionarioPreguntas diccionarioPreguntas = new DiccionarioPreguntas();

        diccionarioPreguntas.asignarPreguntasPorTema(filePath);
        temasObtenidos =  diccionarioPreguntas.obtenerTemas();
        Assertions.assertEquals(temasObtenidos, temasEsperados);
    }

    @Test
    void test05ObtenerPreguntaRandomDeUnTema() {
        String TemaEsperado = "ARTE";
        String TemaObtenido;

        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";

        DiccionarioPreguntas diccionarioPreguntas = new DiccionarioPreguntas();

        diccionarioPreguntas.asignarPreguntasPorTema(filePath);

        Pregunta preguntaObtenida = diccionarioPreguntas.obtenerPregunta(TemaEsperado);

        TemaObtenido = preguntaObtenida.getTema();

        Assertions.assertEquals(TemaEsperado, TemaObtenido);
    }

    @Test
    void test06ObtenerPreguntasHastaVaciarTema() {

        ArrayList<Pregunta> preguntasRestantes;
        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";

        DiccionarioPreguntas diccionarioPreguntas = new DiccionarioPreguntas();

        diccionarioPreguntas.asignarPreguntasPorTema(filePath);

        preguntasRestantes = diccionarioPreguntas.obtenerTema("CIENCIAS");
        Assertions.assertNotNull(preguntasRestantes);

        while (preguntasRestantes != null) {
            diccionarioPreguntas.obtenerPregunta("CIENCIAS", 0);
            preguntasRestantes = diccionarioPreguntas.obtenerTema("CIENCIAS");
        }

        Assertions.assertNull(preguntasRestantes);
    }

    @Test
    void test07ObtenerPreguntasHastaVaciarTemaRemoveKey() {

        ArrayList<String> temasEsperados =  new ArrayList<String>();
        ArrayList<String> temasObtenidos;

        temasEsperados.add("DEPORTES");
        temasEsperados.add("MISCELANEAS");
        temasEsperados.add("NATURALEZA");
        temasEsperados.add("ARTE");
        temasEsperados.add("COMPUTACION");
        temasEsperados.add("SALUD");
        temasEsperados.add("HISTORIA");

        ArrayList<Pregunta> preguntasRestantes;
        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";

        DiccionarioPreguntas diccionarioPreguntas = new DiccionarioPreguntas();

        diccionarioPreguntas.asignarPreguntasPorTema(filePath);

        preguntasRestantes = diccionarioPreguntas.obtenerTema("CIENCIAS");

        while (preguntasRestantes != null) {
            diccionarioPreguntas.obtenerPregunta("CIENCIAS", 0);
            preguntasRestantes = diccionarioPreguntas.obtenerTema("CIENCIAS");
        }

        temasObtenidos = diccionarioPreguntas.obtenerTemas();
        Assertions.assertEquals(temasObtenidos, temasEsperados);
    }
}
