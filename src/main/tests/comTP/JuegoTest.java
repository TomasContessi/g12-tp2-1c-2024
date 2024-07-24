package comTP;

import comTP.model.juego.Juego;
import comTP.model.juego.ListaJugadoresVaciaException;
import comTP.model.jugador.Jugador;
import comTP.model.modificador.MultiplicadorX3;
import comTP.model.modificador.Puntaje;
import comTP.model.pregunta.Pregunta;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JuegoTest {
    @Test
    public void test01AgregoUnJugadorCorrectameteAlJuego() {
        //Arrange
        Jugador jugador = new Jugador("Juan");
        Juego juego = new Juego();

        //Act
        juego.agregarJugador(jugador);
        boolean listaEsperadaNoEstaVacia = juego.listaJugadoresVacia();

        //Assert
        assertFalse(listaEsperadaNoEstaVacia);
    }

    @Test
    public void test02ObtengoUnaPreguntaCorrectamente() {
        //Arrange
        Juego juego = new Juego();

        //Act
        juego.setearPreguntas();
        Pregunta preguntaObtenida;
        preguntaObtenida = juego.obtenerPregunta();

        //Assert
        assertNotNull(preguntaObtenida);
    }

    @Test
    public void test03ObtengoElJugadorActualCorrectamente() {
        //Arrange
        Jugador jugador1 = new Jugador("Juan");
        Jugador jugador2 = new Jugador("Joani");
        Jugador jugadorEsperado = new Jugador("Gonzalo");
        Juego juego = new Juego();

        //Act
        juego.agregarJugador(jugador1);
        juego.agregarJugador(jugador2);
        juego.agregarJugador(jugadorEsperado);
        juego.getJugadorActual();
        juego.getJugadorActual();
        Jugador jugadorObtenido = juego.getJugadorActual();

        //Assert
        assertEquals(jugadorEsperado, jugadorObtenido);
    }

    @Test
    public void test04UnJugadorContestaCorrectamenteUnaPregunta() {
        //Arrange
        Jugador jugador = new Jugador("Juan");
        Juego juego = new Juego();

        //Act
        juego.agregarJugador(jugador);
        juego.setearPreguntas();
        Pregunta pregunta = juego.obtenerPregunta();
        jugador.agregarOpcion(pregunta , 2);
        jugador.agregarOpcion(pregunta , 5);
        juego.verificarRespuestaJugador(jugador,pregunta);
        juego.asignarPuntajeJugadores();
        Puntaje puntajeObtido = jugador.getPuntos();

        //Assert
        assertNotNull(puntajeObtido);
    }

    @Test
    public void test05UnJugadorContestaBienYOtroJugadorContestaMalUnaPregunta() {
        //Arrange
        Juego juego = new Juego();
        Puntaje puntajeEsperado = new Puntaje(1);

        //Act
        juego.agregarJugador(new Jugador("Juan"));
        juego.agregarJugador( new Jugador("Jorge"));
        juego.setearPreguntas();
        Pregunta pregunta = juego.obtenerPregunta();
        Jugador jugadorActual;

        jugadorActual = juego.getJugadorActual();
        jugadorActual.agregarOpcion(pregunta , 2);
        jugadorActual.agregarOpcion(pregunta , 5);
        juego.verificarRespuestaJugador(jugadorActual,pregunta);

        jugadorActual = juego.getJugadorActual();
        jugadorActual.agregarOpcion(pregunta , 1);
        jugadorActual.agregarOpcion(pregunta , 3);
        juego.verificarRespuestaJugador(jugadorActual,pregunta);

        juego.resetearRespuestasJugadores();
        juego.asignarPuntajeJugadores();
        Puntaje puntajeObtido = jugadorActual.getPuntos();

        //Assert
        assertNotEquals(puntajeEsperado, puntajeObtido);
    }

    @Test
    public void test06UnJugadorContestaCorrectamenteDosPreguntas() {
        //Arrange
        Juego juego = new Juego();
        Puntaje puntajeEsperado = new Puntaje(3);

        //Act
        juego.agregarJugador(new Jugador("Juan"));
        juego.setearPreguntas();
        Jugador jugadorActual = juego.getJugadorActual();
        Pregunta pregunta;

        pregunta = juego.obtenerPregunta();
        jugadorActual.agregarOpcion(pregunta , 2);
        jugadorActual.agregarOpcion(pregunta , 5);
        juego.verificarRespuestaJugador(jugadorActual, pregunta);
        juego.resetearRespuestasJugadores();
        juego.asignarPuntajeJugadores();

        pregunta = juego.obtenerPregunta();
        jugadorActual.agregarOpcion(pregunta , 3);
        jugadorActual.agregarOpcion(pregunta , 4);
        juego.verificarRespuestaJugador(jugadorActual, pregunta);
        juego.resetearRespuestasJugadores();
        juego.asignarPuntajeJugadores();

        Puntaje puntajeObtido = jugadorActual.getPuntos();

        //Assert
        assertEquals(puntajeEsperado, puntajeObtido);
    }

    @Test
    public void test07DosJugadoresContestanDosPreguntasCorrectamente() {
        //Arrange
        Juego juego = new Juego();
        Puntaje puntajeEsperado1 = new Puntaje(3);
        Puntaje puntajeEsperado2 = new Puntaje(3);

        //Act
        juego.agregarJugador(new Jugador("Juan"));
        juego.agregarJugador(new Jugador("Jorge"));
        juego.setearPreguntas();
        Jugador jugadorActual = juego.getJugadorActual();
        Pregunta pregunta;

        pregunta = juego.obtenerPregunta();
        jugadorActual.agregarOpcion(pregunta , 2);
        jugadorActual.agregarOpcion(pregunta , 5);
        juego.verificarRespuestaJugador(jugadorActual, pregunta);

        jugadorActual = juego.getJugadorActual();
        jugadorActual.agregarOpcion(pregunta , 2);
        jugadorActual.agregarOpcion(pregunta , 5);
        juego.verificarRespuestaJugador(jugadorActual, pregunta);

        juego.resetearRespuestasJugadores();
        juego.asignarPuntajeJugadores();

        pregunta = juego.obtenerPregunta();
        juego.reiniciarJugadorActual();
        jugadorActual = juego.getJugadorActual();
        jugadorActual.agregarOpcion(pregunta , 3);
        jugadorActual.agregarOpcion(pregunta , 4);
        juego.verificarRespuestaJugador(jugadorActual, pregunta);

        jugadorActual = juego.getJugadorActual();
        jugadorActual.agregarOpcion(pregunta , 3);
        jugadorActual.agregarOpcion(pregunta , 4);
        juego.verificarRespuestaJugador(jugadorActual, pregunta);

        juego.resetearRespuestasJugadores();
        juego.asignarPuntajeJugadores();

        juego.reiniciarJugadorActual();
        jugadorActual = juego.getJugadorActual();
        Puntaje puntajeObtenido1 = jugadorActual.getPuntos();
        jugadorActual = juego.getJugadorActual();
        Puntaje puntajeObtenido2 = jugadorActual.getPuntos();

        //Assert
        assertEquals(puntajeEsperado1, puntajeObtenido1);
        assertEquals(puntajeEsperado2, puntajeObtenido2);
    }

    @Test
    public void test08UnJugadorContestaCambiaSuRespuesta() {
        //Arrange
        Juego juego = new Juego();
        Puntaje puntajeEsperado = new Puntaje(1);

        //Act
        juego.agregarJugador(new Jugador("Juan"));
        juego.setearPreguntas();
        Jugador jugadorActual = juego.getJugadorActual();
        Pregunta pregunta;

        pregunta = juego.obtenerPregunta();
        jugadorActual.agregarOpcion(pregunta , 3);
        jugadorActual.agregarOpcion(pregunta , 4);
        jugadorActual.agregarOpcion(pregunta , 5);
        jugadorActual.cambiarRespuesta();
        jugadorActual.agregarOpcion(pregunta , 2);
        jugadorActual.agregarOpcion(pregunta , 5);
        juego.verificarRespuestaJugador(jugadorActual, pregunta);
        juego.resetearRespuestasJugadores();
        juego.asignarPuntajeJugadores();


        Puntaje puntajeObtido = jugadorActual.getPuntos();

        //Assert
        assertEquals(puntajeEsperado, puntajeObtido);
    }

    @Test
    public void test08UnJugadorUsaElMultiplicador() {
        //Arrange
        Juego juego = new Juego();
        Puntaje puntajeEsperado = new Puntaje(6);

        //Act
        juego.agregarJugador(new Jugador("Juan"));
        juego.setearPreguntas();
        Jugador jugadorActual = juego.getJugadorActual();
        Pregunta pregunta;

        juego.obtenerPregunta();
        pregunta = juego.obtenerPregunta();

        jugadorActual.agregarOpcion(pregunta , 3);
        jugadorActual.agregarOpcion(pregunta , 4);
        jugadorActual.usarMultiplicador(pregunta, new MultiplicadorX3());


        juego.verificarRespuestaJugador(jugadorActual, pregunta);
        juego.resetearRespuestasJugadores();
        juego.asignarPuntajeJugadores();


        Puntaje puntajeObtido = jugadorActual.getPuntos();

        //Assert
        assertEquals(puntajeEsperado, puntajeObtido);
    }

    @Test
    public void test010NoSePuedeJugarConListaDeJugadoresVacia() {
        //Arrange
        Juego juego = new Juego();

        //Assert
        assertThrows(ListaJugadoresVaciaException.class,
                juego::verificarArrayJugadores);
    }
}
