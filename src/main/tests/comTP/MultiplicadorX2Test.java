package comTP;

import comTP.model.modificador.Puntaje;
import org.junit.jupiter.api.Test;
import comTP.model.modificador.MultiplicadorX2;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicadorX2Test {
    @Test
    public void test01MultiplicadorX2(){
        //Arrange
        Puntaje puntajeInicial = new Puntaje(0);
        Puntaje puntajeEsperado = new Puntaje(0);
        Puntaje puntajeObtenido;
        MultiplicadorX2 multiplicadorX2 = new MultiplicadorX2();

        //Act
        puntajeObtenido = multiplicadorX2.multiplicar(puntajeInicial);

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

    @Test
    public void test02MultiplicadorX2(){
        //Arrange
        Puntaje puntajeInicial = new Puntaje(1);
        Puntaje puntajeEsperado = new Puntaje(2);
        Puntaje puntajeObtenido;
        MultiplicadorX2 multiplicadorX2 = new MultiplicadorX2();

        //Act
        puntajeObtenido = multiplicadorX2.multiplicar(puntajeInicial);

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

    @Test
    public void test03MultiplicadorX2(){
        //Arrange
        Puntaje puntajeInicial = new Puntaje(12);
        Puntaje puntajeEsperado = new Puntaje(24);
        Puntaje puntajeObtenido;
        MultiplicadorX2 multiplicadorX2 = new MultiplicadorX2();

        //Act
        puntajeObtenido = multiplicadorX2.multiplicar(puntajeInicial);

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }
}
