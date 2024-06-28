package com;

import java.util.ArrayList;
import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Juego extends Application {
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private String preguntasPath;
    private DiccionarioPreguntas diccionarioPreguntas;
    private String ultimaTematica;

    public void iniciar(String args[]) {
        launch(args);
    }

    public void cargarPregunta(){
        Random random = new Random();
        int id = random.nextInt(24);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Juego Preguntas");
        stage.setWidth(500);
        stage.setHeight(500);
        crearVentanaInicio(stage);
        stage.show();
    }

    public void crearVentanaInicio(Stage stage) {
        VentanaInicio ventanaInicio = new VentanaInicio(stage);
        ventanaInicio.crearVentanaInicio(jugadores);
    }
}
