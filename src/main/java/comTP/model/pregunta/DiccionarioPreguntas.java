package comTP.model.pregunta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import comTP.model.loader.JsonLoader;

public class DiccionarioPreguntas {
    Map<String, ArrayList<Pregunta>> preguntasGuardadas;
    RecorridoPreguntas recorredor;
    JsonLoader jsonLoader;

    public DiccionarioPreguntas(JsonLoader jsonLoader) {
        this.preguntasGuardadas = new HashMap<>();
        this.jsonLoader = jsonLoader;
    }

    public void asignarPreguntasPorTema() {
        for (int i = 0; i < jsonLoader.totalPreguntas(); i++) {
            Pregunta pregunta = jsonLoader.loadPregunta(i);
            String temaPregunta = pregunta.getTema();
            preguntasGuardadas.putIfAbsent(temaPregunta, new ArrayList<>());
            preguntasGuardadas.get(temaPregunta).add(pregunta);
        }
        recorredor = new RecorridoPreguntas(preguntasGuardadas);
    }

    public Pregunta getPregunta() {
        return recorredor.obtenerPregunta();
    }

    public Map<String, ArrayList<Pregunta>> getPreguntasGuardadas() {
        return preguntasGuardadas;
    }
}


