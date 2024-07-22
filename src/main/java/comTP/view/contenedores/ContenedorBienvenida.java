package comTP.view.contenedores;

import comTP.model.juego.Juego;
import comTP.view.eventos.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ContenedorBienvenida extends VBox {
    public ContenedorBienvenida(Stage stage, Juego juego) {
        this.configuracionVBox();
        this.mostrarTitulo();
        this.configuracionJugadores(juego);
        this.empezarJuego(stage, juego);
    }

    private void configuracionVBox() {
        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
        this.setPadding(new Insets(20));
    }

    private void mostrarTitulo() {
        Label etiquetaTitulo = new Label();
        etiquetaTitulo.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        etiquetaTitulo.setText("BIENVENIDOS AL JUEGO DE PREGUNTAS");
        this.getChildren().add(etiquetaTitulo);
    }

    private void configuracionJugadores(Juego juego) {
        HBox configuracionJugadorHBox = new HBox();
        configuracionJugadorHBox.setAlignment(Pos.CENTER);
        configuracionJugadorHBox.setSpacing(10);

        Label etiquetaSetJugadores = new Label();
        etiquetaSetJugadores.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        etiquetaSetJugadores.setText("Ingrese a los jugadores: ");

        TextField textFieldIngresoJugadores = new TextField();
        textFieldIngresoJugadores.setStyle("-fx-pref-width: 200px;");

        Button botonGuardarJugador = new Button();
        botonGuardarJugador.setText("Guardar");
        botonGuardarJugador.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        BotonGuardarJugadorEventHandler botonGuardarJugadorEvenHandler =
                new BotonGuardarJugadorEventHandler(juego, textFieldIngresoJugadores);
        botonGuardarJugador.setOnAction(botonGuardarJugadorEvenHandler);

        configuracionJugadorHBox.getChildren().addAll(etiquetaSetJugadores, textFieldIngresoJugadores,
                botonGuardarJugador);

        this.getChildren().add(configuracionJugadorHBox);
    }

    private void empezarJuego(Stage stage, Juego juego) {
        Label etiquetaJugadoresVacio = new Label();
        etiquetaJugadoresVacio.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        etiquetaJugadoresVacio.setText("");

        Button botonEmpezarJuego = new Button();
        botonEmpezarJuego.setText("EMPEZAR JUEGO");
        botonEmpezarJuego.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        BotonEmpezarJuegoEventHandler botonEmpezarJuegoEventHandler =
                new BotonEmpezarJuegoEventHandler(stage, juego, etiquetaJugadoresVacio);
        botonEmpezarJuego.setOnAction(botonEmpezarJuegoEventHandler);

        this.getChildren().addAll(botonEmpezarJuego, etiquetaJugadoresVacio);
    }
}
