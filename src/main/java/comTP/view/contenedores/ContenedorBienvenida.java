package comTP.view.contenedores;

import comTP.model.juego.Juego;
import comTP.view.eventos.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ContenedorBienvenida extends VBox {
    Stage stage;

    public ContenedorBienvenida(Stage stage, Juego juego, Scene escenaJuego) {
        super();
        this.stage = stage;
        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
        this.setPadding(new Insets(20));

        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(10);

        Label etiquetaTitulo = new Label();
        etiquetaTitulo.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        etiquetaTitulo.setText("BIENVENIDOS AL JUEGO DE PREGUNTAS");
        setMargin(etiquetaTitulo, new Insets(-50, 0, 0, 0));

        Label etiquetaSetJugadores = new Label();
        etiquetaSetJugadores.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        etiquetaSetJugadores.setText("Ingrese a los jugadores: ");

        TextField textFieldIngresoJugadores = new TextField();
        textFieldIngresoJugadores.setStyle("-fx-pref-width: 200px;");

        Button botonGuardarJugador = new Button();
        botonGuardarJugador.setText("Guardar");
        BotonGuardarJugadorEventHandler botonGuardarJugadorEvenHandler =
                new BotonGuardarJugadorEventHandler(juego, textFieldIngresoJugadores);
        botonGuardarJugador.setOnAction(botonGuardarJugadorEvenHandler);

        Button botonEmpezarJuego = new Button();
        botonEmpezarJuego.setText("EMPEZAR JUEGO");
        botonEmpezarJuego.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        setMargin(botonEmpezarJuego, new Insets(50, 0, 0, 0));
        BotonEmpezarJuegoEventHandler botonEmpezarJuegoEventHandler =
                new BotonEmpezarJuegoEventHandler(stage, escenaJuego);
        botonEmpezarJuego.setOnAction(botonEmpezarJuegoEventHandler);

        hbox.getChildren().addAll(etiquetaSetJugadores,
                textFieldIngresoJugadores, botonGuardarJugador);

        this.getChildren().addAll(etiquetaTitulo, hbox, botonEmpezarJuego);
    }
}
