package comTP.model.opcion;

public class OpcionString implements Opcion {
    String respuesta;
    public OpcionString(String respuesta){
        this.respuesta = respuesta;
    }

    @Override
    public boolean verificar(Opcion opcion2){
        // Verificar si son el mismo objeto
        if (this == opcion2) {
            return true;
        }

        // Verificar si el objeto es una instancia de OpcionString
        if (opcion2 == null || getClass() != opcion2.getClass()) {
            return false;
        }

        // Convertir obj a OpcionString y comparar los atributos
        OpcionString opcion = (OpcionString) opcion2;
        return this.respuesta.equals(opcion.respuesta);
    }

    @Override
    public String obtenerRespuesta(){
        return this.respuesta;
    }

}
