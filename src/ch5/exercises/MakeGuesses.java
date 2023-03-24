package ch5.exercises;

import java.util.Random;

public class MakeGuesses {
    public static void main(String[] args) {
        makeGuesses();
    }

    public static void makeGuesses() {
        Random random = new Random();
        int counter = 0;
        int number = 0;
        // make guesses until number == 48
        while (number < 48) {
            number = random.nextInt(50) + 1;
            System.out.println("guess = " + number);
            counter++;
        }
        System.out.println("total guesses = " + counter);
    }
}
