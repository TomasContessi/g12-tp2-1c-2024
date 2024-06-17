import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LeerRespuestas {

        @Test
        public void test01LeerPreguntasPreguntaID1Con4OpcionesOrderedChoice() {

            int idPregunta = 1;

            String filePath = System.getProperty("user.home") + "/Descargas/preguntas.json";

            LeerPregunta pregunta = new LeerPregunta();

            ArrayList<Integer> opcionesCorrectas = new ArrayList<Integer>();

            pregunta.AsignarRespuesta(opcionesCorrectas, idPregunta, filePath);

            Respuesta nuevaRespuestaCorrecta = new Respuesta(opcionesCorrectas);

            pregunta.AsignarPregunta(new Pregunta(nuevaRespuestaCorrecta),idPregunta, filePath);

            //corroboCantidad de Opciones;
            assertEquals(4, pregunta.getOpciones().size());
            assertEquals("Televisor de tubo CRT", pregunta.getOpciones().get(0));
            assertEquals("Ordered Choice", pregunta.getTipo());
            assertEquals("CIENCIAS", pregunta.getTema());

            }

        @Test
        public void test02LeerPreguntasPreguntaID2Con4OpcionesMultipleChoiceSimpleObtenerCantidadDeRespuestas() {

            int idPregunta = 2;

            String filePath = System.getProperty("user.home") + "/Descargas/preguntas.json";

            LeerPregunta pregunta = new LeerPregunta();


            ArrayList<Integer> opcionesCorrectas = new ArrayList<Integer>();

            pregunta.AsignarRespuesta(opcionesCorrectas, idPregunta, filePath);

            Respuesta nuevaRespuestaCorrecta = new Respuesta(opcionesCorrectas);

            pregunta.AsignarPregunta(new Pregunta(nuevaRespuestaCorrecta),idPregunta, filePath);

            int opcion = opcionesCorrectas.get(0);

            assertEquals(1, opcionesCorrectas.size());

            //corroboro el numero de opcionCorrecta
            assertEquals(4, opcion);

            //cantidad de opciones
            assertEquals(5, pregunta.getOpciones().size());

            assertEquals("Revolver (Los Beatles)", pregunta.getOpciones().get(0));
            assertEquals("Multiple Choice Simple", pregunta.getTipo());
            assertEquals("ARTE", pregunta.getTema());

    }

        }


