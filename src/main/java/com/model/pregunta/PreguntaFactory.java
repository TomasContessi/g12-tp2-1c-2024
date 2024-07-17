package com.model.pregunta;

import java.util.ArrayList;

import com.google.gson.JsonObject;
import com.model.opcion.Opcion;
import com.model.tipo.GroupChoice;
import com.model.tipo.MultipleChoice;
import com.model.tipo.OrderedChoice;
import com.model.tipo.VerdaderoFalso;

public class PreguntaFactory{

    public Pregunta crearPregunta(JsonObject datosEnunciado, ArrayList<Opcion> opcionesCorrectas, ArrayList<Opcion> opciones) {

        String tipoPregunta = datosEnunciado.get("Tipo").getAsString();
        String temaPregunta = datosEnunciado.get("Tema").getAsString();
        String enunciadoPregunta = datosEnunciado.get("Pregunta").getAsString();

        return switch (tipoPregunta) {
            case "Group Choice" ->
                    new PreguntaSimple(new GroupChoice(datosEnunciado.get("Grupo A").getAsString(), datosEnunciado.get("Grupo B").getAsString()), opcionesCorrectas, enunciadoPregunta, opciones, temaPregunta);
            case "Ordered choice", "Ordered Choice" ->
                    new PreguntaSimple(new OrderedChoice(), opcionesCorrectas, enunciadoPregunta, opciones, temaPregunta);
            case "Multiple Choice Simple" ->
                    new PreguntaSimple(new MultipleChoice(), opcionesCorrectas, enunciadoPregunta, opciones, temaPregunta);
            case "Multiple Choice Penalidad" ->
                    new PreguntaConPenalidad(new MultipleChoice(), opcionesCorrectas, enunciadoPregunta, opciones, temaPregunta);
            case "Multiple Choice Puntaje Parcial" ->
                    new PreguntaParcial(new MultipleChoice(), opcionesCorrectas, enunciadoPregunta, opciones, temaPregunta);
            case "Verdadero Falso", "Verdadero Falso Simple" ->
                    new PreguntaSimple(new VerdaderoFalso(), opcionesCorrectas, enunciadoPregunta, opciones, temaPregunta);
            case "Verdadero Falso Penalidad" ->
                    new PreguntaConPenalidad(new VerdaderoFalso(), opcionesCorrectas, enunciadoPregunta, opciones, temaPregunta);
            default -> throw new IllegalArgumentException("Tipo de pregunta no reconocido: " + tipoPregunta);
        };
    }
}