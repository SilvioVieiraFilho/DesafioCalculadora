package org.example;

import java.text.DecimalFormat;

public class CalculoImc extends ItemsCalculadora {


    public double Calculoimc(double n1, double n2) {

        DecimalFormat df = new DecimalFormat("##.##");


        double    calculoimc = n1/(n2 * n2);

        System.out.println("o Valor do calculo do imc é:" + df.format(calculoimc));


        return calculoimc;

    }
}
