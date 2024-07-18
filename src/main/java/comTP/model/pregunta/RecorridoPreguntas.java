package comTP.model.pregunta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RecorridoPreguntas {
    private final Map<String, ArrayList<Pregunta>> preguntasGuardadas;
    private final Map<String, Integer> indiceActualPorClave;
    private final ArrayList<String> clavesOrdenadas;
    private int indiceGlobal;

    public RecorridoPreguntas(Map<String, ArrayList<Pregunta>> preguntasGuardadas) {
        this.preguntasGuardadas = preguntasGuardadas;
        this.indiceActualPorClave = new HashMap<>();
        this.clavesOrdenadas = new ArrayList<>();
        this.indiceGlobal = 0;

        for(String clave : preguntasGuardadas.keySet()) {
            this.clavesOrdenadas.add(clave);
            this.indiceActualPorClave.put(clave, 0);
        }
    }

    public Pregunta obtenerPregunta() {
        String claveActual = clavesOrdenadas.get(indiceGlobal % clavesOrdenadas.size());
        ArrayList<Pregunta> preguntas = preguntasGuardadas.get(claveActual);
        int indiceActual = indiceActualPorClave.get(claveActual);

        if(indiceActual < preguntas.size()) {
            Pregunta pregunta = preguntas.get(indiceActual);
            indiceActualPorClave.put(claveActual, indiceActual + 1);
            indiceGlobal++;
            return pregunta;
        }
        else {
            clavesOrdenadas.remove(claveActual);
            return obtenerPregunta();
        }
    }
}
