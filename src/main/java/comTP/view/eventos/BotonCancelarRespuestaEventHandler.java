package comTP.view.eventos;

import comTP.model.jugador.Jugador;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.util.List;

public class BotonCancelarRespuestaEventHandler implements EventHandler<ActionEvent> {
    private final List<Button> botonesOpcion;
    private Jugador jugadorActual;

    public BotonCancelarRespuestaEventHandler(List<Button> botonesOpcion) {
        this.botonesOpcion = botonesOpcion;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        jugadorActual.cambiarRespuesta();
        reiniciarBotones();
    }

    public void reiniciarBotones() {
        for(Button boton : botonesOpcion) {
            boton.setStyle("-fx-scale-x: 0.5; -fx-scale-y: 0.5;");
            boton.setDisable(false);
        }
    }

    public void jugadorActual(Jugador jugador) {
        this.jugadorActual = jugador;
    }
}
