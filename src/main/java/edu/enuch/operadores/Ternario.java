package edu.enuch.operadores;

public class Ternario {
    public static void main(String[] args) {
        // Reduzindo IF ELSE com ternario

        int maior;
        int x = 5;
        int y = 10;

        if (x > y) {
            maior = x;
        } else {
            maior = y;
        }

        // usando ternario
        maior = (x > y) ? x : y;
    }
}
