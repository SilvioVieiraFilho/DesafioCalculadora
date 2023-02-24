import org.example.CalculoImc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteCalculadoraImc {


    CalculoImc c = new CalculoImc();


    @Test
    public void imccomdoisnumeros() {

        double valor1 = 80;
        double valor2 = 1.80;

        double imc = c.Calculoimc(valor1, valor2);

        Assertions.assertEquals(24.691358024691358, imc);


    }

}
