package com;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------

public class MultiplicadorX1Test {
//----------------------------------------------------------------------------------------------------------------------------------------------
    @Test
    public void test01MultiplicadorX1(){
        // arrange
        int puntajeInicial = 0;
        int puntajeEsperado = 0;
        int puntajeObtenido;

        MultiplicadorX1 multiplicadorX1 = new MultiplicadorX1();

        // act
        puntajeObtenido = multiplicadorX1.multiplicar(puntajeInicial);
        //assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

//----------------------------------------------------------------------------------------------------------------------------------------------

@Test
public void test02MultiplicadorX1(){
    // arrange
    int puntajeInicial = 1;
    int puntajeEsperado = 1;
    int puntajeObtenido;

    MultiplicadorX1 multiplicadorX1 = new MultiplicadorX1();

    // act
    puntajeObtenido = multiplicadorX1.multiplicar(puntajeInicial);
    //assert
    assertEquals(puntajeEsperado, puntajeObtenido);
}

//----------------------------------------------------------------------------------------------------------------------------------------------

@Test
public void test03MultiplicadorX1(){
    // arrange
    int puntajeInicial = 12;
    int puntajeEsperado = 12;
    int puntajeObtenido;

    MultiplicadorX1 multiplicadorX1 = new MultiplicadorX1();

    // act
    puntajeObtenido = multiplicadorX1.multiplicar(puntajeInicial);
    //assert
    assertEquals(puntajeEsperado, puntajeObtenido);
}
}
