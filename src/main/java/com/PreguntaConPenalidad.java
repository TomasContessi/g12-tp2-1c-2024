package com;

import java.util.ArrayList;

public class PreguntaConPenalidad extends Pregunta{
    // Constructor que llama al constructor de la clase base
    public PreguntaConPenalidad(ArrayList<String> respuestasCorrectas) {
        super(respuestasCorrectas);
    }

    // Sobrescribir el método verificarRespuesta
    @Override
    public int verificarRespuesta(ArrayList<String> respuestasContestadas) {
        int puntaje = 0;
        for (int i = 0; i < respuestasContestadas.size(); i++) {
            if (this.getRespuestas().get(i) == respuestasContestadas.get(i)) {
                puntaje = puntaje + 1;
            } else {
                puntaje = puntaje - 1;
            }
        }
        return puntaje;
    }
}
