package comTP.model.jugador;

import comTP.model.modificador.*;
import comTP.model.pregunta.*;
import comTP.model.opcion.*;

public class Jugador {
    private final String nombre;
    private Puntaje puntaje;
    private final Respuesta respuesta;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntaje = new Puntaje(0);
        this.respuesta = new Respuesta();
    }

    public void cambiarRespuesta() {
        respuesta.eliminarOpciones();
    }

    public void agregarOpcion(Pregunta pregunta, int numeroOpcion) {
        pregunta.setearRespuestaJugador(respuesta, numeroOpcion);
    }

    public void usarMultiplicador(Pregunta pregunta, Multiplicador multiplicador) {
        pregunta.setMultiplicador(multiplicador);
    }

    public String getNombre() {
        return nombre;
    }

    public Respuesta getRespuesta(){
        return this.respuesta;
    }

    public void asignarPuntos(Puntaje puntaje){
        this.puntaje = this.puntaje.sumarseCon(puntaje);
    }

    public Puntaje getPuntos(){
        return this.puntaje;
    }
}
