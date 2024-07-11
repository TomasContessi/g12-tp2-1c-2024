package com.view;

import com.model.jugador.Jugador;
import com.view.Contenedores.CambioContenedores;
import com.view.Contenedores.ContenedorFinal;
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
    Scene sceneFinal;
    Scene escenaPreguntas;
    Scene escenaJugadores;

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        ContenedorFinal contenedorFinal = new ContenedorFinal(stage);
        this.sceneFinal = new Scene(contenedorFinal,500,500);
        this.escenaPreguntas = usarContenedores("Pregunta",this.sceneFinal);
        this.escenaJugadores = usarContenedores("Jugadores",this.escenaPreguntas);

        stage.setTitle("Juego Preguntas");
        stage.setWidth(500);
        stage.setHeight(500);

        this.scene =usarContenedores("Inicio",escenaJugadores);
        stage.setScene(this.scene);
        stage.show();

    }

//----------------------------------------------------------------------------------------------------------------------------------------------

    public Scene usarContenedores(String momentoJuego,Scene scene) {
        ArrayList <Jugador> jugadores = new ArrayList<>();
        CambioContenedores contenedores = new CambioContenedores(this.stage,scene,jugadores,momentoJuego);
        return contenedores.pedirEscena();
    }

}
