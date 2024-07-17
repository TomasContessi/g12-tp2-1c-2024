package comTP.model.tipo;

import java.util.ArrayList;

import comTP.model.opcion.Opcion;
import comTP.model.modificador.Puntaje;

public abstract class Tipo {
    protected Puntaje opcionesAcertadas = new Puntaje(0);
    protected Puntaje opcionesErradas  = new Puntaje(0);

    public abstract boolean respondidoCorrectamente(ArrayList<Opcion> respuestasCorrectas, ArrayList<Opcion> respuestasContestadas);

    public Puntaje opcionesAcertadas() {
        return opcionesAcertadas;
    }

    public Puntaje opcionesErradas() {
        return opcionesErradas;
    }
} 
