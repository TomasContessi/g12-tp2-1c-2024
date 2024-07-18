package comTP.model.pregunta;

import java.util.ArrayList;
import comTP.model.modificador.*;
import comTP.model.opcion.*;
import comTP.model.tipo.*;

public class PreguntaConPenalidad extends Pregunta {
    public PreguntaConPenalidad(Tipo tipo, Respuesta respuestaCorrecta) {
        super(tipo, respuestaCorrecta);
    }

    public PreguntaConPenalidad(Tipo tipo, Respuesta respuestaCorrecta, String enunciado,
                                ArrayList<Opcion> opciones, String tema) {
        super(tipo, respuestaCorrecta, enunciado, opciones, tema);
    }

    @Override
    public Puntaje verificarRespuesta(Respuesta respuestaJugador) {
        Puntaje puntaje;
        if (tipo.respondidoCorrectamente(respuestaCorrecta, respuestaJugador)) {
            puntaje = new Puntaje(respuestaCorrecta.cantidadDeOpcionesCorrectas());
        } else {
            puntaje = new Puntaje(respuestaCorrecta.cantidadDeOpcionesCorrectas() -
                    respuestaCorrecta.cantidadDeOpcionesIncorrectas());
        }
        return this.multiplicador.multiplicar(puntaje);
    }
}
