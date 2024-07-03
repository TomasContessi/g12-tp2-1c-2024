package com.model.tipo;

import java.util.ArrayList;

import com.model.opcion.Opcion;

public class OrderedChoice extends Tipo {
    @Override
    public boolean respondidoCorrectamente(ArrayList<Opcion> respuestasCorrectas, ArrayList<Opcion> respuestasContestadas) {
        if (respuestasCorrectas.size() != respuestasContestadas.size()){
            return false;
        }
        for (int i = 0; i < respuestasCorrectas.size(); i++){
            if (respuestasCorrectas.get(i).verificar(respuestasContestadas.get(i)) == false){
                return false;
            }
        }
        return true;
    } 
}