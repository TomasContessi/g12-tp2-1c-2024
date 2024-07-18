package comTP;

import comTP.model.opcion.Opcion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OpcionTest {
    @Test
    public void test01ComparacionOpcionesCorrecta(){
        //Arrange
        String valor = "uno";
        boolean resultadoEspetado = true;
        Opcion opcion1 = new Opcion(valor);
        Opcion opcion2 = new Opcion(valor);

        //Act
        boolean resultadoObtenido = opcion1.equals(opcion2);

        //Assert
        assertEquals(resultadoEspetado, resultadoObtenido);
    }
}
