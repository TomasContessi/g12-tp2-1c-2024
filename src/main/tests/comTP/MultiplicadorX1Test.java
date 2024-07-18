package comTP;

import comTP.model.modificador.Puntaje;
import org.junit.jupiter.api.Test;
import comTP.model.modificador.MultiplicadorX1;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicadorX1Test {
    @Test
    public void test01MultiplicadorX1() {
        //Arrange
        Puntaje puntajeInicial = new Puntaje(0);
        Puntaje puntajeEsperado = new Puntaje(0);
        Puntaje puntajeObtenido;
        MultiplicadorX1 multiplicadorX1 = new MultiplicadorX1();

        //Act
        puntajeObtenido = multiplicadorX1.multiplicar(puntajeInicial);

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

    @Test
    public void test02MultiplicadorX1() {
        //Arrange
        Puntaje puntajeInicial = new Puntaje(1);
        Puntaje puntajeEsperado = new Puntaje(1);
        Puntaje puntajeObtenido;
        MultiplicadorX1 multiplicadorX1 = new MultiplicadorX1();

        //Act
        puntajeObtenido = multiplicadorX1.multiplicar(puntajeInicial);

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

    @Test
    public void test03MultiplicadorX1(){
        //Arrange
        Puntaje puntajeInicial = new Puntaje(1);
        Puntaje puntajeEsperado = new Puntaje(1);
        Puntaje puntajeObtenido;
        MultiplicadorX1 multiplicadorX1 = new MultiplicadorX1();

        //Act
        puntajeObtenido = multiplicadorX1.multiplicar(puntajeInicial);

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }
}
