package src.test.java.com.example;

import org.junit.Test;

import src.main.java.com.example.HolaMundo;

import static org.junit.Assert.assertEquals;

public class HolaMundoTest {

    @Test
    public void testSaludar() {
        HolaMundo holaMundo = new HolaMundo();
        assertEquals("Hola Mundo", holaMundo.saludar());
    }
}