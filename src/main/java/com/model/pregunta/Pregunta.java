package com.model.pregunta;

import java.util.ArrayList;

import com.model.modificador.*;
import com.model.opcion.Opcion;
import com.model.tipo.Tipo;

public abstract class Pregunta {
    protected Tipo tipo;
    protected ArrayList<Opcion> respuestaCorrecta;
    protected String tema;
    protected String enunciado;
    protected Multiplicador multiplicador;
    protected ArrayList<Opcion> opciones;
    private int numeroOpcion;

    public Pregunta(Tipo tipo, ArrayList<Opcion> respuestaCorrecta) {
        this.numeroOpcion = 0;
        this.tipo = tipo;
        this.respuestaCorrecta = respuestaCorrecta;
        this.multiplicador = new MultiplicadorX1();
    }
    
    public Pregunta(Tipo tipo, ArrayList<Opcion> respuestaCorrecta, String enunciado, ArrayList<Opcion> opciones, String tema) {
        this.tipo = tipo;
        this.respuestaCorrecta = respuestaCorrecta;
        this.multiplicador = new MultiplicadorX1();
        this.enunciado = enunciado;
        this.opciones = opciones;
        this.tema = tema;
    }
    
    public void setMultiplicador(Multiplicador multiplicador) {
        this.multiplicador = multiplicador;
    }

    public Opcion getOpcion(int numero) {
        return opciones.get(numero);
    }

    public Opcion mostrarOpcion() {
        Opcion opcionActual = null;
        if(numeroOpcion < opciones.size())  {
            opcionActual = opciones.get(numeroOpcion);
        }
        numeroOpcion++;
        return opcionActual;
    }

    public void setearRespuestaJugador(ArrayList<Opcion> respuestaJugador, int numeroOpcion) {
        respuestaJugador.add(this.opciones.get(numeroOpcion - 1));
    }

    public String getEnunciado() {
        return this.enunciado;
    }

    public String getTipo(){
        return this.tipo.toString();
    }

    public String getTema() {
        return this.tema;
    }

    public abstract int verificarRespuesta(ArrayList<Opcion> respuestaContestada);
}
