package com.view;

import com.model.jugador.Jugador;
import com.view.Contenedores.CambioContenedores;
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

        this.scene =usarContenedores();
        stage.setScene(this.scene);
        stage.show();

    }

//----------------------------------------------------------------------------------------------------------------------------------------------

    public Scene usarContenedores() {
        ArrayList <Jugador> jugadores = new ArrayList<>();
        CambioContenedores contenedores = new CambioContenedores(this.stage,this.scene,jugadores,"inicio");
        return contenedores.pedirEscena();
    }

}
