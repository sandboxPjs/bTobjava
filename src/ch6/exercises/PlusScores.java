package ch6.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PlusScores {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("resources/test12.txt"));
        plusScores(input);
    }

    public static void plusScores(Scanner input) {
        while (input.hasNextLine()) {
            String first = input.nextLine();
            String second = input.nextLine();
            int countPlus = 0;
            for (int i = 0; i < second.length(); i++) {
                char c = second.charAt(i);
                if (c == 43) {
                    countPlus++;
                }
            }
            double part = 100.0 * countPlus / second.length();
            System.out.printf("%s: %.1f%% plus\n", first, part);
        }
    }
}
