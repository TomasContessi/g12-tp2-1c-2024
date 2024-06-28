package com.view;


import javafx.scene.Parent;
import javafx.scene.Scene;

public class Escena {
    Scene escena;

    public Escena(Parent parent){
        this.escena = new Scene(parent);
    }
    Scene getEscena(){
        return this.escena;
    }
    void setEscena(javafx.scene.layout.StackPane layout){
        Scene scene = new Scene(layout);
    }
}