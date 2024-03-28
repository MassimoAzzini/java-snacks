package org.learning.snack;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci una frase: ");
        String userText = scan.nextLine().replaceAll(" ","");

        int letters = 0;
        int numeric = 0;
        int symbol = 0;

        char [] textArray = userText.toCharArray();

        for (int i = 0; i < textArray.length; i++) {
            if (Character.isLetter(textArray[i])){
                letters++;
            } else if (Character.isDigit(textArray[i])){
                numeric++;
            } else {
                symbol++;
            }
        }

        System.out.printf("%nNella tua frase ci sono: " + letters + " lettere%n");
        System.out.println("Nella tua frase ci sono: " + numeric + " numeri");
        System.out.println("Nella tua frase ci sono: " + symbol + " simboli");

        scan.close();

    }
}
