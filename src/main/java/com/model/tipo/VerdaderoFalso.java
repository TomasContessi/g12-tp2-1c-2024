package com.model.tipo;

import java.util.ArrayList;

import com.model.opcion.Opcion;

public class VerdaderoFalso implements Tipo{
    @Override
    public int verificarRespuesta(ArrayList<Opcion> respuestaJugador, ArrayList<Opcion> respuestaCorrecta) {

        int puntaje = 0;

        if(respuestaCorrecta.get(0).equals(respuestaJugador.get(0))){
            puntaje = puntaje + 1;
        }
        return puntaje;
        
    }
}
    

