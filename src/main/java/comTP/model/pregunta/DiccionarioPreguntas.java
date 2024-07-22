package comTP.model.pregunta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import comTP.model.loader.JsonLoader;

public class DiccionarioPreguntas {
    Map<String, ArrayList<Pregunta>> preguntasGuardadas;
    RecorredorPreguntas recorredor;

    public DiccionarioPreguntas() {
        this.preguntasGuardadas = new HashMap<>();
    }

    public void asignarPreguntasPorTema(JsonLoader jsonLoader) {
        for (int i = 0; i < jsonLoader.totalPreguntas(); i++) {
            Pregunta pregunta = jsonLoader.loadPregunta(i);
            String temaPregunta = pregunta.getTema();
            preguntasGuardadas.putIfAbsent(temaPregunta, new ArrayList<>());
            preguntasGuardadas.get(temaPregunta).add(pregunta);
        }
        recorredor = new RecorredorPreguntas(preguntasGuardadas);
    }

    public Pregunta getPregunta() {
        return recorredor.obtenerPregunta();
    }

    public boolean ultimaPregunta() {
        return recorredor.ultimaPregunta();
    }
}


