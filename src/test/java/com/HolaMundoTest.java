package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HolaMundoTest {

    @Test
    public void testSaludar() {
        HolaMundo holaMundo = new HolaMundo();
        assertEquals("Hola Mundo", holaMundo.saludar());
    }
}