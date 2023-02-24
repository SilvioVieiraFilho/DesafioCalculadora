

import org.example.CaluladoraPadrão;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteCalculadoraPadrao {


    @Test
    public void somadoisnumero() {

        CaluladoraPadrão c = new CaluladoraPadrão();

        double valor1 = 1.0;
        double valor2 = 1.0;

        double soma = c.soma(valor1, valor2);

        Assertions.assertEquals(2, soma);

    }

}

