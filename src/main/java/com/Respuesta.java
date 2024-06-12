package com;

import java.util.ArrayList;

public class Respuesta<T>{

    ArrayList<Opcion<T>> opciones;


    public Respuesta(ArrayList<Opcion<T>> opciones) {
        this.opciones = opciones;
    }


    public Opcion getOpcion(int posicion) {
        return this.opciones.get(posicion);
    }

    public int getTamanio() {
        return this.opciones.size();
    }

    public void agregarOpciones(Opcion opcion) {
         this.opciones.add(opcion);
    }



    int aciertosObtenidos(Respuesta respuestaComparar) {
        int puntos = 0;
        for (int i = 0; i < respuestaComparar.getTamanio() ; i++) {
            for(int j = 0; j < opciones.size() ; j++) {
                if (respuestaComparar.getOpcion(i).comparar(opciones.get(j))) {
                    puntos += 1;
                }
            }
        }
        return  puntos;
    }

}



