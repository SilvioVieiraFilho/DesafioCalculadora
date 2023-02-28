package org.example;

public class CalculoArea extends ItemsCalculadora {


    public double aredoquadrado(double n1) {

        n2 = 2;

        double area = Math.pow(n1, n2);

        System.out.println("A area do quadrado é: " + area + "m²");

        return area;

    }

    public double areaTrinagulo(double n1, double n2) {

        double areatri = (n1 * n2) / 2;

        System.out.println("A area do triangulo  é m² : " + areatri + "m²");

        return areatri;


    }


    public double areaCirculo(double n1) {

        n2 = 3.14;

        double caluculocirculo = Math.pow(n1, 2) * n2;


        System.out.println("valor da area do circulo é :" + caluculocirculo + "cm²");
        return caluculocirculo;


    }

}
