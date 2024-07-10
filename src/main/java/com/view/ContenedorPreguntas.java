package com.view;

import com.model.juego.Juego;
import com.model.pregunta.Pregunta;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorPreguntas extends VBox {
    Stage stage;
    public ContenedorPreguntas(Stage stage, Scene proximaEscena) {

        super();
        this.stage = stage;
        Juego juego = new Juego();
        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
        //this.setPadding(new Insets(20));
        Button boton = new Button();
        Button boton2 = new Button();
        Button boton3 = new Button();
        Label titulo = new Label();
        Label pregunta = new Label();



















        String enunciado = "Enunciado de la pregunta";
        int numeroPregunta = 1;
        titulo.setText("Pregunta" + numeroPregunta);
        pregunta.setText(enunciado);
        boton.setText("1");
        boton2.setText("2");
        boton3.setText("3");

        this.getChildren().addAll(titulo,pregunta,boton,boton2,boton3);
        CambiarEscenaEventHandler botonContinuar = new CambiarEscenaEventHandler(stage, proximaEscena);
        boton.setOnAction(botonContinuar);
        boton2.setOnAction(botonContinuar);
        boton3.setOnAction(botonContinuar);

    }

}
