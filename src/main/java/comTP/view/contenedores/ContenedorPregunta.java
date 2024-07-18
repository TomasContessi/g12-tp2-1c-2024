package comTP.view.contenedores;

import comTP.model.juego.Juego;
import comTP.model.jugador.Jugador;
import comTP.model.opcion.*;
import comTP.model.pregunta.*;
import comTP.view.eventos.AgregarOpcionARespuestaJugadorEventHandler;
import comTP.view.eventos.BotonFinalizarEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;

public class ContenedorPregunta extends VBox {
    Stage stage;
    List<Button> botonesOpciones;

    public ContenedorPregunta(Stage stage, Juego juego, Scene escenaPuntaje) {
        super();
        this.stage = stage;
        this.setSpacing(20);
        this.setPadding(new Insets(20));

        Pregunta pregunta = juego.obtenerPregunta();
        Label etiqueEnunciado = new Label();
        etiqueEnunciado.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        etiqueEnunciado.setText("PREGUNTA: " + pregunta.getEnunciado());

        juego.reiniciarJugadorActual();
        Jugador jugadorActual = juego.getJugadorActual();
        Label etiqueNombreJugador = new Label();
        etiqueNombreJugador.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        etiqueNombreJugador.setText(jugadorActual.getNombre());

        this.getChildren().addAll(etiqueEnunciado, etiqueNombreJugador);

        Opcion opcion;
        int numeroOpcion = 1;
        botonesOpciones = new ArrayList<>();
        while((opcion = pregunta.mostrarOpcion()) != null) {
            HBox hboxOpciones = new HBox();
            hboxOpciones.setAlignment(Pos.CENTER_LEFT); // Alineación horizontal izquierda
            Button botonOpcion = new Button();
            botonesOpciones.add(botonOpcion);
            botonOpcion.setMinSize(30, 30);
            botonOpcion.setStyle("-fx-scale-x: 0.5; -fx-scale-y: 0.5;");
            AgregarOpcionARespuestaJugadorEventHandler agregarOpcion =
                    new AgregarOpcionARespuestaJugadorEventHandler(botonOpcion, jugadorActual, pregunta, numeroOpcion);

            botonOpcion.setOnAction(agregarOpcion);
            Label etiquetaOpcion = new Label();
            etiquetaOpcion.setText(opcion.obtenerValor());
            setMargin(etiquetaOpcion, new Insets(100, 0, 0, 0));
            hboxOpciones.getChildren().addAll(botonOpcion, etiquetaOpcion);
            this.getChildren().add(hboxOpciones);
            numeroOpcion++;

        }

        Button botonFinalizar = new Button();
        botonFinalizar.setText("FINALIZAR");
        BotonFinalizarEventHandler botonFinalizarEventHandler =
                new BotonFinalizarEventHandler(this.stage,
                        escenaPuntaje, botonesOpciones, juego, etiqueNombreJugador, jugadorActual);
        botonFinalizar.setOnAction(botonFinalizarEventHandler);
        this.getChildren().add(botonFinalizar);
    }

}
