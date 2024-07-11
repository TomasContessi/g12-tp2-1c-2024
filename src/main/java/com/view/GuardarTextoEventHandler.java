package com.view;

import com.model.jugador.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class GuardarTextoEventHandler implements EventHandler<ActionEvent> {
    TextField textField;
    String texto;
    Stage stage;
    Scene proximaEscena;

    public GuardarTextoEventHandler(Stage stage, Scene proximaEscena){
        this.textField = new TextField();
        this.stage = stage;
        this.proximaEscena = proximaEscena;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
         texto = textField.getText();
         stage.setScene(proximaEscena);

    }
}
