package com.model.tipo;

import java.util.ArrayList;

import com.model.modificador.Puntaje;
import com.model.opcion.Opcion;

public class VerdaderoFalso extends Tipo {
    @Override
    public boolean respondidoCorrectamente(ArrayList<Opcion> respuestaJugador, ArrayList<Opcion> respuestaCorrecta) {
        if(respuestaCorrecta.get(0).equals(respuestaJugador.get(0))){
            this.opcionesAcertadas = this.opcionesAcertadas.sumarseCon(new Puntaje(1));
            return true;
        }
        else {
            this.opcionesErradas = this.opcionesAcertadas.sumarseCon(new Puntaje(1));
            return false;
        }
    }
}
    

