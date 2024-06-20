package com.Modelo;

public abstract class Pregunta {
    TipoPregunta tipo;
    Respuesta respuestaCorrecta;
    CalculoPuntaje calculoPuntaje;
    String enunciado;
    

    public Pregunta() {
        respuestaCorrecta = null;
    }

    public Pregunta(Respuesta respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public Pregunta(TipoPregunta tipo, Respuesta respuestaCorrecta) {
        this.tipo = tipo;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getEnunciado() {
        return this.enunciado;
    }

    public abstract void verificarRespuesta(Respuesta respuesta, Jugador jugador);
}
