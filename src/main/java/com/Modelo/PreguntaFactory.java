package com.Modelo;

public interface PreguntaFactory {
    public Pregunta crearPregunta(Respuesta respuestaCorrecta);

    // public Pregunta crearPregunta(String tipo, Respuesta respuestaCorrecta);
}
