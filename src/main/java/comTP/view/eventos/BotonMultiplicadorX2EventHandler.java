package comTP.view.eventos;

import comTP.model.jugador.Jugador;
import comTP.model.modificador.MultiplicadorX2;
import comTP.model.pregunta.Pregunta;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class BotonMultiplicadorX2EventHandler implements EventHandler<ActionEvent> {
    Jugador jugador;
    Pregunta pregunta;
    Button botonMultiplicador;

    public BotonMultiplicadorX2EventHandler(Jugador jugador, Pregunta pregunta,
                                            Button botonMultiplicador) {
        this.jugador = jugador;
        this.pregunta = pregunta;
        this.botonMultiplicador = botonMultiplicador;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        jugador.usarMultiplicador(pregunta, new MultiplicadorX2());
        botonMultiplicador.setDisable(true);
    }
}
