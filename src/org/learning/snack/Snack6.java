package org.learning.snack;

import java.util.Scanner;

public class Snack6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digita i secondi e io te li converto in ore e minuti: ");
        int inputNumber = Integer.parseInt(scan.nextLine());

        int ore = inputNumber / 60 / 60;
        int minuti = (inputNumber % 3600) / 60;
        int secondi = inputNumber % 60;

        String hh = String.format("%02d", ore);
        String mm = String.format("%02d", minuti);
        String ss = String.format("%02d", secondi);
        System.out.println(hh + ":" + mm + ":" + ss);

    }
}
