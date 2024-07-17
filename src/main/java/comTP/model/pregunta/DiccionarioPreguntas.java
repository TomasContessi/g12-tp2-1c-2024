package comTP.model.pregunta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import comTP.model.loader.JsonLoader;

public class DiccionarioPreguntas {
    Map<String, ArrayList<Pregunta>> preguntasGuardadas = new HashMap<>();

    public void asignarPreguntasPorTema(String filePath) {
        JsonLoader nuevoLector = new JsonLoader(filePath);

        for (int i = 0; i < nuevoLector.totalPreguntas(); i++) {

            Pregunta pregunta = nuevoLector.loadPregunta(i, filePath);
            String temaPregunta = pregunta.getTema();

            preguntasGuardadas.putIfAbsent(temaPregunta, new ArrayList<>());
            preguntasGuardadas.get(temaPregunta).add(pregunta);
        }
    }

    public ArrayList<Pregunta> obtenerTema(String tema) {
        return preguntasGuardadas.get(tema);
    }

    public Pregunta obtenerPregunta(String tema, int numeroDePregunta) {

        ArrayList<Pregunta> preguntasDelTema = this.obtenerTema(tema);

        Pregunta pregunta = preguntasDelTema.get(numeroDePregunta);
        preguntasDelTema.remove(numeroDePregunta);

        if (this.obtenerTema(tema).size() == 0){
            this.preguntasGuardadas.remove(tema);
        }

        return pregunta;
    }

    public Pregunta obtenerPregunta(String tema) {
        Random rand = new Random();
        int numeroDePreguntas = this.obtenerTema(tema).size();
        int numeroRandom = rand.nextInt(numeroDePreguntas);
        Pregunta pregunta = this.obtenerPregunta(tema, numeroRandom);

        return pregunta;
    }

    public ArrayList<String> obtenerTemas() {
        ArrayList<String> temas = new ArrayList<String>();
        temas.addAll(this.preguntasGuardadas.keySet());

        return temas;
    }
}


