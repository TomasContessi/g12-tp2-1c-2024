package comTP;

import comTP.model.modificador.Puntaje;
import comTP.model.opcion.*;
import comTP.model.pregunta.*;
import comTP.model.tipo.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VerdaderoFalsoConPenalidadTest {
    @Test
    public void test01SeRespondeCorrectamenteUnaPreguntaVerdaderoFalsoConPenalidad() {
        //Arrange
        Puntaje puntajeEsperado = new Puntaje(1);
        Opcion opcion1 = new Opcion("Verdadero");
        Opcion opcion2 = new Opcion("Falso");
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(opcion1);
        opciones.add(opcion2);
        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcion1);
        Respuesta respuestaCorrecta = new Respuesta(opcionesCorrectas);
        Tipo tipoPregunta = new VerdaderoFalso();
        Pregunta pregunta = new PreguntaConPenalidad(tipoPregunta, respuestaCorrecta);
        Respuesta respuestaJugador = new Respuesta();
        respuestaJugador.agregarOpcion(opcion1);

        //Act
        Puntaje puntajeObtenido = pregunta.verificarRespuesta(respuestaJugador);

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

    @Test
    public void test02SeRespondeIncorrectamenteUnaPreguntaVerdaderoFalsoConPenalidad() {
        //Arrange
        Puntaje puntajeEsperado = new Puntaje(-1);
        Opcion opcion1 = new Opcion("Verdadero");
        Opcion opcion2 = new Opcion("Falso");
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(opcion1);
        opciones.add(opcion2);
        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcion1);
        Respuesta respuestaCorrecta = new Respuesta(opcionesCorrectas);
        Tipo tipoPregunta = new VerdaderoFalso();
        Pregunta pregunta = new PreguntaConPenalidad(tipoPregunta, respuestaCorrecta);
        Respuesta respuestaJugador = new Respuesta();
        respuestaJugador.agregarOpcion(opcion2);

        //Act
        Puntaje puntajeObtenido = pregunta.verificarRespuesta(respuestaJugador);

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }
}
