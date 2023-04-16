package com.arthur.operadores.java;

public class OperadoresLogicos {
    public static void main (String[] args) {
        // Quais os tipos de operadores lógicos?
        // && = "e", conjunção
        //|| = "ou", disjunção
        // ! = "não", negação
        // ^ = "somente se", disjunção exclusiva

        // exercício:

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        // conjunção
        System.out.println("b1 && b2 = " + (b1 && b2));
        System.out.println("b1 && b3 = " + (b1 && b3));

        // disjunção
        System.out.println("b2 || b4 = " + (b2 || b4));
        System.out.println("b1 || b2 = " + (b1 || b2 ));
    }
}
