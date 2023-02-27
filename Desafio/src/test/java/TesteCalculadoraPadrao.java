

import org.example.CaluladoraPadrao;
import org.example.ItemsCalculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteCalculadoraPadrao {

    CaluladoraPadrao c = new CaluladoraPadrao();

    @Test
    public void somadoisnumero() {


        double valor1 = 1.0;
        double valor2 = 1.0;

        double soma = c.soma(valor1, valor2);

        Assertions.assertEquals(2, soma);

    }

    @Test
    public void subtrairdoisnumeros() {


        double valor1 = 8.0;
        double valor2 = 4.0;

        double subtracao = c.subtracao(valor1, valor2);

        Assertions.assertEquals(4, subtracao);


    }

    @Test
    public void multiplicardoisnumeros() {

        double valor1 = 2.0;
        double valor2 = 2.0;

        double multiplicacao = c.multiplicacao(valor1, valor2);

        Assertions.assertEquals(4, multiplicacao);


    }

    @Test
    public void dividirdoisnumeros() {

        double valor1 = 2.0;
        double valor2 = 2.0;


        double dividir = c.divisao(valor1, valor2);

        Assertions.assertEquals(1, dividir);
    }

    @Test

    public void potencia() {

        double valor1 = 4.0;
        double valor2 = 2.0;

        double potencia = c.potenciacao(valor1, valor2);

        Assertions.assertEquals(16, potencia);

    }
}






