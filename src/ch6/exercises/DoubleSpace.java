package ch6.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class DoubleSpace {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("resources/test.txt"));
        PrintStream output = new PrintStream(new File("resources/results.txt"));
        doubleSpace(input, output);
    }

    public static void doubleSpace(Scanner input, PrintStream output) {
        // read while there is a line
        while (input.hasNextLine()) {
            String line = input.nextLine();
            output.println(line);
            output.println();
        }
    }
}
