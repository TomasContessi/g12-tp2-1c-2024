package com.Modelo;

public class PreguntaSimple extends Pregunta {

    public PreguntaSimple() {
        super();
    }

    public PreguntaSimple(Respuesta respuestaCorrecta) {
        super(respuestaCorrecta);
    }

    public PreguntaSimple(TipoPregunta tipo, Respuesta respuestaCorrecta) {
        super(tipo, respuestaCorrecta);
    }

    @Override
    public void verificarRespuesta(Respuesta respuestaJugador, Jugador jugador) {
        // if(tipo.compararRespuesta(this.respuestaCorrecta, respuestaJugador)) {
        //     this.calculoPuntaje = new AumentarPuntajeSimple();
        // }
        // else {
        //     this.calculoPuntaje = new MantenerPuntaje();
        // }

        // jugador.calcularPuntaje(this.calculoPuntaje);

        
        
        // if(this.respuestaCorrecta.equals(respuestaCorrecta)) {
        //     int i = respuestaCorrecta.cantidadDeElementosCoincidentes(respuestaJugador);
        // }
        //     this.calculoPuntaje = new AumentarPuntajeSimple();
        // else
        //     this.calculoPuntaje = new MantenerPuntaje();

        // jugador.calcularPuntaje(this.calculoPuntaje);
    }
}
