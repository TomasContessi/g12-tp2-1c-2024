package com.model.tipo;

import java.util.ArrayList;

import com.model.opcion.Opcion;

// Para no tener que cambiar las otras clases se verifica un grupo solo entendiendose que el otro grupo va a ser lo que queda, asi que si se hace bien uno, se hacen bien los dos y viceversa

public class GroupChoice implements Tipo {
    private String grupoATitulo;
    private String grupoBTitulo;
    
    public  GroupChoice(String grupoa, String grupob){
        this.grupoATitulo = grupoa;
        this.grupoBTitulo = grupob;
    };

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

    public String getTituloGrupoA(){
        return this.grupoATitulo;
    };

    public String getTituloGrupoB(){
        return this.grupoBTitulo;
    };
}