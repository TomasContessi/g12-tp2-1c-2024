package comTP.view.eventos;

import comTP.model.juego.Juego;
import comTP.model.juego.ListaJugadoresVaciaException;
import comTP.view.contenedores.ContenedorPregunta;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;

public class BotonEmpezarJuegoEventHandler implements EventHandler<ActionEvent> {
    Stage stage;
    Juego juego;
    Label etiquetaJugadoresVacio;

    public BotonEmpezarJuegoEventHandler(Stage stage, Juego juego, Label etiquetaJugadoresVacio) {
        this.stage = stage;
        this.juego = juego;
        this.etiquetaJugadoresVacio = etiquetaJugadoresVacio;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        try {
            juego.verificarArrayJugadores();
            etiquetaJugadoresVacio.setVisible(false);
        } catch (ListaJugadoresVaciaException ex) {
            etiquetaJugadoresVacio.setText(ex.getMessage());
            mostrarYOcularMensaje();
            return;
        }
        this.cargarEscenaPregunta();
    }

    private void mostrarYOcularMensaje() {
        etiquetaJugadoresVacio.setVisible(true);
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(2.5),
                        new KeyValue(etiquetaJugadoresVacio.visibleProperty(), false))
        );
        timeline.play();
    }

    private void cargarEscenaPregunta() {
        ContenedorPregunta contenedorPregunta = new ContenedorPregunta(stage, juego);
        Scene escenaJuego = new Scene(contenedorPregunta, 600, 500);
        stage.setScene(escenaJuego);
    }
}
