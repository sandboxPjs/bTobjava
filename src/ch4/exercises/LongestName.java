package ch4.exercises;

import java.util.Scanner;

public class LongestName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        longestName(scanner, 5);
    }

    public static void longestName(Scanner scanner, int number) {
        System.out.printf("name #1? ");
        String name = scanner.nextLine();
        int length = name.length();
        int tieCounter = 0;
        String tieMessage = "(There was a tie!)";
        for (int i = 2; i <= number; i++) {
            System.out.printf("name #%d? ", i);
            String token = scanner.nextLine();
            int tokenLength = token.length();
            if (length < tokenLength) {
                length = tokenLength;
                name = token;
                tieCounter = 0;
            } else if (length == tokenLength) {
                tieCounter++;
            }
        }
        name = name.substring(0,1).toUpperCase() + name.toLowerCase().substring(1);
        System.out.printf("%s's name is longest%n", name);
        if (tieCounter > 0) {
            System.out.println(tieMessage);
        }
    }
}
