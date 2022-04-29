package org.eufranio.javaoneforall.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String valor = "02js93KAp+AS93MS39";
        int quantDigitos = 0;
        int quantLetras = 0;
        int quantSimbolos = 0;
        Character aux2 = 'o';

        for (int i = 0; i < valor.length(); i++) {
            if (Character.isDigit(valor.charAt(i))) {
                quantDigitos++;
            } else if (Character.isLetter(valor.charAt(i))) {
                quantLetras++;
            } else {
                quantSimbolos++;
            }
        }

        System.out.println("Digitos: " + quantDigitos + ", " + ((quantDigitos * 100) / valor.length()) + "%");
        System.out.println("Letras: " + quantLetras + ", " + ((quantLetras * 100) / valor.length()) + "%");
        System.out.println("Simbolos: " + quantSimbolos + ", " + ((quantSimbolos * 100) / valor.length()) + "%");

    }
}
