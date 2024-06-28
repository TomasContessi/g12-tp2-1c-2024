package com;

import java.util.ArrayList;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VentanaInicio {
    Stage stage;

    public VentanaInicio(Stage stage) {
        this.stage = stage;
    }

    public void crearVentanaInicio(ArrayList<Jugador> jugadores) {
        VBox layout = new VBox();
        layout.setSpacing(10);
        Label titulo = new Label();
        Label jugador = new Label();
        TextField textField = new TextField();

        titulo.setText("Inicio Juego");
        layout.getChildren().add(titulo);

        jugador.setText("Ingresar nombres Jugadores");
        layout.getChildren().add(jugador);

        layout.getChildren().add(textField);

        Button guardarButton = new Button("Guardar jugador");
        guardarButton.setOnAction(e -> {
            String texto = textField.getText();
            Jugador jugadorNuevo = new Jugador(texto);
            jugadores.add(jugadorNuevo);
        });

        layout.getChildren().add(guardarButton);

        Scene scene = new Scene(layout);
        stage.setScene(scene);
    }
}
