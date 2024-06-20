package com.Vista;

import com.Modelo.Pregunta;

//import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class VistaEscenaPregunta{
    Pregunta pregunta;

    public VistaEscenaPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public Scene crearEscena() {
        VBox layout = new VBox();
        Scene scene = new Scene(layout);
        Label enunciadoPregunta = new Label();
        enunciadoPregunta.setText(pregunta.getEnunciado());
        layout.getChildren().add(enunciadoPregunta);
        return scene;
    }
}
