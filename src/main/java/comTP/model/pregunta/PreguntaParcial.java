package comTP.model.pregunta;

import java.util.ArrayList;
import comTP.model.modificador.*;
import comTP.model.opcion.*;
import comTP.model.tipo.*;

public class PreguntaParcial extends Pregunta {
    public PreguntaParcial(Tipo tipo, Respuesta respuestaCorrecta) {
        super(tipo, respuestaCorrecta);
    }

    public PreguntaParcial(Tipo tipo, Respuesta respuestaCorrecta, String enunciado,
                           ArrayList<Opcion> opciones, String tema) {
        super(tipo, respuestaCorrecta, enunciado, opciones, tema);
    }

    @Override
    public Puntaje verificarRespuesta(Respuesta respuestaJugador) {
        Puntaje puntaje = new Puntaje(0);
        if (tipo.respondidoCorrectamente(respuestaCorrecta, respuestaJugador)) {
            puntaje = new Puntaje(respuestaCorrecta.cantidadDeOpcionesCorrectas());
        }
        return this.multiplicador.multiplicar(puntaje);
    }
}
