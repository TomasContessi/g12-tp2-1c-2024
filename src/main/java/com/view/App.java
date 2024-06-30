package com.view;

import com.model.jugador.Jugador;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }
//----------------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Juego Preguntas");
        stage.setWidth(500);
        stage.setHeight(500);
        ContenedorInicial contenedorInicial = new ContenedorInicial(stage,crearVentanaInicio());
        Scene escena = new Scene(contenedorInicial,500,500);
        stage.setScene(escena);
        stage.show();
    }

//----------------------------------------------------------------------------------------------------------------------------------------------

    public Scene crearVentanaInicio( ) {
        ArrayList <Jugador> jugadores = new ArrayList<>();
        VentanaInicio ventanaInicio = new VentanaInicio();
        return ventanaInicio.crearVentanaInicio(jugadores);
    }

}
