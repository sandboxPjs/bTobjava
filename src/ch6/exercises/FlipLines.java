package ch6.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FlipLines {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("resources/test.txt"));
        flipLines(input);
        // print even number of lines +
        // print empty lines +
        // print odd number of lines +
    }

    public static void flipLines(Scanner input) {
        // while there is a line
        // get first line
        // get second line
        // print lines in reverse order
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
