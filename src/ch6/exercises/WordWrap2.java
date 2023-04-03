package ch6.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class WordWrap2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("resources/test7.txt"));
        PrintStream output = new PrintStream(new File("resources/result.txt"));
        wordWrap2(input, output);
    }

    public static void wordWrap2(Scanner input, PrintStream output) {
        int maxLineLength = 60;
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
