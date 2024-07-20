package comTP.view.contenedores;

import comTP.model.juego.Juego;
import comTP.model.jugador.Jugador;
import comTP.model.opcion.*;
import comTP.model.pregunta.*;
import comTP.view.eventos.AgregarOpcionARespuestaJugadorEventHandler;
import comTP.view.eventos.BotonFinalizarEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.util.HashMap;
import java.util.Map;

public class ContenedorPregunta extends VBox {
    Stage stage;
    Map<Button, AgregarOpcionARespuestaJugadorEventHandler> botonesOpciones;

    public ContenedorPregunta(Stage stage, Juego juego) {
        super();
        this.stage = stage;
        this.setSpacing(20);
        this.setPadding(new Insets(20));

        Pregunta pregunta = juego.obtenerPregunta();
        Label etiqueEnunciado = new Label();
        etiqueEnunciado.setWrapText(true);
        etiqueEnunciado.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        etiqueEnunciado.setText("PREGUNTA: " + pregunta.getEnunciado());
        this.getChildren().addAll(etiqueEnunciado);

        juego.reiniciarJugadorActual();
        Jugador jugadorActual = juego.getJugadorActual();

        Opcion opcion;
        int numeroOpcion = 1;
        botonesOpciones = new HashMap<>();
        while((opcion = pregunta.mostrarOpcion()) != null) {
            HBox hboxOpciones = new HBox();
            hboxOpciones.setAlignment(Pos.CENTER_LEFT);
            Button botonOpcion = new Button();
            botonOpcion.setMinSize(30, 30);
            botonOpcion.setStyle("-fx-scale-x: 0.5; -fx-scale-y: 0.5;");
            AgregarOpcionARespuestaJugadorEventHandler agregarOpcion =
                    new AgregarOpcionARespuestaJugadorEventHandler(botonOpcion, pregunta, numeroOpcion);
            botonesOpciones.put(botonOpcion, agregarOpcion);
            Label etiquetaOpcion = new Label();
            etiquetaOpcion.setText(opcion.obtenerValor());
            setMargin(etiquetaOpcion, new Insets(100, 0, 0, 0));
            hboxOpciones.getChildren().addAll(botonOpcion, etiquetaOpcion);
            this.getChildren().add(hboxOpciones);
            numeroOpcion++;
        }

        for(Map.Entry<Button, AgregarOpcionARespuestaJugadorEventHandler> entry :
                botonesOpciones.entrySet()) {
            Button boton = entry.getKey();
            AgregarOpcionARespuestaJugadorEventHandler agregarOpcion = entry.getValue();
            agregarOpcion.jugadorActual(jugadorActual);
            boton.setOnAction(agregarOpcion);
        }

        Button botonFinalizar = new Button();
        botonFinalizar.setText("FINALIZAR");
        BotonFinalizarEventHandler botonFinalizarEventHandler =
                new BotonFinalizarEventHandler(this.stage, botonesOpciones,
                        juego, jugadorActual, pregunta);
        botonFinalizar.setOnAction(botonFinalizarEventHandler);
        this.getChildren().add(botonFinalizar);
    }
}