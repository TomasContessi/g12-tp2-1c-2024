package comTP.view.eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;


public class AgregarOpcionARespuestaJugadorEventHandler implements EventHandler<ActionEvent> {
    Button botonOpcion;

    public AgregarOpcionARespuestaJugadorEventHandler(Button botonOpcion) {
        this.botonOpcion = botonOpcion;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        botonOpcion.setStyle("-fx-background-color: black; -fx-scale-x: 0.5; -fx-scale-y: 0.5;");
        botonOpcion.setDisable(true);
    }
}
