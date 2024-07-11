module com {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires transitive javafx.graphics;


    exports com.model.juego;
    exports com.model.jugador;
    exports com.model.loader;
    exports com.model.modificador;
    exports com.model.opcion;
    exports com.model.pregunta;
    exports com.model.tipo;
    exports com.view;
    exports com.view.Contenedores;
}
