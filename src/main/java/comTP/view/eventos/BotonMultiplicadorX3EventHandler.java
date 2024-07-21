package comTP.view.eventos;

import comTP.model.jugador.Jugador;
import comTP.model.modificador.MultiplicadorX3;
import comTP.model.pregunta.Pregunta;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class BotonMultiplicadorX3EventHandler implements EventHandler<ActionEvent> {
    Jugador jugador;
    Pregunta pregunta;
    Button botonMultiplicador;

    public BotonMultiplicadorX3EventHandler(Jugador jugador, Pregunta pregunta,
                                            Button botonMultiplicador) {
        this.jugador = jugador;
        this.pregunta = pregunta;
        this.botonMultiplicador = botonMultiplicador;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        jugador.usarMultiplicador(pregunta, new MultiplicadorX3());
        botonMultiplicador.setDisable(true);
    }
}
