package edu.enuch.operadores;

public class Relacionais {
    public static void main(String[] args) {
        // Operadores relacionais

        int idade = 20;
        Boolean validado = false;

        if (idade > 18) {
            validado = true;
        }

        idade = 15;

        if (idade < 18) {
            validado = false;
        }

        idade = 18;

        if (idade == 18) {
            validado = true;
        }

        if (idade >= 18) {
            validado = true;
        } else if (idade <= 17) {
            validado = false;
        }

        // Outras formas de escrever para reduzir e limpar codigo
        validado = (idade >= 18) ? true : false;
        validado = idade >= 18;
    }
}
