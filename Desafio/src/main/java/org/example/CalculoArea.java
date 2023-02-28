package org.example;

public class CalculoArea extends ItemsCalculadora {


    public double aredoquadrado(double lado) {



        double area = Math.pow(lado, 2);

        System.out.println("A area do quadrado é: " + area + "m²");

        return area;

    }

    public double areaTrinagulo(double base, double altura) {

        double areatri = (base * altura) / 2;

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
