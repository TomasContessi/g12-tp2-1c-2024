package com.Modelo;

public class PreguntaVerdaderoFalsoFactory implements PreguntaFactory{
    TipoPregunta tipo;

    @Override
    public Pregunta crearPregunta(Respuesta respuestaCorrecta) {
        this.tipo = new VerdaderoFalso();
        return new PreguntaSimple(this.tipo, respuestaCorrecta);
    }

    // @Override
    // public Pregunta crearPregunta(String tipo, Respuesta respuestaCorrecta) {
    //     if(tipo.equals("Verdadero Falso Simple")) {
    //         this.tipo = new VerdaderoFalso();
    //         return new PreguntaSimple(this.tipo, respuestaCorrecta);
    //     }
    //     // else if(tipo.equals("Verdadero Falso Penalidad")) {
    //     //     this.tipo = new VerdaderoFalso();
    //     //     return new 
    //     // }
    //     return null;
    // }
}
