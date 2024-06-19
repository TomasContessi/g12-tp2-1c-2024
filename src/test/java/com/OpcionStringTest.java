package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class OpcionStringTest {
    @Test
    public void test01comparacionOpcionesCorrecta(){
        // arrange
        String respuesta = "uno";
        String respuestaElegida = "uno";

        boolean resultadoEspetado = true;

        Opcion opcionGuardada = new OpcionString(respuesta);
        Opcion opcionInglesada = new OpcionString(respuestaElegida);

        // act
        boolean resultadoObtenido = opcionGuardada.verificar(opcionInglesada);
        //assert
        assertEquals(resultadoEspetado, resultadoObtenido);
    }
    @Test
    public void test02comparacionOpcionesCorrecta(){
        // arrange
        String respuesta = "uno";
        String respuestaElegida = "rabano";

        boolean resultadoEspetado = false;

        Opcion opcionGuardada = new OpcionString(respuesta);
        Opcion opcionInglesada = new OpcionString(respuestaElegida);

        // act
        boolean resultadoObtenido = opcionGuardada.verificar(opcionInglesada);
        //assert
        assertEquals(resultadoEspetado, resultadoObtenido);
    }
}
