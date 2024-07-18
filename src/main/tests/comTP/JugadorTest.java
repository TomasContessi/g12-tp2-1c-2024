package comTP;

import comTP.model.jugador.Jugador;
import comTP.model.opcion.*;
import comTP.model.pregunta.PreguntaSimple;
import comTP.model.tipo.MultipleChoice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class JugadorTest {
//    @Test
//    public void test01AgregaTresOpciones(){
//        //Arrange
//        MultipleChoice tipo = new MultipleChoice();
//        ArrayList<Opcion> opciones = new ArrayList<>();
//        ArrayList<Opcion> respuestaCorrecta = new ArrayList<>();
//        opciones.add(new OpcionString("Messi"));
//        opciones.add(new OpcionString("Maradona"));
//        opciones.add(new OpcionString("Cristiano"));
//        respuestaCorrecta.add(new OpcionString("Messi"));
//        int opcionesElegidasEsperadas = 3;
//        int opcionesElegidas = 0;
//        String enunciado = "Jugador con mas balones de oro";
//        String tema = "Futbol";
//
//        Jugador jugador = new Jugador("Joel");
//        comTP.model.pregunta.PreguntaSimple pregunta = new comTP.model.pregunta.PreguntaSimple(tipo,respuestaCorrecta,enunciado,opciones,tema);
//
//        //Act
//        jugador.elegirOpcion(1);
//        jugador.agregarOpcion(pregunta);
//        jugador.elegirOpcion(2);
//        jugador.agregarOpcion(pregunta);
//        jugador.elegirOpcion(3);
//        jugador.agregarOpcion(pregunta);
//        opcionesElegidas = jugador.opcionesElegidas();
//
//        //Assert
//        Assertions.assertEquals(opcionesElegidasEsperadas,opcionesElegidas);
//    }
//
//    @Test
//    public void test02AgregaTresOpcionesYEliminaUna(){
//        //Arrange
//        MultipleChoice tipo = new MultipleChoice();
//        ArrayList<Opcion> opciones = new ArrayList<>();
//        ArrayList<Opcion> respuestaCorrecta = new ArrayList<>();
//        opciones.add(new OpcionString("Messi"));
//        opciones.add(new OpcionString("Maradona"));
//        opciones.add(new OpcionString("Cristiano"));
//        respuestaCorrecta.add(new OpcionString("Messi"));
//        respuestaCorrecta.add(new OpcionString("Maradona"));
//        int opcionesElegidasEsperadas = 2;
//        int opcionesElegidas = 0;
//        String enunciado = "Jugadores de la seleccion Argentina";
//        String tema = "Futbol";
//
//        Jugador jugador = new Jugador("Joel");
//        comTP.model.pregunta.PreguntaSimple pregunta = new comTP.model.pregunta.PreguntaSimple(tipo,respuestaCorrecta,enunciado,opciones,tema);
//
//        //Act
//        jugador.elegirOpcion(1);
//        jugador.agregarOpcion(pregunta);
//        jugador.elegirOpcion(2);
//        jugador.agregarOpcion(pregunta);
//        jugador.elegirOpcion(3);
//        jugador.agregarOpcion(pregunta);
//        jugador.eliminarOpcion();
//        opcionesElegidas = jugador.opcionesElegidas();
//
//        //Assert
//       Assertions.assertEquals(opcionesElegidasEsperadas,opcionesElegidas);
//    }
//
//    @Test
//    public void test03AgregaTresOpcionesEliminaUnaYBorraTodasLasOpciones(){
//        //Arrange
//        MultipleChoice tipo = new MultipleChoice();
//        ArrayList<Opcion> opciones = new ArrayList<>();
//        ArrayList<Opcion> respuestaCorrecta = new ArrayList<>();
//        opciones.add(new OpcionString("Messi"));
//        opciones.add(new OpcionString("Maradona"));
//        opciones.add(new OpcionString("Cristiano"));
//        respuestaCorrecta.add(new OpcionString("Messi"));
//        respuestaCorrecta.add(new OpcionString("Maradona"));
//        int opcionesElegidasEsperadas = 0;
//        int opcionesElegidas = 0;
//        String enunciado = "Jugadores de la seleccion Argentina";
//        String tema = "Futbol";
//
//        Jugador jugador = new Jugador("Joel");
//        comTP.model.pregunta.PreguntaSimple pregunta = new PreguntaSimple(tipo,respuestaCorrecta,enunciado,opciones,tema);
//
//        //Act
//        jugador.elegirOpcion(1);
//        jugador.agregarOpcion(pregunta);
//        jugador.elegirOpcion(2);
//        jugador.agregarOpcion(pregunta);
//        jugador.elegirOpcion(3);
//        jugador.agregarOpcion(pregunta);
//        jugador.eliminarOpcion();
//        jugador.cambiarRespuesta();
//        opcionesElegidas = jugador.opcionesElegidas();
//
//        //Assert
//        Assertions.assertEquals(opcionesElegidasEsperadas,opcionesElegidas);
//    }
}
