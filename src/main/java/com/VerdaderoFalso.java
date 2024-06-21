package com;

import java.util.ArrayList;

public class VerdaderoFalso implements Tipo{
    @Override
    public int verificarRespuesta(ArrayList<Opcion> respuestaJugador, ArrayList<Opcion> respuestaCorrecta) {

        int puntaje = 0;

        if(respuestaCorrecta.getFirst().equals(respuestaJugador.getFirst())){
            puntaje = puntaje + 1;
        }
        return puntaje;
        
    }
}
    

