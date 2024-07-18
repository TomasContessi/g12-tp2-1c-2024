package comTP;

import comTP.model.modificador.Puntaje;
import comTP.model.opcion.*;
import comTP.model.pregunta.*;
import comTP.model.tipo.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultipleChoiceConPenalidadTest {
    @Test
    public void test01SeRespondeCorrectamenteTodaUnaPreguntaMultipleChoiceConPenalidad() {
        //Arrange
        Puntaje puntajeEsperado = new Puntaje(2);
        Opcion opcion1 = new Opcion("Uno");
        Opcion opcion2 = new Opcion("Dos");
        Opcion opcion3 = new Opcion("Tres");
        Opcion opcion4 = new Opcion("Cuatro");
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(opcion1);
        opciones.add(opcion2);
        opciones.add(opcion3);
        opciones.add(opcion4);
        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcion1);
        opcionesCorrectas.add(opcion2);
        Respuesta respuestaCorrecta = new Respuesta(opcionesCorrectas);
        Tipo tipoPregunta = new MultipleChoice();
        Pregunta pregunta = new PreguntaConPenalidad(tipoPregunta, respuestaCorrecta);
        Respuesta respuestaJugador = new Respuesta();
        respuestaJugador.agregarOpcion(opcion1);
        respuestaJugador.agregarOpcion(opcion2);

        //Act
        Puntaje puntajeObtenido = pregunta.verificarRespuesta(respuestaJugador);

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

    @Test
    public void test02SeRespondeTodoMalEnUnaPreguntaMultipleChoiceConPenalidad() {
        //Arrange
        Puntaje puntajeEsperado = new Puntaje(-2);
        Opcion opcion1 = new Opcion("Uno");
        Opcion opcion2 = new Opcion("Dos");
        Opcion opcion3 = new Opcion("Tres");
        Opcion opcion4 = new Opcion("Cuatro");
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(opcion1);
        opciones.add(opcion2);
        opciones.add(opcion3);
        opciones.add(opcion4);
        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcion1);
        opcionesCorrectas.add(opcion2);
        Respuesta respuestaCorrecta = new Respuesta(opcionesCorrectas);
        Tipo tipoPregunta = new MultipleChoice();
        Pregunta pregunta = new PreguntaConPenalidad(tipoPregunta, respuestaCorrecta);
        Respuesta respuestaJugador = new Respuesta();
        respuestaJugador.agregarOpcion(opcion3);
        respuestaJugador.agregarOpcion(opcion4);

        //Act
        Puntaje puntajeObtenido = pregunta.verificarRespuesta(respuestaJugador);

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

    @Test
    public void test03SeRespondeErrandoAlgunaOpcionEnUnaPreguntaMultipleChoiceConPenalidad() {
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
        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcion1);
        opcionesCorrectas.add(opcion2);
        opcionesCorrectas.add(opcion4);
        Respuesta respuestaCorrecta = new Respuesta(opcionesCorrectas);
        Tipo tipoPregunta = new MultipleChoice();
        Pregunta pregunta = new PreguntaConPenalidad(tipoPregunta, respuestaCorrecta);
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
    public void test04SeRespondeAcertandoAlgunasUnaPreguntaMultipleChoiceConPenalidad() {
        //Arrange
        Puntaje puntajeEsperado = new Puntaje(2);
        Opcion opcion1 = new Opcion("Uno");
        Opcion opcion2 = new Opcion("Dos");
        Opcion opcion3 = new Opcion("Tres");
        Opcion opcion4 = new Opcion("Cuatro");
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(opcion1);
        opciones.add(opcion2);
        opciones.add(opcion3);
        opciones.add(opcion4);
        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcion1);
        opcionesCorrectas.add(opcion2);
        opcionesCorrectas.add(opcion3);
        Respuesta respuestaCorrecta = new Respuesta(opcionesCorrectas);
        Tipo tipoPregunta = new MultipleChoice();
        Pregunta pregunta = new PreguntaConPenalidad(tipoPregunta, respuestaCorrecta);
        Respuesta respuestaJugador = new Respuesta();
        respuestaJugador.agregarOpcion(opcion1);
        respuestaJugador.agregarOpcion(opcion2);

        //Act
        Puntaje puntajeObtenido = pregunta.verificarRespuesta(respuestaJugador);

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

    @Test
    public void test04SeRespondeConMasOpcionesQueLasCorrectasEnUnaPreguntaMultipleChoiceConPenalidad() {
        //Arrange
        Puntaje puntajeEsperado = new Puntaje(-1);
        Opcion opcion1 = new Opcion("Uno");
        Opcion opcion2 = new Opcion("Dos");
        Opcion opcion3 = new Opcion("Tres");
        Opcion opcion4 = new Opcion("Cuatro");
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(opcion1);
        opciones.add(opcion2);
        opciones.add(opcion3);
        opciones.add(opcion4);
        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcion1);
        opcionesCorrectas.add(opcion2);
        Respuesta respuestaCorrecta = new Respuesta(opcionesCorrectas);
        Tipo tipoPregunta = new MultipleChoice();
        Pregunta pregunta = new PreguntaConPenalidad(tipoPregunta, respuestaCorrecta);
        Respuesta respuestaJugador = new Respuesta();
        respuestaJugador.agregarOpcion(opcion1);
        respuestaJugador.agregarOpcion(opcion3);
        respuestaJugador.agregarOpcion(opcion4);

        //Act
        Puntaje puntajeObtenido = pregunta.verificarRespuesta(respuestaJugador);

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }
}


