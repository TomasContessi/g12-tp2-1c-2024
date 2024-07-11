package com.view.Contenedores;

import com.model.jugador.Jugador;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Objects;

public class CambioContenedores {
    VBox vbox = new VBox();
    public CambioContenedores(Stage stage, Scene scene, ArrayList<Jugador> jugadores, String momentoJuego) {
        if(Objects.equals(momentoJuego, "Inicio")){
            vbox  = new ContenedorInicial(stage, scene);
        } else if (Objects.equals(momentoJuego, "Pregunta")) {
            vbox  = new ContenedorPreguntas(stage, scene);
        } else {
            vbox = new VentanaInicio(jugadores, stage, scene);
        }



    }
    public Scene pedirEscena(){
        return new Scene(vbox,500,500);
    }
}
