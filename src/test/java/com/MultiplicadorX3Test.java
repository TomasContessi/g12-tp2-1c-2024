package com;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------

public class MultiplicadorX3Test {
//----------------------------------------------------------------------------------------------------------------------------------------------
    @Test
    public void test01MultiplicadorX3(){
        // arrange
        int puntajeInicial = 0;
        int puntajeEsperado = 0;
        int puntajeObtenido;

        MultiplicadorX3 multiplicadorX3 = new MultiplicadorX3();

        // act
        puntajeObtenido = multiplicadorX3.multiplicar(puntajeInicial);
        //assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

//----------------------------------------------------------------------------------------------------------------------------------------------

@Test
public void test02MultiplicadorX3(){
    // arrange
    int puntajeInicial = 1;
    int puntajeEsperado = 3;
    int puntajeObtenido;

    MultiplicadorX3 multiplicadorX3 = new MultiplicadorX3();

    // act
    puntajeObtenido = multiplicadorX3.multiplicar(puntajeInicial);
    //assert
    assertEquals(puntajeEsperado, puntajeObtenido);
}

//----------------------------------------------------------------------------------------------------------------------------------------------

@Test
public void test03MultiplicadorX3(){
    // arrange
    int puntajeInicial = 12;
    int puntajeEsperado = 36;
    int puntajeObtenido;

    MultiplicadorX3 multiplicadorX3 = new MultiplicadorX3();

    // act
    puntajeObtenido = multiplicadorX3.multiplicar(puntajeInicial);
    //assert
    assertEquals(puntajeEsperado, puntajeObtenido);
}
}
