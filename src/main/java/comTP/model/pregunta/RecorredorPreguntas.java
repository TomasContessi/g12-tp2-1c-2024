package comTP.model.pregunta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RecorredorPreguntas {
    private final Map<String, ArrayList<Pregunta>> preguntasGuardadas;
    private final Map<String, Integer> indiceActualPorClave;
    private final ArrayList<String> clavesOrdenadas;
    private ArrayList<Pregunta> preguntas;
    private int indiceGlobal;
    private int indiceActual;

    public RecorredorPreguntas(Map<String, ArrayList<Pregunta>> preguntasGuardadas) {
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
        if(clavesOrdenadas.isEmpty())
            return null;

        String claveActual = clavesOrdenadas.get(indiceGlobal % clavesOrdenadas.size());
        preguntas = preguntasGuardadas.get(claveActual);
        indiceActual = indiceActualPorClave.get(claveActual);

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

    public boolean ultimaPregunta() {
        return (indiceActual == preguntas.size() - 1 && clavesOrdenadas.size() == 1);
    }
}
