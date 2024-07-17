package com.model.tipo;

import java.util.ArrayList;

import com.model.modificador.Puntaje;
import com.model.opcion.Opcion;

public class MultipleChoice extends Tipo {
    @Override
    public boolean respondidoCorrectamente(ArrayList<Opcion> respuestasCorrectas, ArrayList<Opcion> respuestasContestadas) {
        boolean respuestaEstaEnLaLista = false;
        boolean erroAlguna = false;
        for (int i = 0; i < respuestasContestadas.size(); i++) {
            respuestaEstaEnLaLista = false; 
            for (int j = 0; j < respuestasCorrectas.size(); j++) {
                if (respuestasCorrectas.get(j).verificar(respuestasContestadas.get(i))) {
                    this.opcionesAcertadas =  this.opcionesAcertadas.sumarseCon(new Puntaje(1));
                    respuestaEstaEnLaLista = true;
                }
            }
            if (respuestaEstaEnLaLista == false){
                this.opcionesErradas = this.opcionesErradas.sumarseCon(new Puntaje(1));
                erroAlguna = true;
            }
        }
        if (erroAlguna == true /*|| (respuestasContestadas.size() != respuestasCorrectas.size())*/) {
            return false;
        }
        else return true;
    } 
}
