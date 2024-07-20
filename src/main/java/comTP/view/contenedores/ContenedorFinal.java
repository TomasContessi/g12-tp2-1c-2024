package comTP.view.contenedores;

import comTP.model.juego.Juego;
import comTP.model.jugador.Jugador;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ContenedorFinal extends VBox {
    Stage stage;

    public ContenedorFinal(Stage stage, Juego juego) {
        this.stage = stage;
        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
        this.setPadding(new Insets(20));

        juego.reiniciarJugadorActual();
        Jugador jugador = juego.getJugadorActual();
        while(jugador != null) {
            Label etiquePuntaje = new Label();
            etiquePuntaje.setFont(Font.font("Arial", FontWeight.BOLD, 15));
            etiquePuntaje.setText("PUNTOS: " + jugador.getNombre() + " " + jugador.getPuntos().valorNumerico());
            this.getChildren().addAll(etiquePuntaje);
            jugador = juego.getJugadorActual();
        }
    }
}
