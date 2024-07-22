package comTP.view.eventos;

import comTP.model.juego.Juego;
import comTP.model.jugador.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

public class BotonGuardarJugadorEventHandler implements EventHandler<ActionEvent> {
    Juego juego;
    TextField textFieldNombreJugador;

    public BotonGuardarJugadorEventHandler(Juego juego,
                                           TextField textFieldNombreJugador) {
        this.juego = juego;
        this.textFieldNombreJugador = textFieldNombreJugador;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if(!textFieldNombreJugador.getText().isEmpty()) {
            juego.agregarJugador(new Jugador(textFieldNombreJugador.getText()));
            textFieldNombreJugador.clear();
        }
    }
}