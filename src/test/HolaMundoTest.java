package src.test;

import org.junit.jupiter.api.Test;

import src.HolaMundo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HolaMundoTest {

    @Test
    public void testSaludar() {
        HolaMundo holaMundo = new HolaMundo();
        assertEquals("Hola Mundo", holaMundo.saludar());
    }
}