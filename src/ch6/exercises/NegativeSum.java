package ch6.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NegativeSum {
    public static void main(String[] args) throws FileNotFoundException {
        // make scanner
        // read ints while exists next
        // for each int
            // count
            // add to sum
            // if sum < 0 print message
            // and change the flag
        // check flag and print message
        // return flag
        Scanner input = new Scanner(new File("resources/test.txt"));
        negativeSum(input);
    }

    public static boolean negativeSum(Scanner input) {
        boolean isSumNegative = false;
        int counter = 0;
        int sum = 0;
        while (input.hasNextInt()) {
            int number = input.nextInt();
            counter++;
            sum += number;
            if (sum < 0) {
                System.out.printf("%d after %d steps", sum, counter);
                isSumNegative = true;
            }
        }
        if (!isSumNegative) {
            System.out.println("no negative sum");
        }
        return isSumNegative;
    }
}
