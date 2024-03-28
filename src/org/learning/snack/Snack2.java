package org.learning.snack;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        String [] name = {"Alessandro", "Massimo", "Giovanni", "Marco", "Salvo"};
        String [] surname = {"Alessi", "Tiboni", "Sinibaldi", "Belotti", "Pirlo"};

        Random randomGen = new Random();

        int guestNumbers = 10;

        for (int i = 0; i < guestNumbers; i++) {

            String nameRandom = name[randomGen.nextInt(name.length)];
            String surnameRandom = surname[randomGen.nextInt(surname.length)];

            System.out.println(nameRandom + " " + surnameRandom);
        }

    }
}
