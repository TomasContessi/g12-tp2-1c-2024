package com.model.pregunta;

import java.util.ArrayList;

import com.model.modificador.Multiplicador;
import com.model.modificador.MultiplicadorX1;
import com.model.opcion.Opcion;
import com.model.tipo.Tipo;
import com.model.modificador.Puntaje;

public abstract class Pregunta {
    protected Tipo tipo;
    protected ArrayList<Opcion> respuestaCorrecta;
    protected String tema;
    protected String enunciado;
    protected Multiplicador multiplicador;
    protected ArrayList<Opcion> opciones;

    public Pregunta(Tipo tipo, ArrayList<Opcion> respuestaCorrecta) {
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

    public String getEnunciado() {
        return this.enunciado;
    }

    public String getTipo(){
        return this.tipo.toString();
    }

    public String getTema() {
        return this.tema;
    }

    public abstract Puntaje verificarRespuesta(ArrayList<Opcion> respuestaContestada);
}
