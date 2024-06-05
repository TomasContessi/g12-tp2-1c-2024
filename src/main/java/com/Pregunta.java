package com;

import java.util.ArrayList;

public class Pregunta {
    private ArrayList<String> respuestasCorrectas;

    // Contructor
    public Pregunta(ArrayList<String> respuestasCorrectas) {
        this.respuestasCorrectas = respuestasCorrectas;
    }

    public int verificarRespuesta(ArrayList<String> respuestasContestadas) {
        int puntaje = 0;
        for (int i = 0; i < respuestasContestadas.size(); i++){
            if (this.respuestasCorrectas.get(i) == respuestasContestadas.get(i)){
                puntaje = puntaje + 1;
            }
        }
        return puntaje;
    }

    public ArrayList<String> getRespuestas(){
        return this.respuestasCorrectas;
    }
}
