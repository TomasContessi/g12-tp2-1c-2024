package comTP.model.opcion;

import java.util.Objects;

public class Opcion {
    String valor;

    public Opcion(String valor){
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null ||  getClass() != o.getClass()) return false;
        Opcion opcion = (Opcion) o;
        return valor.equals(opcion.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(valor);
    }

    public String obtenerValor(){
        return this.valor;
    }
}
