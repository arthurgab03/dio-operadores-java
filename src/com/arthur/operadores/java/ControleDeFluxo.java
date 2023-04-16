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



    }
}
