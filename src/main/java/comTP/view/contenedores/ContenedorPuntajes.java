package comTP.view.contenedores;

import comTP.model.juego.Juego;
import comTP.view.eventos.BotonSiguientePreguntaEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorPuntajes extends VBox {
    Stage stage;

    public ContenedorPuntajes(Stage stage, Juego juego) {
        this.stage = stage;
        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
        this.setPadding(new Insets(20));

        Button botonSiguientePregunta = new Button();
        botonSiguientePregunta.setText("SIGUIENTE PREGUNTA");
        BotonSiguientePreguntaEventHandler botonGuardarJugadorEvenHandler =
                new BotonSiguientePreguntaEventHandler(this.stage, juego);
        botonSiguientePregunta.setOnAction(botonGuardarJugadorEvenHandler);

        this.getChildren().addAll(botonSiguientePregunta);
    }
}
