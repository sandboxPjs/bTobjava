package ch6.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("resources/test.txt"));
        coinFlip(input);
    }

    public static void coinFlip(Scanner input) {
        while (input.hasNextLine()) {
            int hCounter = 0;
            int counter = 0;
            double part = 0.0;
            String line = input.nextLine();
            Scanner lineInput = new Scanner(line);
            while (lineInput.hasNext()) {
                String token = lineInput.next();
                if (token.equalsIgnoreCase("h")) {
                    hCounter++;
                }
                counter++;
            }
            part = 100.0 * hCounter / counter;

            // print result
            System.out.printf("%d heads (%.1f%%)\n", hCounter, part);
            if (part > 50.0) {
                System.out.println("You win!");
            }
            System.out.println();
        }
    }
}
