package ch6.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("resources/test14.txt"));
        pigLatin(input);
    }
    public static void pigLatin(Scanner input) {
        while (input.hasNextLine()) {
            String line = input.nextLine();
            Scanner inputLine = new Scanner(line);
            while (inputLine.hasNext()) {
                String token = inputLine.next();
                token = token.toLowerCase();
                char c = token.charAt(0);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    token = token + "yay";
                } else {
                    token = token.substring(1) + token.charAt(0) + "ay";
                }
                if (inputLine.hasNext()) {
                    System.out.print(token + " ");
                } else {
                    System.out.print(token);
                }

            }
            System.out.println();
        }
    }
}
