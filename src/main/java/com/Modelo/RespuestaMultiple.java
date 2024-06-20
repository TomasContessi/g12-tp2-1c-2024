package com.Modelo;

import java.util.ArrayList;
import java.util.Objects;

public class RespuestaMultiple implements Respuesta {
    ArrayList<Integer> opciones;

    public RespuestaMultiple() {
        this.opciones = null;
    }

    public RespuestaMultiple(ArrayList<Integer> opciones) {
        this.opciones = opciones;
    }

    public ArrayList<Integer> getOpciones() {
        return this.opciones;
    }

    @Override
    public Respuesta getRespuesta() {
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof RespuestaMultiple)) return false;
        RespuestaMultiple otraRespuestaMultiple = (RespuestaMultiple) obj;
        //return otraRespuestaMultiple.getOpciones().containsAll(this.opciones);
        return this.opciones.equals(otraRespuestaMultiple.getOpciones());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.opciones);
    }

    public int cantidadDeElementosCoincidentes(Object obj) {
        RespuestaMultiple otraRespuestaMultiple = (RespuestaMultiple) obj;
        long coincidentes = this.opciones.stream().
                            filter(otraRespuestaMultiple.getOpciones()::contains).
                            count();
        return (int)coincidentes;
    }
}
