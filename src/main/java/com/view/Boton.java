package com.view;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class Boton {
    Button boton;

    public Boton(){
        this.boton = new Button();
    }

    void setTextoBoton(String texto){
        this.boton.setText(texto);
    }

    Button getBoton(){
        return boton;
    }

    void setAccionBoton(){
        this.boton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("¡ Me han clickeado !");
            }
        });



    }

}
