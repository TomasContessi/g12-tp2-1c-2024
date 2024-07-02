package com.view;

import com.model.jugador.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

public class GuardarTextoEventHandler implements EventHandler<ActionEvent> {
    TextField textField;

    public GuardarTextoEventHandler(){
        this.textField = new TextField();
    }
    /*
    public Jugador guardarJugador(){
        handle();
    }*/
    @Override
    public void handle(ActionEvent actionEvent) {
        String texto = textField.getText();
    }
}
