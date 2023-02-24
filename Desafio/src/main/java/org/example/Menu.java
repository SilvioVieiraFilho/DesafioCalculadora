package org.example;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        CaluladoraPadrao objCalculadora = new CaluladoraPadrao();
        CalculoImc objImc = new CalculoImc();
        CalculoArea objArea = new CalculoArea();
        ItemsCalculadora obj = new ItemsCalculadora();

        System.out.println("1- Calculadora padrão");
        System.out.println("2- Calculadora IMC");
        System.out.println("3- Calculadora da area");

        System.out.println("insira O valor que corresponde a calculadora que você queira utilizar: ");
        obj.setValor_menu(s.nextInt());


        if (obj.getValor_menu() == 1) {


            System.out.println("1- Somar");
            System.out.println("2- subtrair");
            System.out.println("3- multiplicar");
            System.out.println("4- dividir");
            System.out.println("5- potencializar");

            System.out.println("Digite uma valor correspondente a operação:");
            objCalculadora.setValor(s.nextInt());


            System.out.println("escreva o primeiro numero");


            objCalculadora.setN1(s.nextDouble());

            System.out.println("escreva o segundo numero");

            objCalculadora.setN2(s.nextDouble());


            switch (objCalculadora.getValor()) {

                case 1: {

                    objCalculadora.soma(objCalculadora.getN1(), objCalculadora.getN2());
                    break;
                }

                case 2: {

                    objCalculadora.subtracao(objCalculadora.getN1(), objCalculadora.getN2());
                    break;
                }
                case 3: {

                    objCalculadora.multiplicacao(objCalculadora.getN1(), objCalculadora.getN2());

                    break;
                }
                case 4: {


                    if (objCalculadora.getN2() != 0) {

                        objCalculadora.divisao(objCalculadora.getN1(), objCalculadora.getN2());
                        break;

                    }


                    obj.setMessage("erro! não é possivel realizar a divisão por 0");

                    System.out.println(obj.getMessage());

                    break;

                }

                case 5: {

                    objCalculadora.potenciacao(objCalculadora.getN1(), objCalculadora.getN2());
                    break;
                }

            }

        }


        if (obj.getValor_menu() == 2) {


            System.out.println("escreva o primeiro numero");


            objImc.setN1(s.nextDouble());

            System.out.println("escreva o segundo numero");

            objImc.setN2(s.nextDouble());


            objImc.Calculoimc(objImc.getN1(), objImc.getN2());

        }

        if (obj.getValor_menu() == 3) {


            System.out.println("1- Area do Quadrado");
            System.out.println("2- Area do Triangulo");
            System.out.println("3- Area do Circulo  ");


            System.out.println("Digite uma valor correspondente a operação:");
            objArea.setValor(s.nextInt());


            switch (objArea.getValor()) {
                case 1: {

                    System.out.println("esccreva o numero do lado do quadrado:");
                    objArea.setN1(s.nextDouble());

                    objArea.aredoquadrado(objArea.getN1());

                    break;

                }

                case 2: {

                    System.out.println("esccreva o numero da base do triangulo:");
                    objArea.setN1(s.nextDouble());

                    System.out.println("esccreva o numero  da altura triangulo:");
                    objArea.setN2(s.nextDouble());

                    objArea.areaTrinagulo(objArea.getN1(), objArea.getN2());

                    break;

                }


                case 3: {

                    System.out.println("esccreva o numero  do raio do circulo:");
                    objArea.setN1(s.nextDouble());

                    objArea.areaCirculo(objArea.getN1());

                }


            }


        }


    }
}