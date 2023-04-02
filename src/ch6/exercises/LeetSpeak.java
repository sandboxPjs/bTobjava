package ch6.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class LeetSpeak {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("resources/test.txt"));
        PrintStream output = new PrintStream(new File("resources/leet.txt"));
        leetSpeak(input, output);
    }

    public static void leetSpeak(Scanner input, PrintStream output) {
        // token style
        // read token
        // modify token
        while (input.hasNextLine()) {
            String line = input.nextLine();
            Scanner inputLine = new Scanner(line);
            while (inputLine.hasNext()) {
                String token = inputLine.next();
                if (token.contains("o")) {
                    token = token.replaceAll("o", "0");
                }
                if (token.contains("l")) {
                    token = token.replaceAll("l", "1");
                }
                if (token.contains("e")) {
                    token = token.replaceAll("e", "3");
                }
                if (token.contains("a")) {
                    token = token.replaceAll("a", "4");
                }
                if (token.contains("t")) {
                    token = token.replaceAll("t", "7");
                }
                if (token.charAt(token.length() - 1) == 115) {
                    token = token.substring(0, token.length() - 1) + "Z";
                }
                output.printf("(%s) ", token);
            }
            output.println();
        }
    }
}
