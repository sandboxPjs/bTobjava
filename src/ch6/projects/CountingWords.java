package ch6.projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class CountingWords {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("resources/test.txt"));
        PrintStream output = new PrintStream(new File("resources/report.txt"));
        makeReport(input, output);
    }

    public static void makeReport(Scanner input, PrintStream output) {
        int charsCounter = 0;
        int tokensCounter = 0;
        int linesCounter = 0;
        while (input.hasNextLine()) {
            String line = input.nextLine();
            Scanner lineInput = new Scanner(line);
            while (lineInput.hasNext()) {
                String token = lineInput.next();
                charsCounter += token.length();
                tokensCounter++;
            }
            linesCounter++;
        }

        output.println("Counting report");
        output.println("Lines: " + linesCounter);
        output.println("Words: " + tokensCounter);
        output.println("Characters: " + charsCounter);
    }
}
