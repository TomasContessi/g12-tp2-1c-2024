package comTP.model.pregunta;

import com.google.gson.JsonObject;
import comTP.model.tipo.*;
import comTP.model.opcion.*;
import java.util.ArrayList;

public class PreguntaFactory{

    public Pregunta crearPregunta(JsonObject datosEnunciado, Respuesta respuestaCorrecta,
                                  ArrayList<Opcion> opciones) {

        String tipoPregunta = datosEnunciado.get("Tipo").getAsString();
        String temaPregunta = datosEnunciado.get("Tema").getAsString();
        String enunciadoPregunta = datosEnunciado.get("Pregunta").getAsString();

        return switch (tipoPregunta) {
            case "Group Choice" -> new PreguntaSimple(
                    new GroupChoice(datosEnunciado.get("Grupo A").getAsString(),
                    datosEnunciado.get("Grupo B").getAsString()), respuestaCorrecta,
                    enunciadoPregunta, opciones, temaPregunta);
            case "Ordered choice", "Ordered Choice" -> new PreguntaSimple(new OrderedChoice(),
                    respuestaCorrecta, enunciadoPregunta, opciones, temaPregunta);
            case "Multiple Choice Simple" -> new PreguntaSimple(new MultipleChoice(),
                    respuestaCorrecta, enunciadoPregunta, opciones, temaPregunta);
            case "Multiple Choice Penalidad" -> new PreguntaConPenalidad(new MultipleChoice(),
                    respuestaCorrecta, enunciadoPregunta, opciones, temaPregunta);
            case "Multiple Choice Puntaje Parcial" -> new PreguntaParcial(new MultipleChoice(),
                    respuestaCorrecta, enunciadoPregunta, opciones, temaPregunta);
            case "Verdadero Falso", "Verdadero Falso Simple" -> new PreguntaSimple(new VerdaderoFalso(),
                    respuestaCorrecta, enunciadoPregunta, opciones, temaPregunta);
            case "Verdadero Falso Penalidad" -> new PreguntaConPenalidad(new VerdaderoFalso(),
                    respuestaCorrecta, enunciadoPregunta, opciones, temaPregunta);
            default -> throw new IllegalArgumentException("Tipo de pregunta no reconocido: " + tipoPregunta);
        };
    }
}