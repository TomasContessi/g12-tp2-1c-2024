package com.view.Contenedores;

import com.model.jugador.Jugador;
import com.view.ContenedorInicial;
import com.view.ContenedorPreguntas;
import com.view.VentanaInicio;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class CambioContenedores {
    VBox vbox = new VBox();
    public CambioContenedores(Stage stage, Scene scene, ArrayList<Jugador> jugadores, String momentoJuego) {
        if(momentoJuego == "Inicio"){
            vbox  = new ContenedorInicial(stage, scene);
        } else if (momentoJuego == "pregunta") {
            vbox  = new ContenedorPreguntas(stage, scene);
        } else {
            vbox = new VentanaInicio(jugadores, stage, scene);
        }



    }
    public Scene pedirEscena(){
        return new Scene(vbox,500,500);
    }
}
