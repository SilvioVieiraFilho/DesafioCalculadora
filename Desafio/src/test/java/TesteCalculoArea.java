import org.example.CalculoArea;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteCalculoArea {

    CalculoArea c = new CalculoArea();

    @Test

    public void areadoquadradodoisnumero() {

        double valor1 = 5;

        double areadoquadrado = c.aredoquadrado(valor1);

        Assertions.assertEquals(25, areadoquadrado);


    }

    @Test
    public void areaDoTrianguloDoisNumero() {

        double valor1 = 7;
        double valor2 = 8;

        double areatriangulo = c.areaTrinagulo(valor1, valor2);

        Assertions.assertEquals(28, areatriangulo);

    }

    @Test
    public void areaDoCirculoDoisNumero() {

        double valor1 = 5;

        double areadocirculo = c.areaCirculo(valor1);

        Assertions.assertEquals(78.5, areadocirculo);

    }

}
