package com.model.tipo;

import java.util.ArrayList;

import com.model.opcion.Opcion;

public class MultipleChoiceConPenalidad implements Tipo{

    // Método verificarRespuesta
    @Override
    public int verificarRespuesta(ArrayList<Opcion> respuestasCorrectas, ArrayList<Opcion> respuestasContestadas) {
        int puntaje = 0;
        boolean respuestaEstaEnLaLista = false;
        for (int i = 0; i < respuestasCorrectas.size(); i++){
            respuestaEstaEnLaLista = false;
            for (int j = 0; j < respuestasContestadas.size(); j++){
                if (respuestasCorrectas.get(i).verificar(respuestasContestadas.get(j))){
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
