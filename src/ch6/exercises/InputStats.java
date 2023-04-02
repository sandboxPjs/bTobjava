package ch6.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputStats {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("resources/test.txt"));
        inputStats(input);
        // make number of lines in the file
        // make the longest line
        // make the number of tokens on each line
        // make the length of the longest token on each line
    }

    public static void inputStats(Scanner input) {
        int numberOfLines = 0;
        String longestLine = "";
        int maxLine = 0;
        while (input.hasNextLine()) {
            numberOfLines++;
            int tokens = 0;
            String line = input.nextLine();
            Scanner lineInput = new Scanner(line);
            int maxToken = 0;
            while (lineInput.hasNext()) {
                String token = lineInput.next();
                if (token.length() > maxToken) {
                    maxToken = token.length();
                }
                tokens++;
            }
            System.out.printf("Line %d has %d tokens (longest = %d)\n", numberOfLines , tokens, maxToken);
            if (line.length() > maxLine) {
                maxLine = line.length();
                longestLine = line;
            }
        }
        System.out.println("Longest line: " + longestLine);
    }
}
