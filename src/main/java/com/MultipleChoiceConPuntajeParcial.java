package com;

import java.util.ArrayList;

public class MultipleChoiceConPuntajeParcial implements Pregunta{
    private ArrayList<Opcion> respuestasCorrectas;

    // Contructor
    public MultipleChoiceConPuntajeParcial(ArrayList<Opcion> respuestasCorrectas) {
        this.respuestasCorrectas = respuestasCorrectas;
    }

    // Método verificarRespuesta
    @Override
    public int verificarRespuesta(ArrayList<Opcion> respuestasContestadas) {
        int puntaje = 0;
        boolean respuestaEstaEnLaLista = false;
        boolean erroUna = false;
        for (int i = 0; i < respuestasContestadas.size(); i++){
            respuestaEstaEnLaLista = false;
            for (int j = 0; j < this.respuestasCorrectas.size(); j++){
                if (this.respuestasCorrectas.get(j).verificar(respuestasContestadas.get(i))){
                    puntaje = puntaje + 1;
                    respuestaEstaEnLaLista = true;
                }
            }
            if (respuestaEstaEnLaLista == false){
                erroUna = true;
            }
        }
        if (erroUna == true){
            puntaje = 0;
        }
        return puntaje;
    } 
}
