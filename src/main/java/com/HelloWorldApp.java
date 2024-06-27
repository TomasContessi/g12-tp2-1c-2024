package com;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloWorldApp {

    public static void main(String[] args) {
        // launch(args);
        Juego juego = new Juego();
        juego.iniciar(args);
    }

    // @Override
    // public void start(Stage primaryStage) {
    //     Label helloLabel = new Label("Hello World");

    //     ChoiceBox<String> choiceBox = new ChoiceBox<>();
    //     choiceBox.getItems().addAll("Option 1", "Option 2", "Option 3");

    //     Button button = new Button("Show Selected Option");
        
    //     button.setOnAction(e -> {
    //         String selectedOption = choiceBox.getValue();
    //         System.out.println("Selected Option: " + selectedOption);
    //     });

    //     VBox layout = new VBox(10); 
    //     layout.getChildren().addAll(helloLabel, choiceBox, button);

    //     Scene scene = new Scene(layout, 300, 200);
        
    //     primaryStage.setTitle("Hello World with Multiple Choice");
    //     primaryStage.setScene(scene);
    //     primaryStage.show();
    // }
}
