package com.view.Contenedores;

import com.view.Eventos.GuardarTextoEventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorInicial extends VBox {
    Stage stage;
    public ContenedorInicial(Stage stage, Scene proximaEscena) {

        super();
        this.stage = stage;

        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
        //this.setPadding(new Insets(20));
        Label titulo = new Label();
        titulo.setText("Ingresar cantidad de jugadores");
        TextField textField = new TextField();


        this.getChildren().addAll(titulo,textField);
        GuardarTextoEventHandler guardarTexto = new GuardarTextoEventHandler(stage, proximaEscena);
        textField.setOnAction(guardarTexto);

    }

}
