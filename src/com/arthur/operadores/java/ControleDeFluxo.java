package com.arthur.operadores.java;

public class ControleDeFluxo {
    public static void main (String[] args){
        /* Controle de fluxo são estruturas que podem direcionar o desenrolar da execução
        de um código.

        Alguns exemplos de sistemas de controle de fluxo e seus respectivos tipos:

        - Decisão: If,If-else,switch
        - Repetição: For, while, do while
        - Interrupção: Break, continue, return
         */

        // dicas de boas práticas

        /*
        - A utilização do switch é mais adequada para valores exatos e if para expressões booleanas.
        - Evitar muitos ifs aninhados
        - Diminuir o tamanho de ifs
         */

        // exercícios

        String olhos = "verdes";

        switch (olhos){
            case "castanhos": System.out.println("Seus olhos são castanhos"); break;
            case "verdes": System.out.println("Seus olhos são " + olhos); break;
        }

        int mes = 7;

        if (mes==1){
            System.out.println("O mês é Janeiro");
        }
        else if (mes==2) {
            System.out.println("O mês é Fevereiro");
        }
        else if (mes==3) {
            System.out.println("O mês é Março");
        }
        else if (mes==4) {
            System.out.println("O mês é Abril");
        }
        else if (mes==5) {
            System.out.println("O mês é Maio");
        }
        else if (mes==6) {
            System.out.println("O mês é Junho");
        }
        else if (mes==7) {
            System.out.println("O mês é Julho");
        }
        else if (mes==8) {
            System.out.println("O mês é Agosto");
        }
        else if (mes==9) {
            System.out.println("O mês é Setembro");
        }
        else if (mes==10) {
            System.out.println("O mês é Outubro");
        }
        else if (mes==11) {
            System.out.println("O mês é Novembro");
        }
        else if (mes==12) {
            System.out.println("O mês é Dezembro");
        }
        else {
            System.out.println("Mês inexistente");
        }

        String semana = "Sexta";

        switch (semana){
            case "Domingo": System.out.println(semana + " é o primeiro dia da semana"); break;
            case "Segunda": System.out.println(semana + " é o segundo dia da semana"); break;
            case "Terça": System.out.println(semana + "  é o terceiro dia da semana"); break;
            case "Quarta": System.out.println(semana + "  é o quarto dia da semana"); break;
            case "Quinta": System.out.println(semana + "  é o quinto dia da semana"); break;
            case "Sexta": System.out.println(semana + "  é o sexto dia da semana"); break;
            case "Sábado": System.out.println(semana + "  é o sétimo dia da semana"); break;
            default: System.out.println("Inexistente");

        }


    }


}
