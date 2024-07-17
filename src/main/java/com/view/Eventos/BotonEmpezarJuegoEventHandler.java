package com.view.Eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BotonEmpezarJuegoEventHandler implements EventHandler<ActionEvent> {
    Stage stage;
    Scene escenaJuego;

    public BotonEmpezarJuegoEventHandler(Stage stage, Scene escenaJuego) {
        this.stage = stage;
        this.escenaJuego = escenaJuego;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        stage.setScene(escenaJuego);
    }
}
