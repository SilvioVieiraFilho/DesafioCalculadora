package org.example;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        CaluladoraPadrao objCalculadora = new CaluladoraPadrao();
        CalculoImc objImc = new CalculoImc();
        CalculoArea objArea = new CalculoArea();
        ItemsCalculadora obj = new ItemsCalculadora();

        System.out.println("1- Calculadora padrao");
        System.out.println("2- Calculadora IMC");
        System.out.println("3- Calculadora da area");

        System.out.println("insira o valor da calculadora que foi citada acima: ");
        obj.setValor_menu(s.nextInt());


        for (int i = 0; i < 1; ) {


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

                        System.out.println("Se caso deseja continuar digite o numero 0");
                        int n3 = s.nextInt();
                        if (n3 == 1) {

                            i++;

                        }
                        break;


                    }

                    case 2: {

                        objCalculadora.subtracao(objCalculadora.getN1(), objCalculadora.getN2());
                        System.out.println("Se caso deseja continuar digite o numero 0");
                        int n3 = s.nextInt();
                        if (n3 == 1) {

                            i++;

                        }
                        break;
                    }
                    case 3: {

                        objCalculadora.multiplicacao(objCalculadora.getN1(), objCalculadora.getN2());
                        System.out.println("Se caso deseja continuar digite o numero 0");
                        int n3 = s.nextInt();
                        if (n3 == 1) {

                            i++;

                        }
                        break;
                    }
                    case 4: {


                        if (objCalculadora.getN2() != 0) {

                            objCalculadora.divisao(objCalculadora.getN1(), objCalculadora.getN2());
                            System.out.println("Se caso deseja continuar digite o numero 0");
                            int n3 = s.nextInt();
                            if (n3 == 1) {

                                i++;

                            }
                            break;

                        }


                        obj.setMessage("erro! não é possivel realizar a divisão por 0");

                        System.out.println(obj.getMessage());
                        System.out.println("Se caso deseja continuar digite o numero 0");
                        int n3 = s.nextInt();
                        if (n3 == 1) {

                            i++;

                        }

                        break;

                    }

                    case 5: {

                        objCalculadora.potenciacao(objCalculadora.getN1(), objCalculadora.getN2());
                        System.out.println("Se caso deseja continuar digite o numero 0");
                        int n3 = s.nextInt();
                        if (n3 == 1) {

                            i++;

                        }
                        break;
                    }

                }

            }


            if (obj.getValor_menu() == 2) {


                System.out.println("Escreva o peso:");


                objImc.setN1(s.nextDouble());

                System.out.println("Escreva altura:");

                objImc.setN2(s.nextDouble());


                double valorimc = objImc.Calculoimc(objImc.getN1(), objImc.getN2());

                if (valorimc < 19) {

                    System.out.println("Abaixo do peso");
                } else {
                    if (valorimc < 25)
                        System.out.println("peso ideal");

                    else if (valorimc < 30)

                        System.out.println("Acima do Peso");

                    else if (valorimc < 35)
                        System.out.println("Obesidade Leve");

                    else
                        System.out.println("obesidade");


                }


                System.out.println("Se caso deseja continuar digite o numero 0");
                int n3 = s.nextInt();
                if (n3 == 1) {

                    i++;

                }

            }

            if (obj.getValor_menu() == 3) {


                System.out.println("1- Area do Quadrado");
                System.out.println("2- Area do Triangulo");
                System.out.println("3- Area do Circulo  ");


                System.out.println("Digite uma valor correspondente a operação:");
                objArea.setValor(s.nextInt());


                switch (objArea.getValor()) {
                    case 1: {

                        System.out.println("escreva o numero do lado do quadrado:");
                        objArea.setN1(s.nextDouble());

                        objArea.aredoquadrado(objArea.getN1());

                        System.out.println("Se caso deseja continuar digite o numero 0");
                        int n3 = s.nextInt();
                        if (n3 == 1) {

                            i++;

                        }

                        break;

                    }

                    case 2: {

                        System.out.println("escreva o numero da base do triangulo:");
                        objArea.setN1(s.nextDouble());

                        System.out.println("escreva o numero  da altura triangulo:");
                        objArea.setN2(s.nextDouble());

                        objArea.areaTrinagulo(objArea.getN1(), objArea.getN2());

                        System.out.println("Se caso deseja continuar digite o numero 0");
                        int n3 = s.nextInt();
                        if (n3 == 1) {

                            i++;

                        }

                        break;

                    }


                    case 3: {

                        System.out.println("escreva o numero  do raio do circulo:");
                        objArea.setN1(s.nextDouble());

                        objArea.areaCirculo(objArea.getN1());

                        System.out.println("Se caso deseja continuar digite o numero 0");
                        int n3 = s.nextInt();
                        if (n3 == 1) {

                            i++;

                        }
                        break;

                    }


                }


            }

            if (obj.getValor_menu() > 3) {


                System.out.println("Numero invalido por favor insira um numero correspondente a lista acima");
            }


        }


    }
}