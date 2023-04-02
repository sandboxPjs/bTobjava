package ch6.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class WordWrap2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("resources/test.txt"));
        PrintStream output = new PrintStream(new File("resources/result.txt"));
        // read and prints lines
        // divide lines
        // print parts
        wordWrap2(input, output);
    }

    public static void wordWrap2(Scanner input, PrintStream output) {
        int maxLineLength = 60;
        // read lines while there is a line
        // for each line
        // get a length of the line
        // divide that line into the parts = 60 chars
        // print each part of the line
        while (input.hasNextLine()) {
            String line = input.nextLine();
            while (line.length() > maxLineLength) {
                output.println(line.substring(0,maxLineLength));
                line = line.substring(maxLineLength);
            }
            output.println(line);
        }
    }
}
