package comTP.model.tipo;

import comTP.model.opcion.*;

public class VerdaderoFalso implements Tipo {
    @Override
    public boolean respondidoCorrectamente(Respuesta respuestaCorrecta,
                                           Respuesta respuestaJugador) {
        return respuestaCorrecta.corregirRespuestaUnica(respuestaJugador);
    }
}
    

