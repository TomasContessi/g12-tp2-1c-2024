package com;

import org.junit.jupiter.api.Test;

import com.model.jugador.Jugador;
import com.model.opcion.Opcion;
import com.model.opcion.OpcionString;
import com.model.pregunta.Pregunta;
import com.model.tipo.MultipleChoiceConPenalidad;
import com.model.tipo.Tipo;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------


public class JugadorTest {
    @Test
    public void test01AgregaTresOpciones(){

        //Arrange
        Tipo tipo = new MultipleChoiceConPenalidad();
        ArrayList<Opcion> opciones = new ArrayList<>();
        ArrayList<Opcion> respuestaCorrecta = new ArrayList<>();
        opciones.add(new OpcionString("Messi"));
        opciones.add(new OpcionString("Maradona"));
        opciones.add(new OpcionString("Cristiano"));
        respuestaCorrecta.add(new OpcionString("Messi"));
        int opcionesElegidasEsperadas = 3;
        int opcionesElegidas = 0;
        String enunciado = "Jugador con mas balones de oro";
        String tema = "Futbol";

        Jugador jugador = new Jugador("Joel");
        Pregunta pregunta = new Pregunta(tipo,respuestaCorrecta,enunciado,opciones,tema);
        //Act
        jugador.elegirOpcion(1);
        jugador.agregarOpcion(pregunta);
        jugador.elegirOpcion(2);
        jugador.agregarOpcion(pregunta);
        jugador.elegirOpcion(3);
        jugador.agregarOpcion(pregunta);
        opcionesElegidas = jugador.opcionesElegidas();
        //Assert
        assertEquals(opcionesElegidasEsperadas,opcionesElegidas);
    }

    @Test
    public void test02AgregaTresOpcionesYEliminaUna(){

        //Arrange
        Tipo tipo = new MultipleChoiceConPenalidad();
        ArrayList<Opcion> opciones = new ArrayList<>();
        ArrayList<Opcion> respuestaCorrecta = new ArrayList<>();
        opciones.add(new OpcionString("Messi"));
        opciones.add(new OpcionString("Maradona"));
        opciones.add(new OpcionString("Cristiano"));
        respuestaCorrecta.add(new OpcionString("Messi"));
        respuestaCorrecta.add(new OpcionString("Maradona"));
        int opcionesElegidasEsperadas = 2;
        int opcionesElegidas = 0;
        String enunciado = "Jugadores de la seleccion Argentina";
        String tema = "Futbol";

        Jugador jugador = new Jugador("Joel");
        Pregunta pregunta = new Pregunta(tipo,respuestaCorrecta,enunciado,opciones,tema);
        //Act
        jugador.elegirOpcion(1);
        jugador.agregarOpcion(pregunta);
        jugador.elegirOpcion(2);
        jugador.agregarOpcion(pregunta);
        jugador.elegirOpcion(3);
        jugador.agregarOpcion(pregunta);
        jugador.eliminarOpcion();
        opcionesElegidas = jugador.opcionesElegidas();
        //Assert
       assertEquals(opcionesElegidasEsperadas,opcionesElegidas);

    }
    @Test
    public void test03AgregaTresOpcionesEliminaUnaYBorraTodasLasOpciones(){

        //Arrange
        Tipo tipo = new MultipleChoiceConPenalidad();
        ArrayList<Opcion> opciones = new ArrayList<>();
        ArrayList<Opcion> respuestaCorrecta = new ArrayList<>();
        opciones.add(new OpcionString("Messi"));
        opciones.add(new OpcionString("Maradona"));
        opciones.add(new OpcionString("Cristiano"));
        respuestaCorrecta.add(new OpcionString("Messi"));
        respuestaCorrecta.add(new OpcionString("Maradona"));
        int opcionesElegidasEsperadas = 0;
        int opcionesElegidas = 0;
        String enunciado = "Jugadores de la seleccion Argentina";
        String tema = "Futbol";

        Jugador jugador = new Jugador("Joel");
        Pregunta pregunta = new Pregunta(tipo,respuestaCorrecta,enunciado,opciones,tema);
        //Act
        jugador.elegirOpcion(1);
        jugador.agregarOpcion(pregunta);
        jugador.elegirOpcion(2);
        jugador.agregarOpcion(pregunta);
        jugador.elegirOpcion(3);
        jugador.agregarOpcion(pregunta);
        jugador.eliminarOpcion();
        jugador.eliminarOpciones();
        opcionesElegidas = jugador.opcionesElegidas();
        //Assert
        assertEquals(opcionesElegidasEsperadas,opcionesElegidas);

    }

}
