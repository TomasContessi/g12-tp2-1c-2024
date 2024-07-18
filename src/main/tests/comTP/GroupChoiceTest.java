package comTP;

import comTP.model.modificador.Puntaje;
import comTP.model.opcion.*;
import comTP.model.pregunta.*;
import comTP.model.tipo.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupChoiceTest {
    @Test
    public void test01SeRespondeCorrectamenteTodaUnaPreguntaGroupChoiceSimple() {
        //Arrange
        Puntaje puntajeEsperado = new Puntaje(1);
        Opcion opcion1 = new Opcion("Uno");
        Opcion opcion2 = new Opcion("Dos");
        Opcion opcion3 = new Opcion("Tres");
        Opcion opcion4 = new Opcion("Cuatro");
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(opcion1);
        opciones.add(opcion2);
        opciones.add(opcion3);
        opciones.add(opcion4);
        ArrayList<Opcion> opcionesCorrectas1 = new ArrayList<>();
        opcionesCorrectas1.add(opcion1);
        opcionesCorrectas1.add(opcion2);
        ArrayList<Opcion> opcionesCorrectas2 = new ArrayList<>();
        opcionesCorrectas2.add(opcion3);
        opcionesCorrectas2.add(opcion4);
        Respuesta respuestaCorrecta1 = new Respuesta(opcionesCorrectas1);
        Tipo tipoPregunta = new GroupChoice("GrupoA", "GrupoB");
        Pregunta pregunta = new PreguntaSimple(tipoPregunta, respuestaCorrecta1);
        Respuesta respuestaJugador1 = new Respuesta();
        respuestaJugador1.agregarOpcion(opcion1);
        respuestaJugador1.agregarOpcion(opcion2);

        //Act
        Puntaje puntajeObtenido = pregunta.verificarRespuesta(respuestaJugador1);

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

    @Test
    public void test02SeRespondeIncorrectamenteTodaUnaPreguntaGroupChoiceSimple() {
        //Arrange
        Puntaje puntajeEsperado = new Puntaje(0);
        Opcion opcion1 = new Opcion("Uno");
        Opcion opcion2 = new Opcion("Dos");
        Opcion opcion3 = new Opcion("Tres");
        Opcion opcion4 = new Opcion("Cuatro");
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(opcion1);
        opciones.add(opcion2);
        opciones.add(opcion3);
        opciones.add(opcion4);
        ArrayList<Opcion> opcionesCorrectas1 = new ArrayList<>();
        opcionesCorrectas1.add(opcion1);
        opcionesCorrectas1.add(opcion2);
        ArrayList<Opcion> opcionesCorrectas2 = new ArrayList<>();
        opcionesCorrectas2.add(opcion3);
        opcionesCorrectas2.add(opcion4);
        Respuesta respuestaCorrecta1 = new Respuesta(opcionesCorrectas1);
        Tipo tipoPregunta = new GroupChoice("GrupoA", "GrupoB");
        Pregunta pregunta = new PreguntaSimple(tipoPregunta, respuestaCorrecta1);
        Respuesta respuestaJugador1 = new Respuesta();
        respuestaJugador1.agregarOpcion(opcion1);
        respuestaJugador1.agregarOpcion(opcion3);

        //Act
        Puntaje puntajeObtenido = pregunta.verificarRespuesta(respuestaJugador1);

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }
}
