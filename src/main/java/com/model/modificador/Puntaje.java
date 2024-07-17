package com.model.modificador;

import java.util.Objects;

public class Puntaje {

    private int puntaje;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Puntaje otroPuntaje = (Puntaje) o;
        return this.puntaje == otroPuntaje.puntaje;
    }

    @Override
    public int hashCode() {
        return Objects.hash(puntaje);
    }

    public Puntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public Puntaje multiplicarseCon(Puntaje otroPuntaje) {
        return new Puntaje(this.puntaje * otroPuntaje.valorNumerico());
    }

    public Puntaje sumarseCon(Puntaje otroPuntaje) {
        return new Puntaje(this.puntaje + otroPuntaje.valorNumerico());
    }

    public Puntaje descontar(Puntaje otroPuntaje) {
        return new Puntaje(this.puntaje - otroPuntaje.valorNumerico());
    }

    public boolean menorOIgualQue(Puntaje otroPuntaje) {
        return this.puntaje <= otroPuntaje.valorNumerico();
    }

    public boolean mayorIgual(Puntaje otroPuntaje) {
        return this.puntaje >= otroPuntaje.valorNumerico();
    }

    public int valorNumerico() { // Cambiar el tipo de retorno a int
        return this.puntaje;
    }
}
