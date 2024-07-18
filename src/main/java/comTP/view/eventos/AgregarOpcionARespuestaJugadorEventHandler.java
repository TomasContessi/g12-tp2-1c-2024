package comTP.view.eventos;

import comTP.model.jugador.Jugador;
import comTP.model.pregunta.Pregunta;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;


public class AgregarOpcionARespuestaJugadorEventHandler implements EventHandler<ActionEvent> {
    Button botonOpcion;
    Jugador jugadorActual;
    Pregunta preguntaActual;
    int numeroOpcion;

    public AgregarOpcionARespuestaJugadorEventHandler(Button botonOpcion, Jugador jugadorActual, Pregunta pregunta, int numeroOpcion) {
        this.botonOpcion = botonOpcion;
        this.jugadorActual = jugadorActual;
        this.preguntaActual = pregunta;
        this.numeroOpcion = numeroOpcion;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        botonOpcion.setStyle("-fx-background-color: black; -fx-scale-x: 0.5; -fx-scale-y: 0.5;");
        botonOpcion.setDisable(true);
        jugadorActual.agregarOpcion(preguntaActual, numeroOpcion);
    }
}
