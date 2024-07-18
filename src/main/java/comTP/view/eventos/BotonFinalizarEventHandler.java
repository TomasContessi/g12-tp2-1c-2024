package comTP.view.eventos;

import comTP.model.juego.Juego;
import comTP.model.jugador.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.util.List;

public class BotonFinalizarEventHandler implements EventHandler<ActionEvent> {
    Stage stage;
    Scene escenaPuntaje;
    List<Button> botonesOpciones;
    Juego juego;
    Label etiquetaNombreJugador;
    Jugador jugador;

    public BotonFinalizarEventHandler(Stage stage, Scene escenaPuntaje,
                                      List<Button> botonesOpciones, Juego juego,
                                      Label etiquetaNombreJugador, Jugador jugador) {
        this.stage = stage;
        this.escenaPuntaje = escenaPuntaje;
        this.botonesOpciones = botonesOpciones;
        this.juego = juego;
        this.etiquetaNombreJugador = etiquetaNombreJugador;
        this.jugador = jugador;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        reiniciarBotones();
        if(juego.ultimoJugador()) {
            //juego.reiniciarJugadorActual();
            stage.setScene(escenaPuntaje);
        }
        else {
            jugador = juego.cambiarJugador();
            etiquetaNombreJugador.setText(jugador.getNombre());
        }
    }

    private void reiniciarBotones() {
        for (Button boton : botonesOpciones) {
            boton.setStyle("-fx-scale-x: 0.5; -fx-scale-y: 0.5;");
            boton.setDisable(false);
        }
    }
}
