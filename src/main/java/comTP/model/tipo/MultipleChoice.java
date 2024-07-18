package comTP.model.tipo;

import comTP.model.opcion.*;

public class MultipleChoice implements Tipo {
    @Override
    public boolean respondidoCorrectamente(Respuesta respuestaCorrecta,
                                           Respuesta respuestaJugador) {
        return respuestaCorrecta.corregirRespuestaSinImportarElOrden(respuestaJugador);
    } 
}
