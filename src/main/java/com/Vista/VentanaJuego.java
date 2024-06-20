package com.Vista;

import com.Modelo.Juego;

import javafx.application.Application;
import javafx.stage.Stage;

public class VentanaJuego extends Application {
    private static Juego juego;

    public static void juego(Juego juego) {
        VentanaJuego.juego = juego;
    }

    @Override
    public void start(Stage stage) {
        // VistaEscenaPregunta escenaPregunta = new VistaEscenaPregunta(juego.pregunta());
        // stage.setScene(escenaPregunta.crearEscena());
        // stage.setTitle("Juego preguntas");
        // stage.setWidth(500);
        // stage.setHeight(500);
        // stage.show();
    }
}
