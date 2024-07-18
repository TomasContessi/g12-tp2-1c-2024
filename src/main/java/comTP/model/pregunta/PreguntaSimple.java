package comTP.model.pregunta;

import java.util.ArrayList;
import comTP.model.modificador.*;
import comTP.model.opcion.*;
import comTP.model.tipo.*;

public class PreguntaSimple extends Pregunta {
    public PreguntaSimple(Tipo tipo, Respuesta respuestaCorrecta) {
        super(tipo, respuestaCorrecta);
    }

    public PreguntaSimple(Tipo tipo, Respuesta respuestaCorrecta, String enunciado,
                          ArrayList<Opcion> opciones, String tema) {
        super(tipo, respuestaCorrecta, enunciado, opciones, tema);
    }

    @Override
    public Puntaje verificarRespuesta(Respuesta respuestaJugador) {
        Puntaje puntaje = new Puntaje(0);
        if (tipo.respondidoCorrectamente(respuestaCorrecta, respuestaJugador)) {
            puntaje = new Puntaje(1);
        }
        return this.multiplicador.multiplicar(puntaje);
    }
}