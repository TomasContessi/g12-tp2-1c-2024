package comTP.model.juego;

import java.io.File;
import java.util.ArrayList;
import comTP.model.jugador.Jugador;
import comTP.model.loader.JsonLoader;
import comTP.model.pregunta.*;

public class Juego  {
    private final ArrayList<Jugador> jugadores;
    private final DiccionarioPreguntas diccionarioPreguntas;
    int jugadorActual;

    public Juego() {
        this.jugadores = new ArrayList<>();
        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "files" + File.separator + "preguntas.json";
        JsonLoader jsonLoader = new JsonLoader(filePath);
        this.diccionarioPreguntas = new DiccionarioPreguntas(jsonLoader);
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

    public void cambiarJugador() {
        if(jugadorActual < jugadores.size()) {
            jugadorActual++;
        }
    }

    public boolean ultimoJugador() {
        return jugadorActual == (jugadores.size() - 1);
    }

    public void reiniciarJugadorActual() {
        jugadorActual = 0;
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
