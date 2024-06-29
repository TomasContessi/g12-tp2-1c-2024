package com.model.tipo;

import java.util.ArrayList;

import com.model.opcion.Opcion;

public abstract class Tipo {
    protected int opcionesAcertadas;
    protected int opcionesErradas;

    public abstract boolean respondidoCorrectamente(ArrayList<Opcion> respuestasCorrectas, ArrayList<Opcion> respuestasContestadas);

    public int opcionesAcertadas() {
        return opcionesAcertadas;
    }

    public int opcionesErradas() {
        return opcionesErradas;
    }
} 
