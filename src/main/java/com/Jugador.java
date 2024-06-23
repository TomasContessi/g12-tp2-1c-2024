package com;

import java.util.ArrayList;

public class Jugador {
    private String name;
    private int puntos;
    private ArrayList<Multiplicador> multiplicadores;
    //private Anulador anulador;
    private Exclusividad exclusividad;
    int opcionElegida;
    ArrayList<Opcion> respuesta = new ArrayList<Opcion>();

    Jugador(String nombre){
        this.name = nombre;
        this.puntos = 0;
        this.multiplicadores = new ArrayList<>();
        this.exclusividad = new Exclusividad();
        this.opcionElegida = 0;
        this.respuesta = new ArrayList<>();
    }

    public ArrayList<Opcion> responderPregunta(){
        return respuesta;
    }
    void eliminarOpciones(){
        this.respuesta.clear();
    }
    void eliminarOpcion(){
        this.respuesta.remove(opcionElegida);
    }
    void agregarOpcion(Pregunta pregunta){
        this.respuesta.add(pregunta.getOpcion(opcionElegida));
    }
    void elegirOpcion(int opcionElegida){
        this.opcionElegida = (opcionElegida-1);
    }
    int opcionesElegidas(){
        return respuesta.size();
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
