package comTP.model.opcion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Respuesta {
    private final ArrayList<Opcion> opciones;
    private int cantidadDeOpcionesCorrectas;
    private int cantidadDeOpcionesIncorrectas;

    public Respuesta() {
        opciones = new ArrayList<>();
    }

    public Respuesta(ArrayList<Opcion> opciones) {
        this.opciones = opciones;
    }

    public void agregarOpcion(Opcion opcion) {
        opciones.add(opcion);
    }

    public void eliminarOpciones() {
        opciones.clear();
    }

    private boolean otraRespuestaTieneMayorCantidadDeOpciones(Respuesta otraRespuesta) {
        return this.opciones.size() < otraRespuesta.opciones.size();
    }

    public boolean corregirRespuestaUnica(Respuesta otraRespuesta) {
        if(this.opciones.equals(otraRespuesta.opciones)) {
            cantidadDeOpcionesCorrectas++;
            return true;
        }
        cantidadDeOpcionesIncorrectas++;
        return false;
    }

    public boolean corregirRespuestaSinImportarElOrden(Respuesta otraRespuesta) {
        Set<Opcion> set1 = new HashSet<>(this.opciones);
        Set<Opcion> set2 = new HashSet<>(otraRespuesta.opciones);

        Set<Opcion> iguales = new HashSet<>(set1);
        Set<Opcion> diferentes = new HashSet<>(set2);

        iguales.retainAll(set2);
        diferentes.removeAll(set1);

        this.cantidadDeOpcionesCorrectas = iguales.size();
        this.cantidadDeOpcionesIncorrectas = diferentes.size();

        if(otraRespuestaTieneMayorCantidadDeOpciones(otraRespuesta) ||
                cantidadDeOpcionesIncorrectas != 0 || otraRespuesta.opciones.isEmpty()) {
            return false;
        }
        else {
            return cantidadDeOpcionesCorrectas <= this.opciones.size();
        }
    }

    public boolean corregirImportandoElOrden(Respuesta otraRespuesta) {
        return this.opciones.equals(otraRespuesta.opciones);
    }

    public int cantidadDeOpcionesCorrectas() {
        return this.cantidadDeOpcionesCorrectas;
    }

    public int cantidadDeOpcionesIncorrectas() {
        return this.cantidadDeOpcionesIncorrectas;
    }
}
