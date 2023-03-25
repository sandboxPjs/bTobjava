package ch5.projects;

import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        startGame();

        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        char letter;
        int number;

        do {
            letter = generateLetter();
            makeStep(letter);
            counter++;
            number = scanner.nextInt();
        } while (number != 0);

        System.out.printf("Game over! Computer has guessed your word using %d attempts", counter);
    }

    public static char generateLetter() {
        Random random = new Random();
        return (char) (random.nextInt(26) + 97); // 97 - 122
    }

    public static void startGame() {
        System.out.println("This is reverse Hangman game.");
        System.out.println("User thinks of a word and ");
        System.out.println("the computer tries to guess ");
        System.out.println("the letters in that word.");
        System.out.println();
        System.out.println("Game started!");
    }

    public static void makeStep(char letter) {
        System.out.println("Next letter: " + letter);
        System.out.print("How many letter are not guessed? ");
    }
}
