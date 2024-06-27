package com;

import java.util.ArrayList;

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
    

