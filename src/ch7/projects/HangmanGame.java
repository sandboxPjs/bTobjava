package ch7.projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("resources/hangman.txt"));
        Scanner console = new Scanner(System.in);
        startGame();
        String word = getRandomWord(file);
        guessWord(console, word);
    }

    public static String getRandomWord(Scanner file) {
        String word = "";
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // if file contains 100 words
        int counter = 0;
        while (file.hasNext()) {
            counter++;
            if (counter == randomNumber) {
                word = file.next();
            }
            file.next();
        }
        return word;
    }
    public static void guessWord(Scanner console, String word) {
        char[] letters = new char[word.length()];
        int empty;
        int attempts = 0;
        System.out.println("Number of letters are not guessed: " + word.length());
        do {
            char letter = askLetter(console);
            checkLetterInWord(letter, word, letters);
            empty = countEmptyPositions(letters);
            attempts++;
            System.out.println("Number of letters are not guessed: " + empty);
            System.out.println("Guessed letters: " + printCharArray(letters));
        } while(empty != 0);
        System.out.printf("Game over! You has guessed the word using %d attempts\n", attempts);
        System.out.println("Guessed word: " + printCharArray(letters));
    }

    public static int countEmptyPositions(char[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '\u0000') {
                counter++;
            }
        }
        return counter;
    }

    public static void startGame() {
        System.out.println("This is Hangman game.");
        System.out.println("Computer thinks of a word and ");
        System.out.println("the user tries to guess ");
        System.out.println("the letters in that word.");
        System.out.println();
        System.out.println("Game started!");
        System.out.println();
    }

    public static char askLetter(Scanner console) {
        System.out.print("Print letter: ");
        String letter = console.next();
        while (letter.length() > 1 || !Character.isLetter(letter.charAt(0))) {
            System.out.println("Print only one letter, please!");
            System.out.print("Print letter: ");
            letter = console.next();
        }
        return letter.toLowerCase().charAt(0);
    }

    public static void checkLetterInWord(char letter, String word, char[] letters) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (letter == c) {
                letters[i] = letter;
            }
        }
    }
    public static String printCharArray(char[] letters) {
        String word = "";
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == '\u0000') {
                word += "*";
            } else {
                word += letters[i];
            }
        }
        return word;
    }
}
