package comTP.view.eventos;

import comTP.model.juego.Juego;
import comTP.model.jugador.Jugador;
import comTP.model.pregunta.Pregunta;
import comTP.view.contenedores.ContenedorPuntajes;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.util.Map;

public class BotonFinalizarEventHandler implements EventHandler<ActionEvent> {
    Stage stage;
    Map<Button, AgregarOpcionARespuestaJugadorEventHandler> botonesOpciones;
    Juego juego;
    Jugador jugadorActual;
    Pregunta pregunta;

    public BotonFinalizarEventHandler(Stage stage,
                                      Map<Button, AgregarOpcionARespuestaJugadorEventHandler> botonesOpciones,
                                      Juego juego, Jugador jugadorActual, Pregunta pregunta) {
        this.stage = stage;
        this.botonesOpciones = botonesOpciones;
        this.juego = juego;
        this.jugadorActual = jugadorActual;
        this.pregunta = pregunta;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        juego.verificarRespuestaJugador(jugadorActual, pregunta);
        if(juego.ultimoJugador()) {
            ContenedorPuntajes contenedorPuntajes = new ContenedorPuntajes(stage, juego);
            Scene escenaPuntajes = new Scene(contenedorPuntajes, 600, 500);
            stage.setScene(escenaPuntajes);
        }
        else {
            reiniciarBotones();
        }
    }

    private void reiniciarBotones() {
        jugadorActual = juego.getJugadorActual();
        for(Map.Entry<Button, AgregarOpcionARespuestaJugadorEventHandler> entry :
                botonesOpciones.entrySet()) {
            Button boton = entry.getKey();
            boton.setStyle("-fx-scale-x: 0.5; -fx-scale-y: 0.5;");
            boton.setDisable(false);
            AgregarOpcionARespuestaJugadorEventHandler agregarOpcion = entry.getValue();
            agregarOpcion.jugadorActual(jugadorActual);
        }
    }
}
