package com.model.tipo;

import java.util.ArrayList;

import com.model.opcion.Opcion;

public interface Tipo {
    public int verificarRespuesta(ArrayList<Opcion> respuestasCorrectas, ArrayList<Opcion> respuestasContestadas);
}
