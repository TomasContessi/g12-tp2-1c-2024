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
    Stage stage;
    Scene scene;

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        stage.setTitle("Juego Preguntas");
        stage.setWidth(500);
        stage.setHeight(500);
        ContenedorPreguntas contenedorPregunta = new ContenedorPreguntas(stage,this.scene);
        this.scene =new Scene(contenedorPregunta,500,500);
        this.scene = new Scene(this.crearVentanaInicio(),500,500);
        ContenedorInicial contenedorInicial = new ContenedorInicial(stage,this.scene);
        this.scene = new Scene(contenedorInicial,500,500);
        stage.setScene(this.scene);

        stage.show();

    }

//----------------------------------------------------------------------------------------------------------------------------------------------

    public VentanaInicio crearVentanaInicio() {
        ArrayList <Jugador> jugadores = new ArrayList<>();
        return new VentanaInicio(jugadores,this.stage,this.scene);
    }

}
