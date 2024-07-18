package comTP.model.modificador;

import java.util.Objects;

public class Puntaje {
    private final int valor;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Puntaje otroPuntaje = (Puntaje) o;
        return this.valor == otroPuntaje.valor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }

    public Puntaje(int puntaje) {
        this.valor = puntaje;
    }

    public Puntaje multiplicarseCon(Puntaje otroPuntaje) {
        return new Puntaje(this.valor * otroPuntaje.valorNumerico());
    }

    public Puntaje sumarseCon(Puntaje otroPuntaje) {
        return new Puntaje(this.valor + otroPuntaje.valorNumerico());
    }

    public Puntaje descontar(Puntaje otroPuntaje) {
        return new Puntaje(this.valor - otroPuntaje.valorNumerico());
    }

    public boolean menorOIgualQue(Puntaje otroPuntaje) {
        return this.valor <= otroPuntaje.valorNumerico();
    }

    public boolean mayorIgual(Puntaje otroPuntaje) {
        return this.valor >= otroPuntaje.valorNumerico();
    }

    public int valorNumerico() { // Cambiar el tipo de retorno a int
        return this.valor;
    }
}
