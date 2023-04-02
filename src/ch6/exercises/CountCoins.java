package ch6.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountCoins {
    public static void main(String[] args) throws FileNotFoundException {
        // make scanner
        // read tokens while has next
        // for each pair
            // read number
            // read word
            // add number to sum (change the number due to word type)
        // print result
        Scanner input = new Scanner(new File("resources/test.txt"));
        countCoins(input);
    }

    public static void countCoins(Scanner input) {
        double sum = 0.0;

        while (input.hasNext()) {
            int number = input.nextInt();
            String word = input.next();
            if ("pennies".equalsIgnoreCase(word)) {
                sum += number;
            } else if ("quarters".equalsIgnoreCase(word)) {
                sum += number * 25;
            } else if ("nickels".equalsIgnoreCase(word)) {
                sum += number * 5;
            } else if ("dimes".equalsIgnoreCase(word)) {
                sum += number * 10;
            }
        }

        System.out.printf("Total money: $%.2f", sum / 100);
    }


}
