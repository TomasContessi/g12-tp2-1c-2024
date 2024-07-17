package comTP.view.Contenedores;

import java.util.ArrayList;

import comTP.model.jugador.Jugador;

import comTP.view.CambiarEscenaEventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class VentanaInicio extends VBox{

    public VentanaInicio(ArrayList<Jugador> jugadores, Stage stage, Scene scene) {

        this.setSpacing(10);
        Label titulo = new Label();
        Label jugador = new Label();
        TextField textField = new TextField();

        titulo.setText("Inicio Juego");

        jugador.setText("Ingresar nombres Jugadores");

        Button guardarButton = new Button("Continuar");
        textField.setOnAction(e -> {
            String texto = textField.getText();
            Jugador jugadorNuevo = new Jugador(texto);
            jugadores.add(jugadorNuevo);
        });


        CambiarEscenaEventHandler botonCambiar = new CambiarEscenaEventHandler(stage,scene);
        guardarButton.setOnAction(botonCambiar);
        this.getChildren().addAll(titulo,jugador,textField,guardarButton);


    }
}
