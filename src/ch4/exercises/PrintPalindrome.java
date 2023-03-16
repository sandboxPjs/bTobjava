package ch4.exercises;

import java.util.Scanner;

public class PrintPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printPalindrome(scanner);
    }

    public static void printPalindrome(Scanner scanner) {
        System.out.print("Type one or more words: ");
        String word = scanner.nextLine();
        String reverseWord = "";
        // rewrite
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord += word.charAt(i);
        }
        //  compare
        if (word.equalsIgnoreCase(reverseWord)) {
            System.out.printf("%s is a palindrome!", word);
        } else {
            System.out.printf("%s is not a palindrome.", word);
        }
    }
}
