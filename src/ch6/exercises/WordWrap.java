package ch6.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordWrap {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("resources/test.txt"));
        // read and prints lines
        // divide lines
        // print parts
        wordWrap(input);
    }

    public static void wordWrap(Scanner input) {
        // read lines while there is a line
        // for each line
        // get a length of the line
        // divide that line into the parts = 60 chars
        // print each part of the line
        while (input.hasNextLine()) {
            String line = input.nextLine();
            while (line.length() > 60) {
                System.out.println(line.substring(0,60));
                line = line.substring(60);
            }
            System.out.println(line);
        }
    }
}
