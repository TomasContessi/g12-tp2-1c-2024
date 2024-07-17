package com.model.loader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.model.opcion.Opcion;
import com.model.opcion.OpcionString;
import com.model.pregunta.Pregunta;
import com.model.pregunta.PreguntaFactory;

public class JsonLoader {
    private int totalPreguntas;
    private PreguntaFactory factory;
    private ArrayList<Opcion> opcionesCorrectas;
    private ArrayList<Opcion> opciones;
    private String textoRespuesta;

    public JsonLoader(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            JsonElement jsonElement = JsonParser.parseReader(reader);
            JsonArray jsonArray = jsonElement.getAsJsonArray();
            this.totalPreguntas = jsonArray.size();
        } catch (IOException e) {
            e.printStackTrace();
        }
        factory = new PreguntaFactory();
    }

    public JsonObject leerAtributos(int ID, String filePath) {

        opcionesCorrectas = new ArrayList<>();
        opciones = new ArrayList<>();

        JsonObject jsonObject = null;

        try(FileReader reader = new FileReader(filePath)) {

            JsonElement jsonElement = JsonParser.parseReader(reader);
            JsonArray jsonArray = jsonElement.getAsJsonArray();

            JsonElement element = jsonArray.get(ID);
            jsonObject = element.getAsJsonObject();

            this.textoRespuesta = jsonObject.get("Texto respuesta").getAsString();

            String respuestasCorrectas = jsonObject.get("Respuesta").getAsString();

            String opcionKey;
            if (respuestasCorrectas.contains("A:") && respuestasCorrectas.contains("B:")) {
                String[] grupos = respuestasCorrectas.split(";");
                for (String grupo : grupos) {
                    String[] partesGrupo = grupo.split(":");
                    if (partesGrupo[0].trim().equals("A")) {
                        for (String s : partesGrupo[1].split(",")) {
                            opcionKey = "Opcion " + s.trim();
                            this.opcionesCorrectas.add(new OpcionString(jsonObject.get(opcionKey).getAsString()));
                        }
                        break;
                    }
                }
            } else {
                // Procesar todas las respuestas como antes
                for (String s : respuestasCorrectas.split(",")) {
                    opcionKey = "Opcion " + s.trim();
                    this.opcionesCorrectas.add(new OpcionString(jsonObject.get(opcionKey).getAsString()));
                }
            }

            Set<String> keys = jsonObject.keySet();
            for (String key : keys) {
                if (key.startsWith("Opcion")) {
                    this.opciones.add(new OpcionString(jsonObject.get(key).getAsString()));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Error: ID no es un número entero válido.");
        } catch (NullPointerException e) {
            System.err.println("Error: Algún campo está ausente en la pregunta " + ID);
        }
        return jsonObject;
    }

    public Pregunta loadPregunta(int ID, String path) {
        JsonObject datosEnunciado = this.leerAtributos(ID, path);
        return (this.factory.crearPregunta(datosEnunciado, opcionesCorrectas, opciones));
    }

    public void setFactory(PreguntaFactory factory) {
        this.factory = factory;
    }

    public ArrayList<Opcion> opcionesCorrectas() {
        return this.opcionesCorrectas;
    }

    public ArrayList<Opcion> opciones() {
        return this.opciones;
    }

    public int totalPreguntas() {
        return this.totalPreguntas;
    }
}