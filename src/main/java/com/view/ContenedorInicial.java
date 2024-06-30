package com.view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorInicial extends VBox {
    Stage stage;
    public ContenedorInicial(Stage stage, Scene proximaEscena) {

        super();
        this.stage = stage;
        Button boton = new Button();
        boton.setText("Comenzar juego");
        CambiarEscenaEventHandler botonComenzar = new CambiarEscenaEventHandler(stage, proximaEscena);
        boton.setOnAction(botonComenzar);


    }

}
