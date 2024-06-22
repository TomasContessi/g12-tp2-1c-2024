package com;

import java.util.ArrayList;

public class Jugador {
    private String name;
    private int puntos;
    private ArrayList<Multiplicador> multiplicadores;
    //private Anulador anulador;
    //private Exclusividad exclusividad;

    Jugador(String nombre){
        this.name = nombre;
    }

    public ArrayList<Opcion> responderPregunta(Pregunta pregunta){
        ArrayList<Opcion> respuesta = new ArrayList<Opcion>();
        //this.elegirOpcion(pregunta);
      //  pregunta.setMultiplicador(multiplicadores.get(0));
        return respuesta;
    }

    void elegirOpcion(ArrayList<Opcion> opcionesAElegir,ArrayList<Opcion> opcionesElegidas){
        opcionesElegidas.add(opcionesAElegir.get(0));
    }

    public void asignarPuntos(int puntos){
        this.puntos += puntos;
    }

    public int getPuntos(){
        return this.puntos;
    }

    public String getNombre(){
        return this.name;
    }
}
