package comTP.model.juego;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import comTP.model.jugador.Jugador;
import comTP.model.loader.JsonLoader;
import comTP.model.modificador.Puntaje;
import comTP.model.pregunta.*;

public class Juego  {
    private final ArrayList<Jugador> jugadores;
    private final DiccionarioPreguntas diccionarioPreguntas;
    private final Map<Jugador, Puntaje> jugadoresYPuntaje;
    private final JsonLoader jsonLoader;
    int jugadorActual;

    public Juego() {
        this.jugadores = new ArrayList<>();
        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";
        this.jsonLoader = new JsonLoader(filePath);
        this.diccionarioPreguntas = new DiccionarioPreguntas();
        this.jugadoresYPuntaje = new HashMap<>();
        jugadorActual = 0;
    }

    public void agregarJugador(Jugador jugador){
        this.jugadores.add(jugador);
    }

    public boolean listaJugadoresVacia() {
        return jugadores.isEmpty();
    }

    public void verificarArrayJugadores() throws ListaJugadoresVaciaException {
        if(listaJugadoresVacia()) {
            throw new ListaJugadoresVaciaException();
        }
    }

    public void setearPreguntas() {
        diccionarioPreguntas.asignarPreguntasPorTema(jsonLoader);
    }

    public Pregunta obtenerPregunta() {
        return diccionarioPreguntas.getPregunta();
    }

    public Jugador getJugadorActual() {
        Jugador jugador = null;
        if(jugadorActual < jugadores.size()) {
            jugador = jugadores.get(jugadorActual);
            jugadorActual++;
        }
        return jugador;
    }

    public boolean ultimoJugador() {
        return jugadorActual == jugadores.size();
    }

    public void reiniciarJugadorActual() {
        jugadorActual = 0;
    }

    public void agregarPuntaje(Jugador jugador, Puntaje puntaje){
        this.jugadoresYPuntaje.put(jugador, puntaje);
    }

    public void verificarRespuestaJugador(Jugador jugador, Pregunta pregunta) {
        Puntaje puntaje = pregunta.verificarRespuesta(jugador.getRespuesta());
        this.agregarPuntaje(jugador, puntaje);
    }

    public void asignarPuntajeJugadores() {
        for(Map.Entry<Jugador, Puntaje> entry: jugadoresYPuntaje.entrySet()) {
            Jugador jugador = entry.getKey();
            Puntaje puntaje = entry.getValue();
            jugador.asignarPuntos(puntaje);
        }
    }

    public Iterable<Map.Entry<Jugador, Puntaje>> iterableJugadorPuntajes() {
        return jugadoresYPuntaje.entrySet();
    }

    public void resetearRespuestasJugadores() {
        for(Jugador jugador : jugadores) {
            jugador.cambiarRespuesta();
        }
    }

    public boolean ultimaPregunta() {
        return diccionarioPreguntas.ultimaPregunta();
    }
}
