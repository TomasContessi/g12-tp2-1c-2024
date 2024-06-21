package com;

import java.util.ArrayList;

public class MultipleChoiceConPuntajeParcial implements Tipo{
    // Método verificarRespuesta
    @Override
    public int verificarRespuesta(ArrayList<Opcion> respuestasCorrectas, ArrayList<Opcion> respuestasContestadas) {
        int puntaje = 0;
        boolean respuestaEstaEnLaLista = false;
        boolean erroUna = false;
        for (int i = 0; i < respuestasContestadas.size(); i++){
            respuestaEstaEnLaLista = false;
            for (int j = 0; j < respuestasCorrectas.size(); j++){
                if (respuestasCorrectas.get(j).verificar(respuestasContestadas.get(i))){
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
