package ch6.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FlipLines {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("resources/test6.txt"));
        flipLines(input);
    }

    public static void flipLines(Scanner input) {
        while (input.hasNextLine()) {
            String firstLine = input.nextLine();
            if (input.hasNextLine()) {
                String secondLine = input.nextLine();
                System.out.println(secondLine);
                System.out.println(firstLine);
            } else {
                System.out.println(firstLine);
            }
        }
    }
}
