package org.learning.snack;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Scrivi una parola e ti dirò se è palindroma: ");
        String userWord = scan.nextLine().toLowerCase();

        char [] charArray = userWord.toCharArray();

        String reversWord = "";

        for (int i = charArray.length-1; i >= 0 ; i--) {

            reversWord = reversWord + charArray[i];
        }

        if (reversWord.equals(userWord)){
            System.out.println("Parola palindroma");
        } else {
            System.out.println("Parola non palindroma");
        }

        scan.close();
    }
}
