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
    int totalPreguntas;
    PreguntaFactory factory = new PreguntaFactory();
    int id;
    String temaPregunta;
    String tipoPregunta;
    String enunciadoPregunta;
    ArrayList<Opcion> opcionesCorrectas;
    ArrayList<Opcion> opciones;
    String textoRespuesta;
    String opcionKey;

    JsonLoader(String filePath){

        try(FileReader reader = new FileReader(filePath)) {

            JsonElement jsonElement = JsonParser.parseReader(reader);
            JsonArray jsonArray = jsonElement.getAsJsonArray();

            this.totalPreguntas = jsonArray.size();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void leerAtributos(int ID, String filePath) {

        opcionesCorrectas = new ArrayList<>();
        opciones = new ArrayList<>();

        try(FileReader reader = new FileReader(filePath)) {

            JsonElement jsonElement = JsonParser.parseReader(reader);
            JsonArray jsonArray = jsonElement.getAsJsonArray();

            JsonElement element = jsonArray.get(ID);
            JsonObject jsonObject = element.getAsJsonObject();

            this.tipoPregunta = jsonObject.get("Tipo").getAsString();

            this.temaPregunta = jsonObject.get("Tema").getAsString();

            this.enunciadoPregunta = jsonObject.get("Pregunta").getAsString();

            this.textoRespuesta = jsonObject.get("Texto respuesta").getAsString();

            this.id = jsonObject.get("ID").getAsInt();

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
        } catch (NumberFormatException e) {
            System.err.println("Error: ID no es un número entero válido.");
        } catch (NullPointerException e) {
            System.err.println("Error: Algún campo está ausente en la pregunta " + ID);
        }
    }

    public String tipoPregunta() {
        return this.tipoPregunta;
    }

    public String temaPregunta() {
        return this.temaPregunta;
    }

    public String enunciadoPregunta() {
        return this.enunciadoPregunta;
    }

    public Pregunta loadPregunta(int ID, String path){
        this.leerAtributos(ID, path);
        return (this.factory.crearPregunta(tipoPregunta, temaPregunta, enunciadoPregunta, opcionesCorrectas, opciones));
    }

    public void setFactory(PreguntaFactory factory){
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
