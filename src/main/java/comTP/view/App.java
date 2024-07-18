package comTP.view;

import comTP.model.juego.Juego;
import comTP.view.contenedores.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("JUEGO PREGUNTAS");

        Juego juego = new Juego();
        juego.setearPreguntas();

        ContenedorPregunta contenedorPregunta = new ContenedorPregunta(stage, juego);
        Scene escenaJuego = new Scene(contenedorPregunta, 800, 500);

        ContenedorBienvenida contenedorBienvenida = new ContenedorBienvenida(stage, juego, escenaJuego);
        Scene escenaBienvenida = new Scene(contenedorBienvenida, 600, 500);

        stage.setScene(escenaBienvenida);
        stage.show();
    }
}
