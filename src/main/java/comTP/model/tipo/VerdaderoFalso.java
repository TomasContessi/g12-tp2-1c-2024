package comTP.model.tipo;

import java.util.ArrayList;

import comTP.model.modificador.Puntaje;
import comTP.model.opcion.Opcion;

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
    

