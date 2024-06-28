package com.model.pregunta;

import java.util.ArrayList;

import com.model.opcion.Opcion;
import com.model.tipo.GroupChoice;
import com.model.tipo.MultipleChoiceConPenalidad;
import com.model.tipo.MultipleChoiceConPuntajeParcial;
import com.model.tipo.MultipleChoiceSinPenalidad;
import com.model.tipo.OrderedChoice;
import com.model.tipo.Tipo;
import com.model.tipo.VerdaderoFalso;
import com.model.tipo.VerdaderoFalsoConPenalidad;

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