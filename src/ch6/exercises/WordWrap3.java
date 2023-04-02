package ch6.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordWrap3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("resources/test.txt"));
        // read and prints lines
        // divide lines
        // print parts
        wordWrap3(input);
    }

    public static void wordWrap3(Scanner input) {
        // read lines while there is a line
        // for each line
        // get a length of the line
        // divide that line into the parts = 60 chars

        while (input.hasNextLine()) {
            String line = input.nextLine();
            line = line.trim();
            while (line.length() > 60) {
                String firstPart = line.substring(0,60);
                line = line.substring(60);
                // if word divided
                // get first half
                // add to the rest of the line
                if (!Character.isWhitespace(firstPart.charAt(firstPart.length() - 1)) &&
                        !Character.isWhitespace(line.charAt(0))) {
                    int letter = 0;
                    for (int i = firstPart.length() - 1; i >= 0 ; i--) {
                        if (Character.isWhitespace(firstPart.charAt(i)) && letter == 0) {
                            letter = i;
                        }
                    }
                    String firstHalf = firstPart.substring(letter + 1);
                    firstPart = firstPart.substring(0, letter);
                    line = (firstHalf + line).trim();
                }
                System.out.println(firstPart);
                line = line.trim();
            }
            System.out.println(line.trim());
        }
    }
}
