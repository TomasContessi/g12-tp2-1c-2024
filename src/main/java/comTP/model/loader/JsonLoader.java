package comTP.model.loader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import comTP.model.opcion.*;
import comTP.model.pregunta.*;

public class JsonLoader {
    private final String filePath;
    private int totalPreguntas;
    private final PreguntaFactory factory;
    private Respuesta respuestaCorrecta;
    private ArrayList<Opcion> opciones;

    public JsonLoader(String filePath) {
        this.filePath = filePath;
        this.factory = new PreguntaFactory();
        try (FileReader reader = new FileReader(filePath)) {
            JsonElement jsonElement = JsonParser.parseReader(reader);
            JsonArray jsonArray = jsonElement.getAsJsonArray();
            this.totalPreguntas = jsonArray.size();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public JsonObject leerAtributos(int id) {
        respuestaCorrecta = new Respuesta();
        opciones = new ArrayList<>();

        JsonObject jsonObject = null;

        try(FileReader reader = new FileReader(filePath)) {
            JsonElement jsonElement = JsonParser.parseReader(reader);
            JsonArray jsonArray = jsonElement.getAsJsonArray();

            JsonElement element = jsonArray.get(id);
            jsonObject = element.getAsJsonObject();

            String respuestasCorrectas = jsonObject.get("Respuesta").getAsString();
            String opcionKey;
            if (respuestasCorrectas.contains("A:") && respuestasCorrectas.contains("B:")) {
                String[] grupos = respuestasCorrectas.split(";");
                for (String grupo : grupos) {
                    String[] partesGrupo = grupo.split(":");
                    if (partesGrupo[0].trim().equals("A")) {
                        for (String s : partesGrupo[1].split(",")) {
                            opcionKey = "Opcion " + s.trim();
                            respuestaCorrecta.agregarOpcion(new Opcion(jsonObject.get(opcionKey).getAsString()));
                        }
                        break;
                    }
                }
            } else {
                for (String s : respuestasCorrectas.split(",")) {
                    opcionKey = "Opcion " + s.trim();
                    respuestaCorrecta.agregarOpcion(new Opcion(jsonObject.get(opcionKey).getAsString()));
                }
            }

            Set<String> keys = jsonObject.keySet();
            for (String key : keys) {
                if (key.startsWith("Opcion")) {
                    this.opciones.add(new Opcion(jsonObject.get(key).getAsString()));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Error: id no es un número entero válido.");
        } catch (NullPointerException e) {
            System.err.println("Error: Algún campo está ausente en la pregunta " + id);
        }
        return jsonObject;
    }

    public Pregunta loadPregunta(int ID) {
        JsonObject datosEnunciado = this.leerAtributos(ID);
        return (factory.crearPregunta(datosEnunciado, respuestaCorrecta, opciones));
    }

    public Respuesta respuestaCorrecta() {
        return this.respuestaCorrecta;
    }

    public ArrayList<Opcion> opciones() {
        return this.opciones;
    }

    public int totalPreguntas() {
        return this.totalPreguntas;
    }
}