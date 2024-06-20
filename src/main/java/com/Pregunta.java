package com;

import java.util.ArrayList;

public class Pregunta {
    Tipo tipo;
    ArrayList<Opcion> respuestaCorrecta;
    String enunciado;
    Multiplicador multiplicador;
    ArrayList<Opcion> opciones;
    
    public Pregunta(Tipo tipo, ArrayList<Opcion> respuestaCorrecta) {
        this.tipo = tipo;
        this.respuestaCorrecta = respuestaCorrecta;
        this.multiplicador = new MultiplicadorX1();
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public void setMultiplicador(Multiplicador multiplicador) {
        this.multiplicador = multiplicador;
    }

    public String getEnunciado() {
        return this.enunciado;
    }

    public int verificarRespuesta(ArrayList<Opcion> respuesta){
        return multiplicador.multiplicar(tipo.verificarRespuesta(respuestaCorrecta, respuesta));
    }
}
