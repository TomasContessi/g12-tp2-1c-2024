package com;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonLoader {
    int ID;
    String temaPregunta;
    String tipoPregunta;
    String enunciadoPregunta;
    ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
    ArrayList<Opcion> opciones = new ArrayList<>();
    String textoRespuesta;
    String opcionKey;
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
                opcionKey = "Opcion " + s.trim();
                this.opcionesCorrectas.add(new OpcionString(jsonObject.get(opcionKey).getAsString()));
            }

            Set<String> keys = jsonObject.keySet();
            for (String key : keys) {
                if (key.startsWith("Opcion")) {
                    this.opciones.add(new OpcionString(jsonObject.get(key).getAsString()));
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

    public Pregunta loadPregunta(PreguntaFactory factory){
        return factory.crearPregunta(tipoPregunta, temaPregunta, enunciadoPregunta, opcionesCorrectas, opciones);
    }

    public ArrayList<Opcion> opcionesCorrectas() {
        return this.opcionesCorrectas;
    }

    public ArrayList<Opcion> opciones() {
        return this.opciones;
    }
}