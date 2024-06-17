import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

public class LeerPregunta {

        int id;
        String tema;
        String tipo;
        String pregunta;
        String respuesta;
        ArrayList<String> opciones = new ArrayList<>();
        String textoRespuesta;

    public LeerPregunta() {
        this.id = 0;
        this.tema = "";
        this.tipo = "";
        this.pregunta = "";
        this.respuesta = "";
        this.textoRespuesta = "";
    }


        public String getTipo() {
            return this.tipo;
        }

        public String getTema() {
            return this.tema;
        }

        public ArrayList<String> getOpciones() {
            return this.opciones;
        }

    public void AsignarRespuesta(ArrayList<Integer> respuestasCorrectas, int ID, String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            JsonElement jsonElement = JsonParser.parseReader(reader);
            JsonArray jsonArray = jsonElement.getAsJsonArray();

            for (JsonElement element : jsonArray) {
                JsonObject jsonObject = element.getAsJsonObject();
                if (ID == jsonObject.get("ID").getAsInt()) {
                    String respuesta = jsonObject.get("Respuesta").getAsString();
                    // Dividir la cadena de respuesta por comas y convertirla en enteros
                    ArrayList<Integer> respuestas = new ArrayList<>();
                    for (String s : respuesta.split(",")) {
                        respuestas.add(Integer.parseInt(s.trim()));
                    }
                    // Agregar las respuestas a la lista de respuestas correctas
                    respuestasCorrectas.addAll(respuestas);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void AsignarPregunta(Pregunta pregunta, int idPregunta, String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            JsonElement jsonElement = JsonParser.parseReader(reader);
            JsonArray jsonArray = jsonElement.getAsJsonArray();

            for (JsonElement element : jsonArray) {
                JsonObject jsonObject = element.getAsJsonObject();

                if (idPregunta == jsonObject.get("ID").getAsInt()) {
                    this.id = jsonObject.get("ID").getAsInt();
                    this.tema = jsonObject.get("Tema").getAsString();
                    this.tipo = jsonObject.get("Tipo").getAsString();
                    pregunta.setEnunciado(jsonObject.get("Pregunta").getAsString());
                    this.textoRespuesta = jsonObject.get("Texto respuesta").getAsString();


                    Set<String> keys = jsonObject.keySet();
                    for (String key : keys) {
                        if (key.startsWith("Opcion")) {
                            opciones.add(jsonObject.get(key).getAsString());
                        }
                    }

                    break; // Salimos del bucle una vez encontrada la pregunta
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}






