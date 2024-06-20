package com.Modelo;

public class VerdaderoFalso implements TipoPregunta
{
    @Override
    public boolean compararRespuesta(Respuesta respuestaJugador, Respuesta respuestaCorrecta) {
        if(respuestaCorrecta.equals(respuestaJugador)) return true;
        else return false;
        //return true;
    }
}
