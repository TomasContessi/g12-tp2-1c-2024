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
    private final Map<Jugador, Puntaje> puntajeJugadores;
    int jugadorActual;

    public Juego() {
        this.jugadores = new ArrayList<>();
        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";
        JsonLoader jsonLoader = new JsonLoader(filePath);
        this.diccionarioPreguntas = new DiccionarioPreguntas(jsonLoader);
        this.puntajeJugadores = new HashMap<>();
        jugadorActual = 0;
    }

    public void agregarJugador(Jugador jugador){
        this.jugadores.add(jugador);
    }

    public void setearPreguntas() {
        diccionarioPreguntas.asignarPreguntasPorTema();
    }

    public Pregunta obtenerPregunta() {
        return diccionarioPreguntas.getPregunta();
    }

    public Jugador getJugadorActual() {
        if(!jugadores.isEmpty()) {
            return jugadores.get(jugadorActual);
        }
        return null;
    }

    public Jugador cambiarJugador() {
        if(jugadorActual < jugadores.size()) {
            jugadorActual++;
        }
        return jugadores.get(jugadorActual);
    }



    public boolean ultimoJugador() {
        return jugadorActual == (jugadores.size() - 1);
    }

    public void reiniciarJugadorActual() {
        jugadorActual = 0;
    }

//    public void setearRespuestaJugador(Jugador jugador, Pregunta pregunta, int opcion){
//        jugador.agregarOpcion(pregunta, opcion);
//    }

    public void agregarPuntaje(Jugador jugador, Puntaje puntaje){
        this.puntajeJugadores.put(jugador, puntaje);
    }

    public Puntaje verificarRespuestaJugador(Jugador jugador, Pregunta pregunta){
        return pregunta.verificarRespuesta(jugador.getRespuesta());
    }

    public void asignarPuntajeJugador(Jugador jugador, Puntaje puntaje){
        jugador.asignarPuntos(puntaje);
    }




//    public boolean cargarSiguientePregunta(){
//        ArrayList<String> temasRestantes;
//        ArrayList<String> temasPosibles;
//        boolean aunQuedanPreguntas = true;
//        Random rand = new Random();
//        int numeroDeTemas;
//        int numeroRandom;
//
//        temasRestantes = this.diccionarioPreguntas.obtenerTemas();
//        if (temasRestantes.size() == 0) {
//            aunQuedanPreguntas = false;
//            return aunQuedanPreguntas;
//        }
//
//        temasPosibles = this.diccionarioPreguntas.obtenerTemas();
//        temasPosibles.remove(this.ultimaTematica);
//        numeroDeTemas = temasPosibles.size();
//        if (numeroDeTemas == 0) {
//            this.preguntaTurno = this.diccionarioPreguntas.obtenerPregunta(ultimaTematica);
//        }else{
//            numeroRandom = rand.nextInt(numeroDeTemas);
//            this.preguntaTurno = this.diccionarioPreguntas.obtenerPregunta(temasPosibles.get(numeroRandom));
//        }
//
//        this.ultimaTematica = this.preguntaTurno.getTema();
//        return aunQuedanPreguntas;
//    }

//    public void setPath(String preguntasPath){
//    this.preguntasPath = preguntasPath;
//}
//
//    public void cargarDiccionarioPreguntas(DiccionarioPreguntas diccionarioPreguntas){
//        this.diccionarioPreguntas = diccionarioPreguntas;
//        this.diccionarioPreguntas.asignarPreguntasPorTema(this.preguntasPath);
//        this.ultimaTematica = this.diccionarioPreguntas.obtenerTemas().getLast();
//    }
//
//    public boolean siguienteTurno(){
//        boolean quedanTurnos = true;
//        quedanTurnos = this.cargarSiguientePregunta();
//        if (quedanTurnos) {
//            for(int i = 0; i < this.jugadores.size(); i++){
//                this.jugadores.get(i).responderPregunta();
//            }
//        }
//        return quedanTurnos;
//    }
}
