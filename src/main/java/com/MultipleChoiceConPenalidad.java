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
        boolean respuestaEstaEnLaLista = false;
        for (int i = 0; i < this.respuestasCorrectas.size(); i++){
            respuestaEstaEnLaLista = false;
            for (int j = 0; j < respuestasContestadas.size(); j++){
                if (this.respuestasCorrectas.get(i).verificar(respuestasContestadas.get(j))){
                    puntaje = puntaje + 1;
                    respuestaEstaEnLaLista = true;
                }
            }
            if (respuestaEstaEnLaLista == false){
                puntaje = puntaje - 1;
            }
        }
        return puntaje;
    } 
}
