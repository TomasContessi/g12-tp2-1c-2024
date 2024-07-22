package comTP.view.eventos;

import comTP.model.juego.Juego;
import comTP.view.contenedores.ContenedorFinal;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BotonFinalizarJuegoEventHandler implements EventHandler<ActionEvent> {
    Stage stage;
    Juego juego;

    public BotonFinalizarJuegoEventHandler(Stage stage, Juego juego) {
        this.stage = stage;
        this.juego = juego;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        ContenedorFinal contenedorFinal = new ContenedorFinal(juego);
        Scene escenaFinal = new Scene(contenedorFinal, 600, 500);
        stage.setScene(escenaFinal);
    }
}
