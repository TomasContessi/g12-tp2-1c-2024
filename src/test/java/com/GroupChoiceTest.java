package com;

import org.junit.jupiter.api.Test;

import com.model.opcion.Opcion;
import com.model.opcion.OpcionString;
import com.model.pregunta.PreguntaSimple;
import com.model.tipo.GroupChoice;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupChoiceTest {
    @Test
    public void test01GroupChoiceAciertaTodas() {
        // arrange
        ArrayList<Opcion> grupo1Correcto = new ArrayList<Opcion>();
        ArrayList<Opcion> grupo2Correcto = new ArrayList<Opcion>();
        ArrayList<Opcion> grupo1 = new ArrayList<Opcion>();
        ArrayList<Opcion> grupo2 = new ArrayList<Opcion>();

        grupo1Correcto.add(new OpcionString("uno"));
        grupo1Correcto.add(new OpcionString("dos"));

        grupo2Correcto.add(new OpcionString("tres"));
        grupo2Correcto.add(new OpcionString("cuatro"));

        grupo1.add(new OpcionString("uno"));
        grupo1.add(new OpcionString("dos"));

        grupo2.add(new OpcionString("tres"));
        grupo2.add(new OpcionString("cuatro"));

        int resultadoObtenido;
        int resultadoEsperado = 1;

        GroupChoice tipoPregunta = new GroupChoice("Grupo A", "Grupo B");
        PreguntaSimple preguntaGroupChoice = new PreguntaSimple(tipoPregunta, grupo1Correcto);

        // act
        resultadoObtenido = preguntaGroupChoice.verificarRespuesta(grupo1);

        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void test02GroupChoiceAciertaAlgunas() {
        // arrange
        ArrayList<Opcion> grupo1Correcto = new ArrayList<Opcion>();
        ArrayList<Opcion> grupo2Correcto = new ArrayList<Opcion>();
        ArrayList<Opcion> grupo1 = new ArrayList<Opcion>();
        ArrayList<Opcion> grupo2 = new ArrayList<Opcion>();

        grupo1Correcto.add(new OpcionString("uno"));
        grupo1Correcto.add(new OpcionString("dos"));

        grupo2Correcto.add(new OpcionString("tres"));
        grupo2Correcto.add(new OpcionString("cuatro"));

        grupo1.add(new OpcionString("uno"));
        grupo1.add(new OpcionString("tres"));

        grupo2.add(new OpcionString("dos"));
        grupo2.add(new OpcionString("cuatro"));

        int resultadoObtenido;
        int resultadoEsperado = 0;

        GroupChoice tipoPregunta = new GroupChoice("Grupo A", "Grupo B");
        PreguntaSimple preguntaGroupChoice = new PreguntaSimple(tipoPregunta, grupo1Correcto);

        // act
        resultadoObtenido = preguntaGroupChoice.verificarRespuesta(grupo1);

        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void test03GroupChoicePifiaTodas() {
        // arrange
        ArrayList<Opcion> grupo1Correcto = new ArrayList<Opcion>();
        ArrayList<Opcion> grupo2Correcto = new ArrayList<Opcion>();
        ArrayList<Opcion> grupo1 = new ArrayList<Opcion>();
        ArrayList<Opcion> grupo2 = new ArrayList<Opcion>();

        grupo1Correcto.add(new OpcionString("uno"));
        grupo1Correcto.add(new OpcionString("dos"));

        grupo2Correcto.add(new OpcionString("tres"));
        grupo2Correcto.add(new OpcionString("cuatro"));

        grupo2.add(new OpcionString("uno"));
        grupo2.add(new OpcionString("dos"));

        grupo1.add(new OpcionString("tres"));
        grupo1.add(new OpcionString("cuatro"));

        int resultadoObtenido;
        int resultadoEsperado = 0;

        GroupChoice tipoPregunta = new GroupChoice("Grupo A", "Grupo B");
        PreguntaSimple preguntaGroupChoice = new PreguntaSimple(tipoPregunta, grupo1Correcto);

        // act
        resultadoObtenido = preguntaGroupChoice.verificarRespuesta(grupo1);
        
        //assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}
