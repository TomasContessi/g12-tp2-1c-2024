package comTP;

import comTP.model.modificador.Puntaje;
import comTP.model.opcion.*;
import comTP.model.pregunta.*;
import comTP.model.tipo.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderedChoiceTest {
    @Test
    public void test01SeRespondeCorrectamenteTodaUnaPreguntaOrderedChoiceSimple() {
        //Arrange
        Puntaje puntajeEsperado = new Puntaje(1);
        Opcion opcion1 = new Opcion("Uno");
        Opcion opcion2 = new Opcion("Dos");
        Opcion opcion3 = new Opcion("Tres");
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(opcion1);
        opciones.add(opcion2);
        opciones.add(opcion3);
        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcion1);
        opcionesCorrectas.add(opcion2);
        opcionesCorrectas.add(opcion3);
        Respuesta respuestaCorrecta = new Respuesta(opcionesCorrectas);
        Tipo tipoPregunta = new OrderedChoice();
        Pregunta pregunta = new PreguntaSimple(tipoPregunta, respuestaCorrecta);
        Respuesta respuestaJugador = new Respuesta();
        respuestaJugador.agregarOpcion(opcion1);
        respuestaJugador.agregarOpcion(opcion2);
        respuestaJugador.agregarOpcion(opcion3);

        //Act
        Puntaje puntajeObtenido = pregunta.verificarRespuesta(respuestaJugador);

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

    @Test
    public void test02SeRespondeConAlgunasOpcionesEnUnaUnaPreguntaOrderedChoiceSimple(){
        //Arrange
        Puntaje puntajeEsperado = new Puntaje(0);
        Opcion opcion1 = new Opcion("Uno");
        Opcion opcion2 = new Opcion("Dos");
        Opcion opcion3 = new Opcion("Tres");
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(opcion1);
        opciones.add(opcion2);
        opciones.add(opcion3);
        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcion1);
        opcionesCorrectas.add(opcion2);
        opcionesCorrectas.add(opcion3);
        Respuesta respuestaCorrecta = new Respuesta(opcionesCorrectas);
        Tipo tipoPregunta = new OrderedChoice();
        Pregunta pregunta = new PreguntaSimple(tipoPregunta, respuestaCorrecta);
        Respuesta respuestaJugador = new Respuesta();
        respuestaJugador.agregarOpcion(opcion1);
        respuestaJugador.agregarOpcion(opcion2);

        //Act
        Puntaje puntajeObtenido = pregunta.verificarRespuesta(respuestaJugador);

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

    @Test
    public void test03SeRespondeEnDesordenEnUnaUnaPreguntaOrderedChoiceSimple(){
        //Arrange
        Puntaje puntajeEsperado = new Puntaje(0);
        Opcion opcion1 = new Opcion("Uno");
        Opcion opcion2 = new Opcion("Dos");
        Opcion opcion3 = new Opcion("Tres");
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(opcion1);
        opciones.add(opcion2);
        opciones.add(opcion3);
        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcion1);
        opcionesCorrectas.add(opcion2);
        opcionesCorrectas.add(opcion3);
        Respuesta respuestaCorrecta = new Respuesta(opcionesCorrectas);
        Tipo tipoPregunta = new OrderedChoice();
        Pregunta pregunta = new PreguntaSimple(tipoPregunta, respuestaCorrecta);
        Respuesta respuestaJugador = new Respuesta();
        respuestaJugador.agregarOpcion(opcion1);
        respuestaJugador.agregarOpcion(opcion3);
        respuestaJugador.agregarOpcion(opcion2);

        //Act
        Puntaje puntajeObtenido = pregunta.verificarRespuesta(respuestaJugador);

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }
}
