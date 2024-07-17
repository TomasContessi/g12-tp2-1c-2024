package comTP.model.pregunta;

import java.util.ArrayList;

import comTP.model.modificador.Puntaje;
import comTP.model.opcion.Opcion;
import comTP.model.tipo.Tipo;

public class PreguntaParcial extends Pregunta {
    public PreguntaParcial(Tipo tipo, ArrayList<Opcion> respuestaCorrecta) {
        super(tipo, respuestaCorrecta);
    }

    public PreguntaParcial(Tipo tipo, ArrayList<Opcion> respuestaCorrecta, String enunciado, ArrayList<Opcion> opciones, String tema) {
        super(tipo, respuestaCorrecta, enunciado, opciones, tema);
    }

    @Override
    public Puntaje verificarRespuesta(ArrayList<Opcion> respuestaContestada) {

        Puntaje puntaje = new Puntaje(0);

        if (tipo.respondidoCorrectamente(this.respuestaCorrecta, respuestaContestada)) {
            puntaje = puntaje.sumarseCon(tipo.opcionesAcertadas());
        }
        return this.multiplicador.multiplicar(puntaje);
    }
}
