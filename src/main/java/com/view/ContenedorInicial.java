package com.view;

import com.model.jugador.Jugador;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorInicial extends VBox {
    Stage stage;
    public ContenedorInicial(Stage stage, Scene proximaEscena) {

        super();
        this.stage = stage;

        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
        //this.setPadding(new Insets(20));
        Button boton = new Button();
        Label titulo = new Label();
        titulo.setText("Ingresar cantidad de jugadores");
        TextField textField = new TextField();
        boton.setText("Continuar");

        textField.setOnAction(e -> {
            int cantidadJugadores = Integer.parseInt(textField.getText());
        });

        this.getChildren().addAll(titulo,textField,boton);
        CambiarEscenaEventHandler botonContinuar = new CambiarEscenaEventHandler(stage, proximaEscena);
        boton.setOnAction(botonContinuar);

    }

}
