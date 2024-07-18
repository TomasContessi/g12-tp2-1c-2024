package comTP.model.tipo;

import comTP.model.opcion.*;

public class GroupChoice implements Tipo {
    private final String grupoATitulo;
    private final String grupoBTitulo;
    
    public  GroupChoice(String grupoA, String grupoB){
        this.grupoATitulo = grupoA;
        this.grupoBTitulo = grupoB;
    };

    @Override
    public boolean respondidoCorrectamente(Respuesta respuestaCorrecta,
                                           Respuesta respuestaJugador) {
        return respuestaCorrecta.corregirRespuestaSinImportarElOrden(respuestaJugador);
    }

    public String getTituloGrupoA(){
        return this.grupoATitulo;
    };

    public String getTituloGrupoB(){
        return this.grupoBTitulo;
    };
}