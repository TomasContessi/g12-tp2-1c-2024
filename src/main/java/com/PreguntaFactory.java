package com;

import java.util.ArrayList;

public class PreguntaFactory{
    Tipo tipo;
    Pregunta pregunta;

    public Pregunta crearPregunta(String tipoPregunta, String temaPregunta, String enunciadoPregunta, ArrayList<Opcion> opcionesCorrectas, ArrayList<Opcion> opciones) {
        switch (tipoPregunta) {
            case "Ordered Choice":
                break;
            case "Multiple Choice Simple":
                break;
            case "Verdadero Falso":
                break;
            default:
                break;
        }
    }
}