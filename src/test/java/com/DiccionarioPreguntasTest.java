package com;

import com.model.loader.JsonLoader;
import com.model.pregunta.PreguntaFactory;
import org.junit.jupiter.api.Test;

import com.model.pregunta.DiccionarioPreguntas;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class DiccionarioPreguntasTest {
//    @Test
//    public void test01DiccionarioPreguntaObtieneLaCantidadDePreguntasPorTema(){
//        // El enunciado correcto para la pregunta con ID 1 basado en tu JSON de ejemplo
//
//        int cantidadDePreguntasPorTemaEsparada = 6;
//
//        int ID = 0; // Los índices en los arrays empiezan desde 0
//        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";
//
//        DiccionarioPreguntas diccionarioPreguntas = new DiccionarioPreguntas();
//
//        diccionarioPreguntas.asignarPreguntasPorTema(filePath);
//
//        ArrayList<Pregunta> listaAsociadaCiencias = diccionarioPreguntas.obtenerTema("CIENCIAS");
//
//        int cantidadDePreguntasPorTemaObtenida = listaAsociadaCiencias.size();
//
//        assertEquals(cantidadDePreguntasPorTemaEsparada, cantidadDePreguntasPorTemaObtenida);
//    }
//
//    @Test
//    public void test02DiccionarioPreguntaObtieneLaPreguntaIndicada(){
//        // El enunciado correcto para la pregunta con ID 1 basado en tu JSON de ejemplo
//
//        String PreguntasEsperadaEnunciado = "Ordene de MAYOR A MENOR los siguientes objetos hogareños según su nivel de radiación electromagnética emitido (el máximo recomendado es 100 microTeslas)";
//
//        int ID = 0; // Los índices en los arrays empiezan desde 0
//        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";
//
//        DiccionarioPreguntas diccionarioPreguntas = new DiccionarioPreguntas();
//
//        diccionarioPreguntas.asignarPreguntasPorTema(filePath);
//
//        Pregunta preguntaObtenida = diccionarioPreguntas.obtenerPregunta("CIENCIAS", 0);
//
//        String preguntaObtenidaEnunciado = preguntaObtenida.getEnunciado();
//
//        assertEquals(PreguntasEsperadaEnunciado, preguntaObtenidaEnunciado);
//    }
//
//    @Test
//    void test03ObtenerPreguntaYEliminar() {
//
//        String PreguntasEsperadaEnunciado = "Ordene de MAYOR A MENOR los siguientes objetos hogareños según su nivel de radiación electromagnética emitido (el máximo recomendado es 100 microTeslas)";
//        String PreguntasEsperadaRestante = "El punto de ebullición del agua a 3300m del mar es 100 grados centígrados";
//        int PreguntasRestantesEsperadas = 5;
//
//        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";
//
//        DiccionarioPreguntas diccionarioPreguntas = new DiccionarioPreguntas();
//
//        diccionarioPreguntas.asignarPreguntasPorTema(filePath);
//
//        Pregunta preguntaObtenida = diccionarioPreguntas.obtenerPregunta("CIENCIAS", 0);
//
//        assertNotNull(preguntaObtenida);
//        assertEquals(PreguntasEsperadaEnunciado, preguntaObtenida.getEnunciado());
//
//        ArrayList<Pregunta> preguntasRestantes = diccionarioPreguntas.obtenerTema("CIENCIAS");
//
//        assertNotNull(preguntasRestantes);
//        assertEquals(PreguntasRestantesEsperadas, preguntasRestantes.size());
//        assertEquals(PreguntasEsperadaRestante, preguntasRestantes.get(0).getEnunciado());
//    }
//
//    @Test
//    void test04ObtenerTemas() {
//
//        ArrayList<String> temasEsperados =  new ArrayList<String>();
//        ArrayList<String> temasObtenidos;
//
//        temasEsperados.add("DEPORTES");
//        temasEsperados.add("MISCELANEAS");
//        temasEsperados.add("CIENCIAS");
//        temasEsperados.add("NATURALEZA");
//        temasEsperados.add("ARTE");
//        temasEsperados.add("COMPUTACION");
//        temasEsperados.add("SALUD");
//        temasEsperados.add("HISTORIA");
//
//        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";
//
//        DiccionarioPreguntas diccionarioPreguntas = new DiccionarioPreguntas();
//
//        diccionarioPreguntas.asignarPreguntasPorTema(filePath);
//        temasObtenidos =  diccionarioPreguntas.obtenerTemas();
//        assertEquals(temasObtenidos, temasEsperados);
//    }
//
//    @Test
//    void test05ObtenerPreguntaRandomDeUnTema() {
//        String TemaEsperado = "ARTE";
//        String TemaObtenido;
//
//        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";
//
//        DiccionarioPreguntas diccionarioPreguntas = new DiccionarioPreguntas();
//
//        diccionarioPreguntas.asignarPreguntasPorTema(filePath);
//
//        Pregunta preguntaObtenida = diccionarioPreguntas.obtenerPregunta(TemaEsperado);
//
//        TemaObtenido = preguntaObtenida.getTema();
//
//        assertEquals(TemaEsperado, TemaObtenido);
//    }
//
//    @Test
//    void test06ObtenerPreguntasHastaVaciarTema() {
//
//        ArrayList<Pregunta> preguntasRestantes;
//        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";
//
//        DiccionarioPreguntas diccionarioPreguntas = new DiccionarioPreguntas();
//
//        diccionarioPreguntas.asignarPreguntasPorTema(filePath);
//
//        preguntasRestantes = diccionarioPreguntas.obtenerTema("CIENCIAS");
//        assertNotNull(preguntasRestantes);
//
//        while (preguntasRestantes != null) {
//            diccionarioPreguntas.obtenerPregunta("CIENCIAS", 0);
//            preguntasRestantes = diccionarioPreguntas.obtenerTema("CIENCIAS");
//        }
//
//        assertNull(preguntasRestantes);
//    }
//
//    @Test
//    void test07ObtenerPreguntasHastaVaciarTemaRemoveKey() {
//
//        ArrayList<String> temasEsperados =  new ArrayList<String>();
//        ArrayList<String> temasObtenidos;
//
//        temasEsperados.add("DEPORTES");
//        temasEsperados.add("MISCELANEAS");
//        temasEsperados.add("NATURALEZA");
//        temasEsperados.add("ARTE");
//        temasEsperados.add("COMPUTACION");
//        temasEsperados.add("SALUD");
//        temasEsperados.add("HISTORIA");
//
//        ArrayList<Pregunta> preguntasRestantes;
//        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";
//
//        DiccionarioPreguntas diccionarioPreguntas = new DiccionarioPreguntas();
//
//        diccionarioPreguntas.asignarPreguntasPorTema(filePath);
//
//        preguntasRestantes = diccionarioPreguntas.obtenerTema("CIENCIAS");
//
//        while (preguntasRestantes != null) {
//            diccionarioPreguntas.obtenerPregunta("CIENCIAS", 0);
//            preguntasRestantes = diccionarioPreguntas.obtenerTema("CIENCIAS");
//        }
//
//        temasObtenidos = diccionarioPreguntas.obtenerTemas();
//        assertEquals(temasObtenidos, temasEsperados);
//    }

    @Test
    public void test08obtengoTresPreguntasConTemasDiferentes() {
        //Arrange
        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";
        JsonLoader jsonLoader = new JsonLoader(filePath);
        DiccionarioPreguntas diccionarioPreguntas = new DiccionarioPreguntas(jsonLoader);

        //Act
        diccionarioPreguntas.asignarPreguntasPorTema(filePath);
        String temaEsperado1 = diccionarioPreguntas.getPregunta().getTema();
        String temaEsperado2 = diccionarioPreguntas.getPregunta().getTema();
        String temaEsperado3 = diccionarioPreguntas.getPregunta().getTema();

        //Assert
        assertNotEquals(temaEsperado1, temaEsperado2);
        assertNotEquals(temaEsperado1, temaEsperado3);
        assertNotEquals(temaEsperado2, temaEsperado3);
    }
}
