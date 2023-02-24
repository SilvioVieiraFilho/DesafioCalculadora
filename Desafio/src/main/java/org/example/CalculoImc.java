package org.example;

public class CalculoImc extends ItemsCalculadora {


    public double Calculoimc(double n1, double n2) {



        double calculoimc = n1/(n2 * n2);

        System.out.println("o Valor do calculo do imc é:" + calculoimc  );


        return calculoimc;

    }
}
