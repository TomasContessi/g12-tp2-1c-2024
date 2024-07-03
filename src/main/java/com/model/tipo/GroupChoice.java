package com.model.tipo;

import java.util.ArrayList;

import com.model.opcion.Opcion;

// Para no tener que cambiar las otras clases se verifica un grupo solo entendiendose que el otro grupo va a ser lo que queda, asi que si se hace bien uno, se hacen bien los dos y viceversa

public class GroupChoice extends Tipo {
    private String grupoATitulo;
    private String grupoBTitulo;
    
    public  GroupChoice(String grupoA, String grupoB){
        this.grupoATitulo = grupoA;
        this.grupoBTitulo = grupoB;
    };

    @Override
    public boolean respondidoCorrectamente(ArrayList<Opcion> respuestasCorrectas, ArrayList<Opcion> respuestasContestadas) {
        boolean respuestaEstaEnLaLista = false;
        boolean erroAlguna = false;
        for (int i = 0; i < respuestasContestadas.size(); i++){
            respuestaEstaEnLaLista = false;
            for (int j = 0; j < respuestasCorrectas.size(); j++){
                if (respuestasCorrectas.get(j).verificar(respuestasContestadas.get(i))){
                    this.opcionesAcertadas++;
                    respuestaEstaEnLaLista = true;
                }
            }
            if (respuestaEstaEnLaLista == false){
                this.opcionesErradas++;
                erroAlguna = true;
            }
        }
        if (erroAlguna == true){
            return false;
        }
        else return true;
    } 

    public String getTituloGrupoA(){
        return this.grupoATitulo;
    };

    public String getTituloGrupoB(){
        return this.grupoBTitulo;
    };
}