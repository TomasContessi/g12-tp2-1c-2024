package comTP.view.eventos;

import comTP.model.juego.Juego;
import comTP.view.contenedores.ContenedorPregunta;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BotonSiguientePreguntaEventHandler implements EventHandler<ActionEvent> {
    Stage stage;
    Juego juego;

    public BotonSiguientePreguntaEventHandler(Stage stage, Juego juego) {
        this.stage = stage;
        this.juego = juego;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        ContenedorPregunta contenedorPregunta = new ContenedorPregunta(stage, juego);
        Scene escenaJuego = new Scene(contenedorPregunta, 600, 500);
        stage.setScene(escenaJuego);
    }
}
