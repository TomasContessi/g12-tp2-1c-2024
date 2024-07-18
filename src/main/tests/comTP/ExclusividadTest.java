package comTP;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import comTP.model.modificador.Exclusividad;

public class ExclusividadTest {
    @Test
    public void test01UnJugadorUsaExclusividadYSoloUnoAcierta(){
        //Arrange
        Exclusividad exclusividad = new Exclusividad();
        int cantidadJugadoresAciertan = 1;
        int jugadoresUsaronExclusividad = 1;
        int multiplicadorPuntosEsperados = 2;

        //Act
        int multiplicadorPuntosObtenidos = exclusividad.calcularExclusividad(jugadoresUsaronExclusividad,cantidadJugadoresAciertan);

        //Assert
        Assertions.assertEquals(multiplicadorPuntosEsperados,multiplicadorPuntosObtenidos);
    }

    @Test
    public void test02TresJugadoresUsanExclusividadYSoloUnoAcierta(){
        //Arrange
        Exclusividad exclusividad = new Exclusividad();
        int cantidadJugadoresAciertan = 1;
        int jugadoresUsaronExclusividad = 3;
        int multiplicadorPuntosEsperados = 6;

        //Act
        int multiplicadorPuntosObtenidos = exclusividad.calcularExclusividad(jugadoresUsaronExclusividad,cantidadJugadoresAciertan);

        //Assert
        Assertions.assertEquals(multiplicadorPuntosEsperados,multiplicadorPuntosObtenidos);
    }

    @Test
    public void test03UnJugadorUsaExclusividadYDosAciertan(){
        //Arrange
        Exclusividad exclusividad = new Exclusividad();
        int cantidadJugadoresAciertan = 2;
        int jugadoresUsaronExclusividad = 1;
        int multiplicadorPuntosEsperados = 0;

        //Act
        int multiplicadorPuntosObtenidos = exclusividad.calcularExclusividad(jugadoresUsaronExclusividad,cantidadJugadoresAciertan);

        //Assert
        Assertions.assertEquals(multiplicadorPuntosEsperados,multiplicadorPuntosObtenidos);
    }

    @Test
    public void test04DosJugadoresUsanExclusividadYCuatroAciertan(){
        //Arrange
        Exclusividad exclusividad = new Exclusividad();
        int cantidadJugadoresAciertan = 4;
        int jugadoresUsaronExclusividad = 2;
        int multiplicadorPuntosEsperados = 0;

        //Act
        int multiplicadorPuntosObtenidos = exclusividad.calcularExclusividad(jugadoresUsaronExclusividad,cantidadJugadoresAciertan);

        //Assert
        Assertions.assertEquals(multiplicadorPuntosEsperados,multiplicadorPuntosObtenidos);
    }
}
