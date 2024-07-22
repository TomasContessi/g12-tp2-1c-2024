package comTP.model.juego;

public class ListaJugadoresVaciaException extends Exception {
    public ListaJugadoresVaciaException() {
        super("NO HA INGRESADO NINGUN JUGADOR, ASEGURATE DE DARLE AL BOTON GUARDAR");
    }
}
