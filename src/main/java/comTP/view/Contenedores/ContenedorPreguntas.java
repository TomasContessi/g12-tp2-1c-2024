package comTP.view.Contenedores;

import comTP.view.CambiarEscenaEventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorPreguntas extends VBox {
    Stage stage;
    Scene scene;
    int preguntasRestantes = 0;

    public ContenedorPreguntas(Stage stage, Scene proximaEscena) {

        super();
        //  this.preguntasRestantes = preguntasRestantes;
        this.stage = stage;
        //   this.scene = proximaEscena;
        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
        //this.setPadding(new Insets(20));
        Button boton = new Button();
        Button boton2 = new Button();
        Button boton3 = new Button();
        Label titulo = new Label();
        Label pregunta = new Label();


        String enunciado = "Enunciado de la pregunta";
        int numeroPregunta = 1;
        titulo.setText("Pregunta" + numeroPregunta);
        pregunta.setText(enunciado);
        boton.setText("1");
        boton2.setText("2");
        boton3.setText("3");

        CambiarEscenaEventHandler botonContinuar;

        this.getChildren().addAll(titulo, pregunta, boton, boton2, boton3);

        if (this.preguntasRestantes == 0) {
            this.scene = proximaEscena;
        }
        //this.preguntasRestantes -=1;

        botonContinuar = new CambiarEscenaEventHandler(stage, this.scene);
        boton.setOnAction(botonContinuar);
        boton2.setOnAction(botonContinuar);
        boton3.setOnAction(botonContinuar);

    }
}
