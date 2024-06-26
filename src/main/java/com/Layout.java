package com;

import javafx.scene.Node;
import javafx.scene.layout.StackPane;

public class Layout {
    StackPane layout;

    public Layout(){
        this.layout = new StackPane();
    }
    StackPane getLayout(){
        return layout;
    }

    void agregarNodo(Node node){
        layout.getChildren().add(node);
    }
}