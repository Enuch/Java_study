package edu.enuch.operadores;

public class Logicos {
    public static void main(String[] args) {
        boolean estado = true;

        //Negação
        System.out.println(!estado);
        // E lógico
        System.out.println(estado && estado);
        // OU lógico
        System.out.println(estado || estado);

        //Tabela verdade
        System.out.println(estado && estado); // true
        System.out.println(estado || estado); // true
        System.out.println(!estado && estado); // false
        System.out.println(!estado || estado); // true
        System.out.println(!estado && !estado); // false
        System.out.println(!estado || !estado); // false
        System.out.println((estado && estado) || !estado); // true
        System.out.println((estado && estado) && !estado); // false
        System.out.println((estado || estado) || !estado); // true
        System.out.println((estado || estado) && !estado); // false
    }
}
