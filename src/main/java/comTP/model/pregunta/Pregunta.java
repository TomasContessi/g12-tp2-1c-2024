package comTP.model.pregunta;

import java.util.ArrayList;
import comTP.model.modificador.*;
import comTP.model.opcion.*;
import comTP.model.tipo.*;

public abstract class Pregunta {
    protected Tipo tipo;
    protected String tema;
    protected String enunciado;
    protected Respuesta respuestaCorrecta;
    protected Multiplicador multiplicador;
    protected ArrayList<Opcion> opciones;
    protected int numeroOpcion;

    public Pregunta(Tipo tipo, Respuesta respuestaCorrecta) {
        this.tipo = tipo;
        this.respuestaCorrecta = respuestaCorrecta;
        this.multiplicador = new MultiplicadorX1();
        this.numeroOpcion = 0;
    }
    
    public Pregunta(Tipo tipo, Respuesta respuestaCorrecta, String enunciado,
                    ArrayList<Opcion> opciones, String tema) {
        this.tipo = tipo;
        this.respuestaCorrecta = respuestaCorrecta;
        this.multiplicador = new MultiplicadorX1();
        this.enunciado = enunciado;
        this.opciones = opciones;
        this.tema = tema;
        this.numeroOpcion = 0;
    }
    
    public void setMultiplicador(Multiplicador multiplicador) {
        this.multiplicador = multiplicador;
    }

    public Opcion mostrarOpcion() {
        Opcion opcionActual = null;
        if(numeroOpcion < opciones.size())  {
            opcionActual = opciones.get(numeroOpcion);
        }
        numeroOpcion++;
        return opcionActual;
    }

    public void setearRespuestaJugador(Respuesta respuestaJugador, int numeroOpcion) {
        respuestaJugador.agregarOpcion(opciones.get(numeroOpcion - 1));
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String getTipo(){
        return tipo.toString();
    }

    public String getTema() {
        return tema;
    }

    public Respuesta getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public abstract Puntaje verificarRespuesta(Respuesta respuestaJugador);

    //    public Opcion getOpcion(int numero) {
//        return opciones.get(numero);
//    }
}
