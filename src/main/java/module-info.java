module comTP {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires transitive javafx.graphics;

    exports comTP.model.juego;
    exports comTP.model.jugador;
    exports comTP.model.loader;
    exports comTP.model.modificador;
    exports comTP.model.opcion;
    exports comTP.model.pregunta;
    exports comTP.model.tipo;
    exports comTP.view;
    exports comTP.view.contenedores;
}
