package comTP.model.jugador;

import java.util.ArrayList;

import comTP.model.modificador.Exclusividad;
import comTP.model.modificador.Multiplicador;
import comTP.model.opcion.Opcion;
import comTP.model.pregunta.Pregunta;

public class Jugador {
    private String name;
    private int puntos; //transformarlo en una clase
    private ArrayList<Multiplicador> multiplicadores;
    //private Anulador anulador;
    private Exclusividad exclusividad;
    private int opcionElegida;
    private ArrayList<Opcion> respuesta = new ArrayList<Opcion>(); //transformarlo en una clase

    public Jugador(String nombre){
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
    public void eliminarOpciones(){
        this.respuesta.clear();
    }
    public void eliminarOpcion(){
        this.respuesta.remove(opcionElegida);
    }
    public void agregarOpcion(Pregunta pregunta){
        this.respuesta.add(pregunta.getOpcion(opcionElegida));
    }
    public void elegirOpcion(int opcionElegida){
        this.opcionElegida = (opcionElegida-1);
    }
    public int opcionesElegidas(){
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
