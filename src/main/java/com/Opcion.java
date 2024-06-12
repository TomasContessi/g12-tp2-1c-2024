package com;

public interface Opcion<T> {
    public boolean comparar(Opcion<T> opcion);
    public T getValor();
}
