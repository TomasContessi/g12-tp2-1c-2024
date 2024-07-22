package comTP.view.contenedores;

import comTP.model.juego.Juego;
import comTP.model.jugador.Jugador;
import comTP.model.opcion.*;
import comTP.model.pregunta.*;
import comTP.view.eventos.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContenedorPregunta extends VBox {
    Stage stage;
    Map<Button, AgregarOpcionARespuestaJugadorEventHandler> botonesOpcionesYEvento;
    List<Button> botonesOpcion;
    ArrayList<Button> botonesMultiplicadores;

    public ContenedorPregunta(Stage stage, Juego juego) {
        this.stage = stage;
        this.configurarVBox();
        Pregunta pregunta = juego.obtenerPregunta();
        this.mostrarEnunciadoPregunta(pregunta);
        juego.reiniciarJugadorActual();
        Jugador jugadorActual = juego.getJugadorActual();
        Label etiquetaJugador = this.mostrarJugadorActual(jugadorActual);
        this.mostrarOpciones(pregunta);
        this.agregarOpcionesARespuestaJugadorActual(jugadorActual);
        this.mostrarBotonesMultiplicadores(jugadorActual, pregunta);
        this.finalizarOCancelarPregunta(juego, jugadorActual, pregunta, etiquetaJugador);
    }

    private void configurarVBox() {
        this.setSpacing(20);
        this.setPadding(new Insets(20));
    }

    private void mostrarEnunciadoPregunta(Pregunta pregunta) {
        Label etiquetaEnunciado = new Label();
        etiquetaEnunciado.setWrapText(true);
        etiquetaEnunciado.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        etiquetaEnunciado.setText("PREGUNTA " + pregunta.getTipoPregunta().toUpperCase() + ": " + pregunta.getEnunciado());
        this.getChildren().add(etiquetaEnunciado);
    }

    private Label mostrarJugadorActual(Jugador jugadorActual) {
        Label etiquetaJugador = new Label();
        etiquetaJugador.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        etiquetaJugador.setText("JUGADOR: " + jugadorActual.getNombre().toUpperCase());
        this.getChildren().add(etiquetaJugador);
        return etiquetaJugador;
    }

    private void mostrarOpciones(Pregunta pregunta) {
        Opcion opcion;
        int numeroOpcion = 1;
        botonesOpcionesYEvento = new HashMap<>();
        botonesOpcion = new ArrayList<>();
        while((opcion = pregunta.mostrarOpcion()) != null) {
            HBox hboxOpciones = new HBox();
            hboxOpciones.setAlignment(Pos.CENTER_LEFT);
            Button botonOpcion = new Button();
            botonOpcion.setMinSize(30, 30);
            botonOpcion.setStyle("-fx-scale-x: 0.5; -fx-scale-y: 0.5;");
            AgregarOpcionARespuestaJugadorEventHandler agregarOpcion =
                    new AgregarOpcionARespuestaJugadorEventHandler(botonOpcion, pregunta, numeroOpcion);
            botonesOpcion.add(botonOpcion);
            botonesOpcionesYEvento.put(botonOpcion, agregarOpcion);
            Label etiquetaOpcion = new Label();
            etiquetaOpcion.setText(opcion.obtenerValor());
            setMargin(etiquetaOpcion, new Insets(100, 0, 0, 0));
            hboxOpciones.getChildren().addAll(botonOpcion, etiquetaOpcion);
            this.getChildren().add(hboxOpciones);
            numeroOpcion++;
        }
    }

    private void agregarOpcionesARespuestaJugadorActual(Jugador jugadorActual) {
        for(Map.Entry<Button, AgregarOpcionARespuestaJugadorEventHandler> entry :
                botonesOpcionesYEvento.entrySet()) {
            Button boton = entry.getKey();
            AgregarOpcionARespuestaJugadorEventHandler agregarOpcion = entry.getValue();
            agregarOpcion.jugadorActual(jugadorActual);
            boton.setOnAction(agregarOpcion);
        }
    }

    private void mostrarBotonesMultiplicadores(Jugador jugadorActual, Pregunta pregunta) {
        Button botonMultiplicadorX2 = new Button();
        botonMultiplicadorX2.setText("MULTIPLICADOR X2");
        botonMultiplicadorX2.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        BotonMultiplicadorX2EventHandler multiplicarX2EventHandler =
                new BotonMultiplicadorX2EventHandler(jugadorActual, pregunta, botonMultiplicadorX2);
        botonMultiplicadorX2.setOnAction(multiplicarX2EventHandler);

        Button botonMultiplicadorX3 = new Button();
        botonMultiplicadorX3.setText("MULTIPLICADOR X3");
        botonMultiplicadorX3.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        BotonMultiplicadorX3EventHandler multiplicarX3EventHandler =
                new BotonMultiplicadorX3EventHandler(jugadorActual, pregunta, botonMultiplicadorX3);
        botonMultiplicadorX3.setOnAction(multiplicarX3EventHandler);

        botonesMultiplicadores = new ArrayList<>();
        botonesMultiplicadores.add(botonMultiplicadorX2);
        botonesMultiplicadores.add(botonMultiplicadorX3);

        HBox hboxBotonesMultiplicadores = new HBox();
        hboxBotonesMultiplicadores.setAlignment(Pos.CENTER_LEFT);
        hboxBotonesMultiplicadores.setSpacing(10);

        if(pregunta.tienePenalidad()) {
            hboxBotonesMultiplicadores.getChildren().addAll(botonMultiplicadorX2, botonMultiplicadorX3);
        }
        this.getChildren().add(hboxBotonesMultiplicadores);
    }

    private void finalizarOCancelarPregunta(Juego juego, Jugador jugadorActual, Pregunta pregunta,
                                               Label etiquetaJugador) {
        Button botonCancelarRespuesta = new Button();
        botonCancelarRespuesta.setText("CANCELAR RESPUESTA");
        botonCancelarRespuesta.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        BotonCancelarRespuestaEventHandler botonCancelarRespuestaEventHandler =
                new BotonCancelarRespuestaEventHandler(botonesOpcion);
        botonCancelarRespuestaEventHandler.jugadorActual(jugadorActual);
        botonCancelarRespuesta.setOnAction(botonCancelarRespuestaEventHandler);

        Button botonFinalizar = new Button();
        botonFinalizar.setText("FINALIZAR PREGUNTA");
        botonFinalizar.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        BotonFinalizarPreguntaEventHandler botonFinalizarEventHandler =
                new BotonFinalizarPreguntaEventHandler(this.stage, this.botonesOpcionesYEvento,
                        juego, jugadorActual, pregunta, this.botonesMultiplicadores,
                        etiquetaJugador, botonCancelarRespuestaEventHandler);
        botonFinalizar.setOnAction(botonFinalizarEventHandler);

        this.getChildren().addAll(botonFinalizar, botonCancelarRespuesta);
    }
}