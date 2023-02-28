package org.example;

import java.text.DecimalFormat;

public class CalculoImc extends ItemsCalculadora {


    public double Calculoimc(double peso, double altura) {

        DecimalFormat df = new DecimalFormat("##.##");


        double calculoimc = peso/(altura * altura);

        System.out.println("o Valor do calculo do imc é:" + df.format(calculoimc));


        return calculoimc;

    }
}
