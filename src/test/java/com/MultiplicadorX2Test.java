package com;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------

public class MultiplicadorX2Test {
//----------------------------------------------------------------------------------------------------------------------------------------------
    @Test
    public void test01MultiplicadorX2(){
        // arrange
        int puntajeInicial = 0;
        int puntajeEsperado = 0;
        int puntajeObtenido;

        MultiplicadorX2 multiplicadorX2 = new MultiplicadorX2();

        // act
        puntajeObtenido = multiplicadorX2.multiplicar(puntajeInicial);
        //assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

//----------------------------------------------------------------------------------------------------------------------------------------------

@Test
public void test02MultiplicadorX2(){
    // arrange
    int puntajeInicial = 1;
    int puntajeEsperado = 2;
    int puntajeObtenido;

    MultiplicadorX2 multiplicadorX2 = new MultiplicadorX2();

    // act
    puntajeObtenido = multiplicadorX2.multiplicar(puntajeInicial);
    //assert
    assertEquals(puntajeEsperado, puntajeObtenido);
}

//----------------------------------------------------------------------------------------------------------------------------------------------

@Test
public void test03MultiplicadorX2(){
    // arrange
    int puntajeInicial = 12;
    int puntajeEsperado = 24;
    int puntajeObtenido;

    MultiplicadorX2 multiplicadorX2 = new MultiplicadorX2();

    // act
    puntajeObtenido = multiplicadorX2.multiplicar(puntajeInicial);
    //assert
    assertEquals(puntajeEsperado, puntajeObtenido);
}
}
