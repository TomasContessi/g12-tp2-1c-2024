package com;

import java.util.ArrayList;

public class MultipleChoiceSinPenalidad implements Pregunta {
    private ArrayList<Opcion> respuestasCorrectas;

    // Contructor
    public MultipleChoiceSinPenalidad(ArrayList<Opcion> respuestasCorrectas) {
        this.respuestasCorrectas = respuestasCorrectas;
    }

    // Método verificarRespuesta
    @Override
    public int verificarRespuesta(ArrayList<Opcion> respuestasContestadas) {
        int puntaje = 0;
        for (int i = 0; i < this.respuestasCorrectas.size(); i++){
            for (int j = 0; j < respuestasContestadas.size(); j++){
                if (this.respuestasCorrectas.get(i).verificar(respuestasContestadas.get(j))){
                    puntaje = puntaje + 1;
                }
            }
        }
        return puntaje;
    } 
}
