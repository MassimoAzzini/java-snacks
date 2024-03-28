package org.learning.snack;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci un numero pari compreso tra 10 e 20: ");
        int userNumber = Integer.parseInt(scan.nextLine());

        while (userNumber % 2 == 1 || userNumber < 10 || userNumber > 20){
            System.out.print("Hai sbagliato! Inserisci un numero pari compreso tra 10 e 20: ");
            userNumber = Integer.parseInt(scan.nextLine());
        }

        if (userNumber % 2 == 0){
            System.out.println("Bravo!");
        }

        scan.close();
    }
}
