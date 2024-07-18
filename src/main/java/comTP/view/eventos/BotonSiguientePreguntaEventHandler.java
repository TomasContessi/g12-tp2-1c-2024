package comTP.view.eventos;

import comTP.model.juego.Juego;
import comTP.view.contenedores.ContenedorPregunta;
import comTP.view.contenedores.ContenedorPuntajes;
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
        ContenedorPuntajes contenedorPuntajes = new ContenedorPuntajes(stage, juego);
        Scene escenaPuntajes = new Scene(contenedorPuntajes, 600, 500);

        ContenedorPregunta contenedorPregunta = new ContenedorPregunta(stage, juego, escenaPuntajes);
        Scene escenaJuego = new Scene(contenedorPregunta, 800, 500);

        stage.setScene(escenaJuego);
    }
}
