package com;

import java.util.ArrayList;

public class PreguntaFactory{
    Tipo tipo;
    Pregunta pregunta;

    public Pregunta crearPregunta(String tipoPregunta, String temaPregunta, String enunciadoPregunta, ArrayList<Opcion> opcionesCorrectas, ArrayList<Opcion> opciones) {
        switch (tipoPregunta) {
            case "Group Choice":
                return new Pregunta(new GroupChoice(), opcionesCorrectas, enunciadoPregunta, opciones, temaPregunta);
            case "Ordered choice":
            case "Ordered Choice":
                return new Pregunta(new OrderedChoice(), opcionesCorrectas, enunciadoPregunta, opciones, temaPregunta);
            case "Multiple Choice Simple":
                return new Pregunta(new MultipleChoiceSinPenalidad(), opcionesCorrectas, enunciadoPregunta, opciones, temaPregunta);
            case "Multiple Choice Penalidad":
                return new Pregunta(new MultipleChoiceConPenalidad(), opcionesCorrectas, enunciadoPregunta, opciones, temaPregunta);
            case "Multiple Choice Puntaje Parcial":
                return new Pregunta(new MultipleChoiceConPuntajeParcial(), opcionesCorrectas, enunciadoPregunta, opciones, temaPregunta);
            case "Verdadero Falso":
            case "Verdadero Falso Simple":
                return new Pregunta(new VerdaderoFalso(), opcionesCorrectas, enunciadoPregunta, opciones, temaPregunta);
            case "Verdadero Falso Penalidad":
                return new Pregunta(new VerdaderoFalsoConPenalidad(), opcionesCorrectas, enunciadoPregunta, opciones, temaPregunta);
            default:
                throw new IllegalArgumentException("Tipo de pregunta no reconocido: " + tipoPregunta);
        }
    }
}