public class Pregunta {

    Respuesta respuestasCorrectas;
    String enunciado;

    public Pregunta(Respuesta nuevaRespuestaCorrecta) {
        this.respuestasCorrectas = nuevaRespuestaCorrecta;
    }

    void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
}
