package org.example;

public class CaluladoraPadrao extends ItemsCalculadora {


    private int valor;


    public CaluladoraPadrao() {

    }

    public Double soma(Double n1, Double n2) {

        Double soma = (n1 + n2);


        System.out.println("o valor do calculo da soma é: " + soma);

        return soma;
    }

    public Double subtracao(Double n1, Double n2) {

        Double subtracao = (n1 - n2);

        System.out.println("O valor do calculo da subtracao é:" + subtracao);

        return subtracao;
    }

    public Double multiplicacao(Double n1, Double n2) {

        Double multiplicacao = (n1 * n2);
        System.out.println("O valor do calculo da multiplicacao é:" + multiplicacao);
        return multiplicacao;
    }

    public Double divisao(Double n1, Double n2) {

        Double divisao = (n1 / n2);


        System.out.println("O valor do calculo da divisao é:" + divisao);
        return divisao;
    }


    public Double potenciacao(Double n1, Double n2) {


        Double potenciacaoo = Math.pow(n1, n2);

        System.out.println("O valor do calculo da potencia é:" + potenciacaoo);


        return potenciacaoo;
    }

}

