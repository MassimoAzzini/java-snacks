package org.learning.snack;

public class Snack3 {
    public static void main(String[] args) {
        int [] numbers = {0, 10, 2, 10, 4, 10, 6, 10};

        int somma = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 1){
                somma += numbers[i];
            }
        }

        System.out.println("La somma dei numeri in posizione dispari è: " + somma);
    }
}
