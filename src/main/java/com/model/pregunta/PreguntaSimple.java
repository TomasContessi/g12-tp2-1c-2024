package com.model.pregunta;

import java.util.ArrayList;

import com.model.opcion.Opcion;
import com.model.tipo.Tipo;

public class PreguntaSimple extends Pregunta {
    public PreguntaSimple(Tipo tipo, ArrayList<Opcion> respuestaCorrecta) {
        super(tipo, respuestaCorrecta);
    }

    public PreguntaSimple(Tipo tipo, ArrayList<Opcion> respuestaCorrecta, String enunciado, ArrayList<Opcion> opciones, String tema) {
        super(tipo, respuestaCorrecta, enunciado, opciones, tema);
    }

    @Override
    public int verificarRespuesta(ArrayList<Opcion> respuestaContestada) {
        int puntaje = 0;
        if(tipo.respondidoCorrectamente(this.respuestaCorrecta, respuestaContestada)) {
            puntaje += 1;
        }
        return this.multiplicador.multiplicar(puntaje);
    }
}
