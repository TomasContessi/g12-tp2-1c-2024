package com;

import java.util.ArrayList;

public class MultipleChoiceConPenalidad implements Pregunta{
    private ArrayList<Opcion> respuestasCorrectas;

    // Constructor 
    public MultipleChoiceConPenalidad(ArrayList<Opcion> respuestasCorrectas) {
        this.respuestasCorrectas = respuestasCorrectas;
    }

    // Método verificarRespuesta
    @Override
    public int verificarRespuesta(ArrayList<Opcion> respuestasContestadas) {
        int puntaje = 0;
        for (int i = 0; i < respuestasContestadas.size(); i++) {
            if (this.respuestasCorrectas.get(i).verificar(respuestasContestadas.get(i))) {
                puntaje = puntaje + 1;
            } else {
                puntaje = puntaje - 1;
            }
        }
        return puntaje;
    }
}
