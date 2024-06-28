package com.model.pregunta;

import java.util.ArrayList;

import com.model.modificador.Multiplicador;
import com.model.modificador.MultiplicadorX1;
import com.model.opcion.Opcion;
import com.model.tipo.Tipo;

public class Pregunta {
    Tipo tipo;
    ArrayList<Opcion> respuestaCorrecta;
    String tema;
    String enunciado;
    Multiplicador multiplicador;
    ArrayList<Opcion> opciones;
    
    public Pregunta(Tipo tipo, ArrayList<Opcion> respuestaCorrecta, String enunciado, ArrayList<Opcion> opciones, String tema) {
        this.tipo = tipo;
        this.respuestaCorrecta = respuestaCorrecta;
        this.multiplicador = new MultiplicadorX1();
        this.enunciado = enunciado;
        this.opciones = opciones;
        this.tema = tema;
    }
    /*  yo lo sacaria
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    */
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

    public int verificarRespuesta(ArrayList<Opcion> respuesta){
        return multiplicador.multiplicar(tipo.verificarRespuesta(respuestaCorrecta, respuesta));
    }
}
