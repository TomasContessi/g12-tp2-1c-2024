package comTP.view.contenedores;

import comTP.model.juego.Juego;
import comTP.model.jugador.Jugador;
import comTP.model.opcion.*;
import comTP.model.pregunta.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ContenedorPregunta extends VBox {
    Stage stage;

    public ContenedorPregunta(Stage stage, Juego juego) {
        super();
        this.stage = stage;
        this.setSpacing(20);
        this.setPadding(new Insets(20));

        Pregunta pregunta = juego.obtenerPregunta();
        Label etiqueEnunciado = new Label();
        etiqueEnunciado.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        etiqueEnunciado.setText("PREGUNTA: " + pregunta.getEnunciado());

        this.getChildren().addAll(etiqueEnunciado);

//        Jugador jugador = juego.jugadorQueVaAResponderPregunta();
//        juego.jugadorRespondePregunta(jugador, pregunta, 1);

        Opcion opcion;
        while((opcion = pregunta.mostrarOpcion()) != null) {
            HBox hboxOpciones = new HBox();
            hboxOpciones.setAlignment(Pos.CENTER_LEFT); // Alineación horizontal izquierda
            Button botonOpcion = new Button();
            botonOpcion.setMinSize(30, 30);
            botonOpcion.setStyle("-fx-scale-x: 0.5; -fx-scale-y: 0.5;");
            Label etiquetaOpcion = new Label();
            etiquetaOpcion.setText(opcion.obtenerValor());
            setMargin(etiquetaOpcion, new Insets(100, 0, 0, 0));
            hboxOpciones.getChildren().addAll(botonOpcion, etiquetaOpcion);
            this.getChildren().add(hboxOpciones);
        }
    }
}