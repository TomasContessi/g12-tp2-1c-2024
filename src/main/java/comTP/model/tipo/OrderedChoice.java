package comTP.model.tipo;

import comTP.model.opcion.*;

public class OrderedChoice implements Tipo {
    @Override
    public boolean respondidoCorrectamente(Respuesta respuestaCorrecta,
                                           Respuesta respuestaJugador) {
        return respuestaCorrecta.corregirImportandoElOrden(respuestaJugador);
    } 
}