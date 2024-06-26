package com;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloWorldApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear el label "Hello World"
        Label helloLabel = new Label("Hello World");

        // Crear el ChoiceBox con opciones
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("Option 1", "Option 2", "Option 3");

        // Crear el botón
        Button button = new Button("Show Selected Option");
        
        // Añadir acción al botón
        button.setOnAction(e -> {
            String selectedOption = choiceBox.getValue();
            System.out.println("Selected Option: " + selectedOption);
        });

        // Crear el layout y añadir los componentes
        VBox layout = new VBox(10);  // Espaciado de 10 píxeles entre componentes
        layout.getChildren().addAll(helloLabel, choiceBox, button);

        // Crear la escena con el layout
        Scene scene = new Scene(layout, 300, 200);

        // Configurar el Stage
        primaryStage.setTitle("Hello World with Multiple Choice");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
