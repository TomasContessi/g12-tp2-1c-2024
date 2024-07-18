package comTP;

import comTP.model.modificador.Puntaje;
import org.junit.jupiter.api.Test;
import comTP.model.modificador.MultiplicadorX3;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicadorX3Test {
    @Test
    public void test01MultiplicadorX3(){
        //Arrange
        Puntaje puntajeInicial = new Puntaje(0);
        Puntaje puntajeEsperado = new Puntaje(0);
        Puntaje puntajeObtenido;
        MultiplicadorX3 multiplicadorX3 = new MultiplicadorX3();

        //Act
        puntajeObtenido = multiplicadorX3.multiplicar(puntajeInicial);

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

    @Test
    public void test02MultiplicadorX3(){
        //Arrange
        Puntaje puntajeInicial = new Puntaje(1);
        Puntaje puntajeEsperado = new Puntaje(3);
        Puntaje puntajeObtenido;
        MultiplicadorX3 multiplicadorX3 = new MultiplicadorX3();

        //Act
        puntajeObtenido = multiplicadorX3.multiplicar(puntajeInicial);

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }

    @Test
    public void test03MultiplicadorX3(){
        //Arrange
        Puntaje puntajeInicial = new Puntaje(12);
        Puntaje puntajeEsperado = new Puntaje(36);
        Puntaje puntajeObtenido;
        MultiplicadorX3 multiplicadorX3 = new MultiplicadorX3();

        //Act
        puntajeObtenido = multiplicadorX3.multiplicar(puntajeInicial);

        //Assert
        assertEquals(puntajeEsperado, puntajeObtenido);
    }
}
