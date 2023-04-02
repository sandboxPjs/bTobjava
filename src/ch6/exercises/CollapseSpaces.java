package ch6.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CollapseSpaces {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("resources/test.txt"));
        collapseSpaces(input);
    }

    public static void collapseSpaces(Scanner input) {
        // line and token styles
        // while there is a line
        // read line
        // create scanner
        // print tokens of that line
        // go to the next line
        while (input.hasNextLine()) {
            String line = input.nextLine();
            Scanner lineInput = new Scanner(line);
            while (lineInput.hasNext()) {
                System.out.print(lineInput.next() + " ");
            }
            System.out.println();
        }
    }
}
