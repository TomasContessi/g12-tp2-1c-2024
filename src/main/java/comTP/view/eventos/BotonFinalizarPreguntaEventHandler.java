package comTP.view.eventos;

import comTP.model.juego.Juego;
import comTP.model.jugador.Jugador;
import comTP.model.modificador.MultiplicadorX1;
import comTP.model.pregunta.Pregunta;
import comTP.view.contenedores.ContenedorPuntajes;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Map;

public class BotonFinalizarPreguntaEventHandler implements EventHandler<ActionEvent> {
    Stage stage;
    Map<Button, AgregarOpcionARespuestaJugadorEventHandler> botonesOpciones;
    Juego juego;
    Jugador jugadorActual;
    Pregunta pregunta;
    ArrayList<Button> botonesMultiplicadores;
    Label etiquetaJugador;
    BotonCancelarRespuestaEventHandler eventoCancelarRespuesta;

    public BotonFinalizarPreguntaEventHandler(Stage stage,
                                              Map<Button, AgregarOpcionARespuestaJugadorEventHandler> botonesOpciones,
                                              Juego juego, Jugador jugadorActual,
                                              Pregunta pregunta, ArrayList<Button> botonesMultiplicadores, Label etiquetaJugador,
                                              BotonCancelarRespuestaEventHandler eventoCancelarRespuesta) {
        this.stage = stage;
        this.botonesOpciones = botonesOpciones;
        this.juego = juego;
        this.jugadorActual = jugadorActual;
        this.pregunta = pregunta;
        this.botonesMultiplicadores = botonesMultiplicadores;
        this.etiquetaJugador = etiquetaJugador;
        this.eventoCancelarRespuesta = eventoCancelarRespuesta;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        juego.verificarRespuestaJugador(jugadorActual, pregunta);
        if(juego.ultimoJugador()) {
            ContenedorPuntajes contenedorPuntajes = new ContenedorPuntajes(stage, juego, pregunta);
            Scene escenaPuntajes = new Scene(contenedorPuntajes, 650, 500);
            stage.setScene(escenaPuntajes);
        }
        else {
            reiniciarPregunta();
        }
    }

    private void reiniciarPregunta() {
        jugadorActual = juego.getJugadorActual();
        etiquetaJugador.setText("JUGADOR: " + jugadorActual.getNombre().toUpperCase());
        pregunta.setMultiplicador(new MultiplicadorX1());
        reiniciarBotonesOpcion();
        reiniciarBotonesMultiplicadores();
        eventoCancelarRespuesta.jugadorActual(jugadorActual);
    }

    private void reiniciarBotonesOpcion() {
        for(Map.Entry<Button, AgregarOpcionARespuestaJugadorEventHandler> entry :
                botonesOpciones.entrySet()) {
            Button boton = entry.getKey();
            boton.setStyle("-fx-scale-x: 0.5; -fx-scale-y: 0.5;");
            boton.setDisable(false);
            AgregarOpcionARespuestaJugadorEventHandler agregarOpcion = entry.getValue();
            agregarOpcion.jugadorActual(jugadorActual);
        }
    }

    private void reiniciarBotonesMultiplicadores() {
        for(Button button : botonesMultiplicadores) {
            button.setDisable(false);
        }
    }
}
