package comTP.model.jugador;

import java.util.ArrayList;

import comTP.model.modificador.*;
import comTP.model.pregunta.*;
import comTP.model.opcion.*;

public class Jugador {
    private final String nombre;
    private Puntaje puntaje;
    private ArrayList<Multiplicador> multiplicadores;
    private Exclusividad exclusividad;
    private final Respuesta respuesta;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntaje = new Puntaje(0);
        this.multiplicadores = new ArrayList<>();
        this.exclusividad = new Exclusividad();
        this.respuesta = new Respuesta();
    }

    public void cambiarRespuesta() {
        respuesta.eliminarOpciones();
    }

    public void agregarOpcion(Pregunta pregunta, int numeroOpcion) {
        pregunta.setearRespuestaJugador(respuesta, numeroOpcion);
    }

    public String getNombre() {
        return nombre;
    }

    public Respuesta getRespuesta(){
        return this.respuesta;
    }


    public void asignarPuntos(Puntaje puntos){
        this.puntaje.sumarseCon(puntos);
    }

    public Puntaje getPuntos(){
        return this.puntaje;
    }




//    public void elegirOpcion(int opcionElegida){
//        this.opcionElegida = (opcionElegida-1);
//    }
//
//    public int opcionesElegidas(){
//        return respuesta.size();
//    }
//    public void asignarPuntos(int puntos){
//        this.puntos += puntos;
//    }
//
//    public int getPuntos(){
//        return this.puntos;
//    }
//
//    public String getNombre(){
//        return this.nombre;
//    }
}
