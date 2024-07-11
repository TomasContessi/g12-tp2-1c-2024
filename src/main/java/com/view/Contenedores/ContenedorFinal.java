package com.view.Contenedores;

import com.model.juego.Juego;
import com.model.jugador.Jugador;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorFinal extends VBox {
    Stage stage;

    public ContenedorFinal(Stage stage) {

        super();

        this.stage = stage;

        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
        Label terminado = new Label("Juego finalizado");
        Button botonTermina = new Button("Salir");

        this.getChildren().addAll(terminado,botonTermina);
        botonTermina.setOnAction(e -> {
            stage.close();
        });

    }
}