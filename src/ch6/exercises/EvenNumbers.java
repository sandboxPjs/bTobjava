package ch6.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("resources/test.txt"));
        evenNumbers(input);
        // make Scanner
        // read the file
        // count numbers
        // calculate sum numbers
        // count even
        // calculate sum even numbers
        // calculate %
        // print result
    }

    public static void evenNumbers(Scanner input) {
        int counterNumbers = 0;
        int counterEvens = 0;
        int sumNumbers = 0;

        double evenPart = 0;
        while (input.hasNextInt()) {
            counterNumbers++;
            int number = input.nextInt();
            sumNumbers += number;
            if (number % 2 == 0) {
                counterEvens++;
            }
        }
        evenPart = 100.0 * counterEvens / counterNumbers;
        System.out.printf("%d numbers, sum = %d\n", counterNumbers, sumNumbers);
        System.out.printf("%d evens (%.2f%%)\n", counterEvens, evenPart);
    }
}
