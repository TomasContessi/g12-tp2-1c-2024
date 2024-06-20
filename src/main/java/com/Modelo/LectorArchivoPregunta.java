package com.Modelo;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class LectorArchivoPregunta {
    int ID;
    String temaPregunta;
    String tipoPregunta;
    String enunciadoPregunta;
    ArrayList<Integer> opcionesCorrectas = new ArrayList<>();
    ArrayList<String> opciones = new ArrayList<>();
    String textoRespuesta;

    public void leerAtributos(int ID, String filePath) {
        try(FileReader reader = new FileReader(filePath)) {
            JsonElement jsonElement = JsonParser.parseReader(reader);
            JsonArray jsonArray = jsonElement.getAsJsonArray();

            JsonElement element = jsonArray.get(ID);
            JsonObject jsonObject = element.getAsJsonObject();

            this.tipoPregunta = jsonObject.get("Tipo").getAsString();

            this.enunciadoPregunta = jsonObject.get("Pregunta").getAsString();

            String respuestasCorrectas = jsonObject.get("Respuesta").getAsString();
            for(String s :  respuestasCorrectas.split(",")) {
                this.opcionesCorrectas.add(Integer.parseInt(s.trim()));
            }

            Set<String> keys = jsonObject.keySet();
            for (String key : keys) {
                if (key.startsWith("Opcion")) {
                    this.opciones.add(jsonObject.get(key).getAsString());
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String tipoPregunta() {
        return this.tipoPregunta;
    }

    public String enunciadoPregunta() {
        return this.enunciadoPregunta;
    }

    public ArrayList<Integer> opcionesCorrectas() {
        return this.opcionesCorrectas;
    }

    public ArrayList<String> opciones() {
        return this.opciones;
    }
}
