package ch7.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordLengths {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("resources/text15.txt"));
        wordLengths(input);
    }

    public static void wordLengths(Scanner input) {
        int[] data = new int[81];
        while (input.hasNext()) {
            String token = input.next();
            data[token.length()]++;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] > 0) {
                System.out.printf("%d: %d\t", i, data[i]);
                for (int j = 0; j < data[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
