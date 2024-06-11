package com;

import java.util.ArrayList;

public class Respuesta implements IRespuesta{
    //private String valor = new ArrayList<>();
    private String valor;
    public Respuesta(String valor) {
        this.valor = valor;
    }

    @Override
    public String getValor() {
        return this.valor;
    }
}
