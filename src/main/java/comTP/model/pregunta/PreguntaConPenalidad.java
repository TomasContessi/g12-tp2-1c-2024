package comTP.model.pregunta;

import java.util.ArrayList;
import comTP.model.modificador.*;
import comTP.model.opcion.*;
import comTP.model.tipo.*;

public class PreguntaConPenalidad extends Pregunta {
    public PreguntaConPenalidad(Tipo tipo, Respuesta respuestaCorrecta) {
        super(tipo, respuestaCorrecta);
    }

    public PreguntaConPenalidad(Tipo tipo, Respuesta respuestaCorrecta, String enunciado, String tipoPregunta,
                                ArrayList<Opcion> opciones, String tema, String textoRespuesta) {
        super(tipo, respuestaCorrecta, enunciado, tipoPregunta, opciones, tema, textoRespuesta);
    }

    @Override
    public boolean tienePenalidad() {
        return true;
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
