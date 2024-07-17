package comTP.model.pregunta;

import java.util.ArrayList;

import comTP.model.modificador.Puntaje;
import comTP.model.opcion.Opcion;
import comTP.model.tipo.Tipo;

public class PreguntaConPenalidad extends Pregunta {
    public PreguntaConPenalidad(Tipo tipo, ArrayList<Opcion> respuestaCorrecta) {
        super(tipo, respuestaCorrecta);
    }

    public PreguntaConPenalidad(Tipo tipo, ArrayList<Opcion> respuestaCorrecta, String enunciado, ArrayList<Opcion> opciones, String tema) {
        super(tipo, respuestaCorrecta, enunciado, opciones, tema);
    }

    @Override
    public Puntaje verificarRespuesta(ArrayList<Opcion> respuestaContestada) {
        Puntaje puntaje = new Puntaje(0);
        if (tipo.respondidoCorrectamente(this.respuestaCorrecta, respuestaContestada)) {
            puntaje = puntaje.sumarseCon(tipo.opcionesAcertadas());
        } else {
            puntaje = puntaje.sumarseCon(tipo.opcionesAcertadas()).descontar(tipo.opcionesErradas());
        }
        return this.multiplicador.multiplicar(puntaje);
    }
}
