package com;

import java.util.ArrayList;

public class OrderedChoice implements Tipo {
    // Método verificarRespuesta
    @Override
    public int verificarRespuesta(ArrayList<Opcion> respuestasCorrectas, ArrayList<Opcion> respuestasContestadas) {
        int puntaje = 1;
        if (respuestasCorrectas.size() != respuestasContestadas.size()){
            return 0;
        }
        for (int i = 0; i < respuestasCorrectas.size(); i++){
            if (respuestasCorrectas.get(i).verificar(respuestasContestadas.get(i)) == false){
                puntaje = 0;
            }
        }
        return puntaje;
    } 
}