package com;

import java.util.ArrayList;

// Para no tener que cambiar las otras clases se verifica un grupo solo entendiendose que el otro grupo va a ser lo que queda, asi que si se hace bien uno, se hacen bien los dos y viceversa

public class GroupChoice implements Pregunta {
    private ArrayList<Opcion> grupoCorrecto;


    // Contructor
    public GroupChoice(ArrayList<Opcion> grupoCorrecto) {
        this.grupoCorrecto = grupoCorrecto;
    }

    // Método verificarRespuesta
    @Override
    public int verificarRespuesta(ArrayList<Opcion> grupoContestadas) {
        int puntaje = 0;
        boolean respuestaEstaEnLaLista = false;
        boolean erroUna = false;
        for (int i = 0; i < grupoContestadas.size(); i++){
            respuestaEstaEnLaLista = false;
            for (int j = 0; j < this.grupoCorrecto.size(); j++){
                if (this.grupoCorrecto.get(j).verificar(grupoContestadas.get(i))){
                    respuestaEstaEnLaLista = true;
                }
            }
            if (respuestaEstaEnLaLista == false){
                erroUna = true;
            }
        }
        if (erroUna == true){
            puntaje = 0;
        }else{
            puntaje = 1;
        }
        return puntaje;
    } 
}