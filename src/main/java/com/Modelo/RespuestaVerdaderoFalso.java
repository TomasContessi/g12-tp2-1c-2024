package com.Modelo;

import java.util.Objects;

public class RespuestaVerdaderoFalso implements Respuesta {
    int opcion;

    public RespuestaVerdaderoFalso() {
        this.opcion = 0;
    }

    public RespuestaVerdaderoFalso(int opcion) {
        this.opcion = opcion;
    }

    public int getOpcion() {
        return this.opcion;
    }

    @Override
    public Respuesta getRespuesta() {
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof RespuestaVerdaderoFalso)) return false;
        RespuestaVerdaderoFalso otraRespuestaVF = (RespuestaVerdaderoFalso) obj;
        return this.opcion == otraRespuestaVF.getOpcion();
    }

    @Override
    public int hashCode() {
        return Objects.hash(opcion);
    }

    // @Override
    // public boolean compararRespuestas(Respuesta otraRespuesta) {

    // }
}
