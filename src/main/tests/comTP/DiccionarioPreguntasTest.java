package comTP;

import comTP.model.loader.JsonLoader;
import comTP.model.pregunta.*;
import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.*;

public class DiccionarioPreguntasTest {
    @Test
    public void test01obtengoTresPreguntasConTemasDiferentes() {
        //Arrange
        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";
        JsonLoader jsonLoader = new JsonLoader(filePath);
        DiccionarioPreguntas diccionarioPreguntas = new DiccionarioPreguntas(jsonLoader);

        //Act
        diccionarioPreguntas.asignarPreguntasPorTema();
        String temaEsperado1 = diccionarioPreguntas.getPregunta().getTema();
        String temaEsperado2 = diccionarioPreguntas.getPregunta().getTema();
        String temaEsperado3 = diccionarioPreguntas.getPregunta().getTema();

        //Assert
        assertNotEquals(temaEsperado1, temaEsperado2);
        assertNotEquals(temaEsperado1, temaEsperado3);
        assertNotEquals(temaEsperado2, temaEsperado3);
    }

    @Test
    public void test02obtengo25PreguntasCorrectamente() {
        //Arrange
        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";
        JsonLoader jsonLoader = new JsonLoader(filePath);
        DiccionarioPreguntas diccionarioPreguntas = new DiccionarioPreguntas(jsonLoader);

        //Act
        diccionarioPreguntas.asignarPreguntasPorTema();
        boolean ultimaPregunta = false;
        for(int i = 1; i <= 25; i++) {
            diccionarioPreguntas.getPregunta();
            ultimaPregunta = diccionarioPreguntas.ultimaPregunta();
        }

        //Assert
        assertTrue(ultimaPregunta);
    }

    @Test
    public void test03obtengoNullCuandoSeQuiereObtener26Preguntas() {
        //Arrange
        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";
        JsonLoader jsonLoader = new JsonLoader(filePath);
        DiccionarioPreguntas diccionarioPreguntas = new DiccionarioPreguntas(jsonLoader);

        //Act
        diccionarioPreguntas.asignarPreguntasPorTema();
        Pregunta pregunta = null;
        for(int i = 1; i <= 26; i++) {
            pregunta = diccionarioPreguntas.getPregunta();
        }

        //Assert
        assertNull(pregunta);
    }
}
