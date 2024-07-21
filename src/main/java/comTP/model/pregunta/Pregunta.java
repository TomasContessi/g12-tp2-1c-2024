package comTP.model.pregunta;

import java.util.ArrayList;
import comTP.model.modificador.*;
import comTP.model.opcion.*;
import comTP.model.tipo.*;

public abstract class Pregunta {
    protected Tipo tipo;
    protected String tema;
    protected String tipoPregunta;
    protected String enunciado;
    protected Respuesta respuestaCorrecta;
    protected Multiplicador multiplicador;
    protected ArrayList<Opcion> opciones;
    protected String textoRespuesta;
    protected int numeroOpcion;

    public Pregunta(Tipo tipo, Respuesta respuestaCorrecta) {
        this.tipo = tipo;
        this.respuestaCorrecta = respuestaCorrecta;
        this.multiplicador = new MultiplicadorX1();
        this.numeroOpcion = 0;
    }
    
    public Pregunta(Tipo tipo, Respuesta respuestaCorrecta, String enunciado,
                    String tipoPregunta, ArrayList<Opcion> opciones, String tema, String textoRespuesta) {
        this.tipo = tipo;
        this.respuestaCorrecta = respuestaCorrecta;
        this.multiplicador = new MultiplicadorX1();
        this.enunciado = enunciado;
        this.tipoPregunta = tipoPregunta;
        this.opciones = opciones;
        this.tema = tema;
        this.textoRespuesta = textoRespuesta;
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

    public String getTema() {
        return tema;
    }

    public String getTipoPregunta() {
        return tipoPregunta;
    }

    public String getTextoRespuesta() {
        return textoRespuesta;
    }

    public Respuesta getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public abstract boolean tienePenalidad();

    public abstract Puntaje verificarRespuesta(Respuesta respuestaJugador);
}
