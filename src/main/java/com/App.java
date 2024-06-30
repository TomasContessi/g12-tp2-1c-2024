package com;

import com.model.juego.Juego;
import com.view.VentanaInicio;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    public void main(String[] args) {
        this.iniciar(args);
    }
//----------------------------------------------------------------------------------------------------------------------------------------------

    public void iniciar(String args[]) {
        launch(args);
    }
//----------------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public void start(Stage stage) {
        stage.setTitle("Juego Preguntas");
        stage.setWidth(500);
        stage.setHeight(500);
        crearVentanaInicio(stage);
        stage.show();
    }

//----------------------------------------------------------------------------------------------------------------------------------------------

    public void crearVentanaInicio(Stage stage) {
        VentanaInicio ventanaInicio = new VentanaInicio(stage);
        //ventanaInicio.crearVentanaInicio(jugadores);
    }

}
