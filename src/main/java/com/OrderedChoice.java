package com;

import java.util.ArrayList;

public class OrderedChoice implements Pregunta {
    private ArrayList<Opcion> respuestasCorrectas;

    // Contructor
    public OrderedChoice(ArrayList<Opcion> respuestasCorrectas) {
        this.respuestasCorrectas = respuestasCorrectas;
    }

    // Método verificarRespuesta
    @Override
    public int verificarRespuesta(ArrayList<Opcion> respuestasContestadas) {
        int puntaje = 1;
        if (this.respuestasCorrectas.size() != respuestasContestadas.size()){
            return 0;
        }
        for (int i = 0; i < this.respuestasCorrectas.size(); i++){
            if (this.respuestasCorrectas.get(i).verificar(respuestasContestadas.get(i)) == false){
                puntaje = 0;
            }
        }
        return puntaje;
    } 
}