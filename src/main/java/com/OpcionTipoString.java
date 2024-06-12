package com;

public class OpcionTipoString implements Opcion<String> {

    String valor;

    OpcionTipoString(String valor) {
        this.valor = valor;
    }

    @Override
    public String getValor(){
        return this.valor;
    }


    @Override
    public boolean comparar(Opcion<String> opcion){
        if (this.valor == opcion.getValor()){
            return true;
        }
        return false;
    }


}
