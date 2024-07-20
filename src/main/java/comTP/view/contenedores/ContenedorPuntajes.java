package comTP.view.contenedores;

import comTP.model.juego.Juego;
import comTP.model.jugador.Jugador;
import comTP.model.modificador.Puntaje;
import comTP.view.eventos.BotonFinalizarJuegoEventHandler;
import comTP.view.eventos.BotonSiguientePreguntaEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.util.Map;

public class ContenedorPuntajes extends VBox {
    Stage stage;

    public ContenedorPuntajes(Stage stage, Juego juego) {
        this.stage = stage;
        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
        this.setPadding(new Insets(20));

        juego.resetearRespuestasJugadores();
        juego.asignarPuntajeJugador();

        for (Map.Entry<Jugador, Puntaje> entry : juego.iterableJugadorPuntajes()) {
            Label etiquePuntaje = new Label();
            etiquePuntaje.setFont(Font.font("Arial", FontWeight.BOLD, 13));
            Jugador jugador = entry.getKey();
            Puntaje puntaje = entry.getValue();
            etiquePuntaje.setText("PUNTOS: " + jugador.getNombre() + " " + puntaje.valorNumerico());
            this.getChildren().addAll(etiquePuntaje);
        }

        Button botonSiguientePregunta = new Button();
        botonSiguientePregunta.setText("SIGUIENTE PREGUNTA");
        BotonSiguientePreguntaEventHandler botonGuardarJugadorEvenHandler =
                new BotonSiguientePreguntaEventHandler(this.stage, juego);
        botonSiguientePregunta.setOnAction(botonGuardarJugadorEvenHandler);

        Button botonFinalizarJuego = new Button();
        botonFinalizarJuego.setText("FINALIZAR JUEGO");
        BotonFinalizarJuegoEventHandler botonFinalizarJuegoEventHandler =
                new BotonFinalizarJuegoEventHandler(this.stage, juego);
        botonFinalizarJuego.setOnAction(botonFinalizarJuegoEventHandler);

        this.getChildren().addAll(botonSiguientePregunta, botonFinalizarJuego);
    }
}
